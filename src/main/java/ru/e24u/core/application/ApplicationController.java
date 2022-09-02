package ru.e24u.core.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.e24u.core.application.domain.Application;
import ru.e24u.core.application.domain.ApplicationType;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @GetMapping("/application/{applicationType}")
    public Application pages(@PathVariable ApplicationType applicationType) {
        return applicationService.application(applicationType);
    }
}