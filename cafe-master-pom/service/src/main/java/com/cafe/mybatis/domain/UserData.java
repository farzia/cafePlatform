package com.cafe.mybatis.domain;

/**
 * Created by raj on 3/19/2016.
 */
public class UserData {

    private Integer userID;
    private Integer restaurantID;
    private Integer level;
    private String name;
    private String username;
    private String password;
    
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Integer restaurantID) {
		this.restaurantID = restaurantID;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
       
    
}
    

