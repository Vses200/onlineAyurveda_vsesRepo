package com.g7.oam.repository;

import java.util.List;

import com.g7.oam.entities.Customer;
import com.g7.oam.exception.CustomerNotFoundException;

public interface ICustomerRepository {

	public Customer addCustomer(Customer Customer);

	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;

	public Customer viewCustomer(Customer Customer) throws CustomerNotFoundException;

	public Customer deleteCustomer(int customerId) throws CustomerNotFoundException;

	public List<Customer> showAllCustomers();

}
