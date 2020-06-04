package com.example;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Random;

@Slf4j
@Service
public class GreetingsService {

    @Timed("greetings.hi")
    public String hi() {
        return "Hi there";
    }

    @Timed("greetings.hello")
    public String hello() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.ISO_8859_1);
        String s = "Hello " + generatedString;
        log.info("Greeting: {}", s);
        return s;
    }

    @Timed("greetings.merhaba")
    public String merhaba() {
        return "Merhaba!";
    }
}
