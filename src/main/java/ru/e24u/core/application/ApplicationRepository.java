package ru.e24u.core.application;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.e24u.core.application.entity.ApplicationEntity;

import java.util.UUID;

public interface ApplicationRepository extends JpaRepository<ApplicationEntity, UUID> {
}
