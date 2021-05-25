package com.g7.oam.repository;

import java.time.LocalDate;
import java.util.List;
import com.g7.oam.entities.Customer;
import com.g7.oam.entities.Order;
import com.g7.oam.exception.CustomerNotFoundException;
import com.g7.oam.exception.MedicineNotFoundException;
import com.g7.oam.exception.OrderNotFoundException;

public interface IOrderRepository {

	public Order addOrder(Order order);

	public Order viewOrder(Order order) throws OrderNotFoundException;

	public Order updateOrder(Order order) throws OrderNotFoundException;

	public Order cancelOrder(int id) throws OrderNotFoundException;

	public List<Order> showAllOrders(int medicineid) throws MedicineNotFoundException;

	public List<Order> showAllOrders(Customer customer) throws CustomerNotFoundException;

	public List<Order> showAllOrders(LocalDate date);

	public double calculateTotalCost(int orderid) throws OrderNotFoundException;

}
