package ru.e24u.core.pageconfigurator.domain;

import java.util.Collection;
import java.util.UUID;

public record Page(UUID id, String title, Collection<Component> components) {
}
