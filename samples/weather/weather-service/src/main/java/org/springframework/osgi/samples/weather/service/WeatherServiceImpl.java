/*
 * Copyright 2006-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.springframework.osgi.samples.weather.service;

import java.util.Date;

import org.springframework.osgi.samples.weather.dao.WeatherDao;
import org.springframework.osgi.samples.weather.dao.WeatherData;

/**
 */
public class WeatherServiceImpl implements WeatherService {

  private WeatherDao weatherDao;
  
  public void setWeatherDao(WeatherDao weatherDao) {
    this.weatherDao = weatherDao;
  }

  public Double getHistoricalHigh(Date date) {
    WeatherData wd = weatherDao.find(date);
    if (wd != null)
      return new Double(wd.getHigh());
    return null;
  }
}
