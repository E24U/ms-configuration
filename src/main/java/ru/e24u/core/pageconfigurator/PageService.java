package ru.e24u.core.pageconfigurator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.e24u.core.pageconfigurator.domain.Component;
import ru.e24u.core.pageconfigurator.domain.Page;
import ru.e24u.core.pageconfigurator.entity.PageComponentEntity;
import ru.e24u.core.pageconfigurator.entity.PageEntity;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PageService {

    private final PageRepository pageRepository;
    private final ComponentRepository componentRepository;
    private final PageComponentRepository pageComponentRepository;

    public Collection<Page> pages(UUID applicationId) {
        List<PageEntity> pageEntities = pageRepository.findAll().stream()
                                                      .filter(it -> applicationId.equals(it.getApplicationId()))
                                                      .toList();
        List<UUID> pageIds = pageEntities.stream().map(PageEntity::getId).toList();
        List<UUID> componentIds = pageComponentRepository.findAllById(pageIds).stream()
                                                         .map(PageComponentEntity::getComponentId).toList();
        Collection<Component> components = componentRepository.findAllById(componentIds).stream()
                                                              .map(it -> new Component(it.getId(), it.getName()))
                                                              .toList();
        return pageRepository.findAll().stream()
                             .filter(it -> applicationId.equals(it.getApplicationId()))
                             .map(it -> new Page(it.getId(), it.getTitle(), components)).toList();
    }
}