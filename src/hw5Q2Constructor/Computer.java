package hw5Q2Constructor;

public class Computer {
	public String brand; // Variable declared here
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() { // Default constructor declared
		System.out.println(":---This is from the default Constructor of Computer Class----:");

	}

	// Parameterized constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating System: " + operatingSystem
				+ "\nPrice: " + price + "" + "\nGrade:" + grade + "\nMade In The USA? Ans:  " + madeInUSA);
	}

}
