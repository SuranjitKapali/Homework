package hw4JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe suranjit = new AboutMe(); // Constructor initialized here

		suranjit.myName = " Suranjit Kapali "; // Variable initialized here
		suranjit.myAge = 24;
		suranjit.myApartmentRent = 1150;
		suranjit.myIncome = 70000;
		suranjit.myPhoneNumber = 9295865303l;
		suranjit.myHeight = 5.834f;
		suranjit.myGrade = 4.8124;
		suranjit.myGender = 'M';
		suranjit.myCitizen = true;

		suranjit.aboutMe(); // Methods initialized here

		AboutMe alex = new AboutMe(); // Constructor initialized here
		alex.myName = " Alex Krakovsky ";
		alex.myAge = 25;
		alex.myApartmentRent = 1500;
		alex.myIncome = 85000;
		alex.myPhoneNumber = 3154200940l; // Variable initialized here
		alex.myHeight = 5.11f;
		alex.myGrade = 5.02;
		alex.myGender = 'M';
		alex.myCitizen = true;

	}

}
