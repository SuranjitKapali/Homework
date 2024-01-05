package hw4JavaVariablesDeclared;

public class AboutMe {
	// Variable declared
	public String myName; // Variable declared
	public byte myAge;
	public short myApartmentRent;
	public int myIncome;
	public long myPhoneNumber;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean myCitizen;

	// Constructor declared here
	public AboutMe() {
		System.out.println(":--------This is all about us--------:");
	}

	// Method implemented
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nMy Income: " + myIncome + "\nMy Phone Number: " + myPhoneNumber + "\nMy Height: " + myHeight
				+ "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nMy Citizen: " + myCitizen);
	}

}
