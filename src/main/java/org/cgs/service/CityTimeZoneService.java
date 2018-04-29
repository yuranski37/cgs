package org.cgs.service;

import java.time.ZoneOffset;

public interface CityTimeZoneService {
    ZoneOffset determineByCity(String cityName);
}
