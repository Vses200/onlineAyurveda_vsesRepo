package com.g7.oam.entities;

public enum OrderStatus {

	Placed("Order was successfully placed"), Dispatched("Out for delivery"),
	Delayed("Order has been delayed due to unforeseen circumstances"), Delivered("Order was successfully delivered");

	String name;

	OrderStatus(String name) {
		this.name = name;
	}

}
