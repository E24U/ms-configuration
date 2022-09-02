package ru.e24u.core.pageconfigurator;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.e24u.core.pageconfigurator.entity.PageComponentEntity;

import java.util.UUID;

public interface PageComponentRepository extends JpaRepository<PageComponentEntity, UUID> {
}