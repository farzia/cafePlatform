package com.cafe.mybatis.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class MainOrderData {
	
	private Integer restaurentID;
	private Integer orderID;
	private Integer userID;
	private Integer tableID;
	private Integer waiterID;
	private BigDecimal netAmount;
	private BigDecimal discount;
	private BigDecimal subtotal;
	private BigDecimal gst;
	private BigDecimal total;
	private Date date;
	private Time time;
	
	public Integer getRestaurentID() {
		return restaurentID;
	}
	public void setRestaurentID(Integer restaurentID) {
		this.restaurentID = restaurentID;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getTableID() {
		return tableID;
	}
	public void setTableID(Integer tableID) {
		this.tableID = tableID;
	}
	public Integer getWaiterID() {
		return waiterID;
	}
	public void setWaiterID(Integer waiterID) {
		this.waiterID = waiterID;
	}
	public BigDecimal getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getGst() {
		return gst;
	}
	public void setGst(BigDecimal gst) {
		this.gst = gst;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
