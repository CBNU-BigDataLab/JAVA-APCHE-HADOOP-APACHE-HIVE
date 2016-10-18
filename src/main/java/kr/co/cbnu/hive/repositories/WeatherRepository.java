package kr.co.cbnu.hive.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.co.cbnu.hive.entities.Weather;

@Repository
public interface WeatherRepository {

	@Select("SELECT wban, datetime, stationtype, stationtype, year, month FROM weather WHERE month ='02' LIMIT 1000")
	@Results({
		@Result(property="wban", column="wban"),
		@Result(property="datetime", column="datetime"),
		@Result(property="stationType", column="stationtype"),
		@Result(property="skyCondition", column="stationtype"),
		@Result(property="year", column="year"),
		@Result(property="month", column="month")
	})
	public List<Weather> findAll();
}
