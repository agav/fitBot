package com.github.agav.fitbot.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/service", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class FitBotController {

    @GetMapping("hello")
    public String echo(@RequestParam("user") String user) {
        return "hello " + user;
    }

}
