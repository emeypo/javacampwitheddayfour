package entities;
import java.time.LocalDate;


import abstracts.CustomerService;
import abstracts.Entity;


public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private long tax;
	
	public Customer() {}
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, long tax) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.tax = tax;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long gettax() {
		return this.tax;
	}
	public void settax(long tax) {
		tax = this.tax;
	}

}
