package com.cafe.mybatis.domain;

import java.math.BigDecimal;

public class RestaurantData {
	
	private Integer restaurantID;
	private String restaurantName;
	private Integer useGst;
	private BigDecimal getRate;
	
	public Integer getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Integer restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Integer getUseGst() {
		return useGst;
	}
	public void setUseGst(Integer useGst) {
		this.useGst = useGst;
	}
	public BigDecimal getGetRate() {
		return getRate;
	}
	public void setGetRate(BigDecimal getRate) {
		this.getRate = getRate;
	}
	
	

}
