package com.github.agav.fitbot.service;

import com.pengrad.telegrambot.model.Update;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FitBotService {
    public void handleUpdate(Update update) {
        log.info("Handling update {}", update);
    }
}
