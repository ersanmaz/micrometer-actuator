package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingsController {

    private final GreetingsService greetingsService;

    @GetMapping("/hi")
    public String hi() {
        return greetingsService.hi();
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingsService.hello();
    }

    @GetMapping("/merhaba")
    public String merhaba() {
        return greetingsService.merhaba();
    }
}
