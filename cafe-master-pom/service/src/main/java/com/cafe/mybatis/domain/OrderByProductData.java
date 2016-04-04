package com.cafe.mybatis.domain;

import java.math.BigDecimal;

public class OrderByProductData {
	
	private Integer orderByProductID;
	private Integer orderID;
	private Integer productID;
	private Integer quantity;
	private BigDecimal price;
	
	public Integer getOrderByProductID() {
		return orderByProductID;
	}
	public void setOrderByProductID(Integer orderByProductID) {
		this.orderByProductID = orderByProductID;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}
