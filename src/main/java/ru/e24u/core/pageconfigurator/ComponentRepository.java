package ru.e24u.core.pageconfigurator;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.e24u.core.pageconfigurator.entity.ComponentEntity;

import java.util.UUID;

public interface ComponentRepository extends JpaRepository<ComponentEntity, UUID> {
}