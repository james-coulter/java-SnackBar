package snackBarApp;

public class Snack {

	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId){

		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return cost;
	}

	public int getVendingMachineId() {
		return vendingMachineId;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	//other methods

	public void setQuantity(int quantity) {
		this.quantity += quantity;
	}

	public void buySnack(int numToBuy) {
		this.quantity -= quantity;
	}

	public double getTotal(int quantity) {
		return (this.cost) * quantity;
	}

	@Override
	public String toString() {
		String returnString = "Name: " + name + "\n" + "Vending Machine Id: " + vendingMachineId + "\n" + "Total Quantity " + quantity + "\n" + "Total Cost of Quantity: " + quantity*cost + "\n";
		return returnString;
	}

}




