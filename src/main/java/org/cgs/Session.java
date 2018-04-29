package org.cgs;

import org.cgs.service.CityTimeZoneService;
import org.cgs.service.ConversationService;
import org.cgs.service.impl.CityTimeZoneServiceImpl;
import org.cgs.service.impl.ConversationServiceImpl;

import java.io.Console;
import java.util.Scanner;

/**
 * Этот класс содержит базовые настройки сеанса приложения
 * Меседж провайдер
 * Контекст (экземпляры сервисов)
 *
 */
public class Session {
    private static Session instance;

    private final CityTimeZoneService cityTimeZoneService;
    private final ConversationService conversationService;


    private Session(CityTimeZoneService cityTimeZoneService, ConversationService conversationService) {
        this.cityTimeZoneService = cityTimeZoneService;
        this.conversationService = conversationService;
    }

    public static Session getInstance()
    {
        if (instance == null) {
            CityTimeZoneService cityTimeZoneService = new CityTimeZoneServiceImpl();
            ConversationService conversationService = new ConversationServiceImpl();
            instance = new Session(cityTimeZoneService, conversationService);
        }
        return instance;
    }

    public void start()
    {
        while (true)
        {
            Console console = System.console();
            System.out.println("");
            /**

             */
        }
    }
}
