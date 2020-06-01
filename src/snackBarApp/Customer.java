package snackBarApp;

public class Customer {

	private int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {

		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	//setters

	public void setName(String name) {
		this.name = name;
	}

	//other methods
	public void addCash(double addCash) {
		this.cashOnHand += addCash;
	}

	public void buySnack(int snackQuantity, double snackCost) {
		this.cashOnHand -= snackCost * snackQuantity;
	}
}