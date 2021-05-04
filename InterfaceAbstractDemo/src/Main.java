import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.BaseCustomerManager;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		//Customer customer = new Customer(1, "asda", "asdasd", new Date(2000, 10, 4), "37018041374");
		BaseCustomerManager customer = new StarbucksCustomerManager(new MernisServiceAdapter());
		customer.add(new Customer(1, "Oðuzhan", "Öztürk", new Date(2000, 10, 4), "37018041374"));
	}

}
