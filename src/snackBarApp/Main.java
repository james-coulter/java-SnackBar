package snackBarApp;

public class Main {

	private static void workWithData(){
		// System.out.println("Main Initial Compile Working!");

	//INSTANTIATION OF OBJECTS

		// (String name, double cashOnHand)
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		// (String name)
		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		//(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 24, 2.75, drink.getId());

	//PROCESSING

		var quantityOfItems = 3;
		jane.buySnack(quantityOfItems, soda.getCost());
		soda.buySnackQuantity(quantityOfItems);
		System.out.println("Customer 1 cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + soda.getQuantity());

		quantityOfItems = 1;
		jane.buySnack(quantityOfItems, pretzel.getCost());
		pretzel.buySnackQuantity(quantityOfItems);
		System.out.println("Customer 1 cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

		quantityOfItems = 2;
		bob.buySnack(quantityOfItems, soda.getCost());
		soda.buySnackQuantity(quantityOfItems);
		System.out.println("Customer 1 cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of snack 4 is " + soda.getQuantity());
	}

	public static void main(String[] args) {
		workWithData();
	}
}