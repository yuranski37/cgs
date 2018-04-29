package org.cgs.service;

import java.time.ZoneOffset;

public interface ConversationService {
    String constructGreeting(String cityName);
    String constructGreeting(String cityName, String zoneId);
}
