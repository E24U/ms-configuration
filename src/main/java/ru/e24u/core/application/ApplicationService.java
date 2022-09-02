package ru.e24u.core.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.e24u.core.application.entity.ApplicationEntity;
import ru.e24u.core.application.domain.Application;
import ru.e24u.core.application.domain.ApplicationType;
import ru.e24u.core.pageconfigurator.PageService;

import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository repository;

    private final PageService pageService;

    public Application application(ApplicationType applicationType) {
        ApplicationEntity app = repository.findAll().stream()
                                          .filter(it -> applicationType.equals(it.getType())).findFirst()
                                          .orElseThrow();
        return new Application(app.getId(), app.getTitle(), pageService.pages(app.getId()));
    }
}