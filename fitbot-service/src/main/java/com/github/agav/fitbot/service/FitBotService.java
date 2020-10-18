package com.github.agav.fitbot.service;

import com.pengrad.telegrambot.model.Update;

public interface FitBotService {
    void handleUpdate(Update update);
}
