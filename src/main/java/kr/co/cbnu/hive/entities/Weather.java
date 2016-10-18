package kr.co.cbnu.hive.entities;

public class Weather {
	
	private String wban;
	private String datetime;
	private String stationType;
	private String skyCondition;
	private int year;
	private String month;
	
	public String getWban() {
		return wban;
	}
	public void setWban(String wban) {
		this.wban = wban;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getStationType() {
		return stationType;
	}
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}
	public String getSkyCondition() {
		return skyCondition;
	}
	public void setSkyCondition(String skyCondition) {
		this.skyCondition = skyCondition;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
}
