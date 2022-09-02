package ru.e24u.core.application.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.e24u.core.application.domain.ApplicationType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "application")
public final class ApplicationEntity {
    @Id
    private UUID id;

    private String title;

    @Enumerated(EnumType.STRING)
    private ApplicationType type;
}
