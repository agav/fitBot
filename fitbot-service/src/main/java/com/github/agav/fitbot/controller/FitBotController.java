package com.github.agav.fitbot.controller;


import com.github.agav.fitbot.service.FitBotService;
import com.pengrad.telegrambot.model.Update;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class FitBotController {

    private final FitBotService service;

    @GetMapping("/hello")
    public String echo(@RequestParam("user") String user) {
        return "hello " + user;
    }

    @PostMapping("/webhook")
    public void webhook(@RequestBody Update update) {
        service.handleUpdate(update);
    }

}
