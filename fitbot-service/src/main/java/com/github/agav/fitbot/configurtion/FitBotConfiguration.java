package com.github.agav.fitbot.configurtion;

import com.github.agav.fitbot.service.DefaultFitBotService;
import com.github.agav.fitbot.service.FitBotService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FitBotConfiguration {

    @Bean
    FitBotService fitBotService() {
        return new DefaultFitBotService();
    }

}
