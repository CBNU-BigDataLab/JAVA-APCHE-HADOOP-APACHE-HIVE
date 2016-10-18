package kr.co.cbnu.hive.services;

import java.util.List;

import kr.co.cbnu.hive.entities.Weather;

public interface WeatherService {

	public List<Weather> findAll();
}
