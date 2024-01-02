package hw6Methods;

public class FullName {

	public String fullName(String fName, String lName) {

		System.out.println("Family Member: " + fName + " " + lName);
		return null;

	}

	public static void main(String[] args) {
		FullName fullName = new FullName();
		String familyMember1 = fullName.fullName("Akash", "Kapali");
		String familyMember2 = fullName.fullName("Arjun", "Kapali");
		String familyMember3 = fullName.fullName("Arun", "Kapali");

	}

}
