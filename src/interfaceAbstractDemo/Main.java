package interfaceAbstractDemo;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		//BaseCustomerManager customerManager=new NeroCustomerManager();
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Eylül", "Test", LocalDate.of(1990, 1, 1), 11111111111L));
	}

}
