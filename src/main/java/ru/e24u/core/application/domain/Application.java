package ru.e24u.core.application.domain;

import ru.e24u.core.pageconfigurator.domain.Page;

import java.util.Collection;
import java.util.UUID;

public record Application(UUID id, String title, Collection<Page> pages) {
}
