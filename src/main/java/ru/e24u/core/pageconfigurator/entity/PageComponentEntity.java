package ru.e24u.core.pageconfigurator.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "page_component")
public final class PageComponentEntity {
    @Id
    private UUID pageId;
    private UUID componentId;
}