package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
	boolean isRealPerson(Customer customer);
}
