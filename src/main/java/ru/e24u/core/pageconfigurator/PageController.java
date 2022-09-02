package ru.e24u.core.pageconfigurator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class PageController {

    private final PageService pageService;

    @GetMapping("/pages")
    public List<String> pages(@RequestParam String type) {
        return List.of();
    }
}