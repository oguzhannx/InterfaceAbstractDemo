package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Veritaban�na eklendi : " + customer.getFirstName());
		
	}

}
