package com.github.agav.fitbot.service;

import com.pengrad.telegrambot.model.Update;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultFitBotService implements FitBotService {
    @Override
    public void handleUpdate(Update update) {
        log.info("Handling update {}", update);
    }
}
