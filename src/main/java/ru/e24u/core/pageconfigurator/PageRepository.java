package ru.e24u.core.pageconfigurator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.e24u.core.pageconfigurator.entity.PageEntity;

import java.util.UUID;

public interface PageRepository extends JpaRepository<PageEntity, UUID> {
}