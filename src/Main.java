import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter your FirstName ");
		String FirstName = input.nextLine();

		System.out.println("Please enter your LastName ");
		String LastName = input.nextLine();

		System.out.println("Please enter your Age \"0 - 120\"");
		int Age = input.nextInt();

		input.nextLine();
		System.out.println("Please enter your Gender - \'m\' for male and " + "\'f\' for female ");
		String Gender = input.nextLine();

		System.out.println("Please enter your PN");
		String pn = input.nextLine();

		System.out.println("Please enter your Phone number");
		String Phone = input.nextLine();

		System.out.println("FirstName " + FirstName);
		System.out.println("LastName " + LastName);
		System.out.println("Gender " + Gender);
		System.out.println("Age:  " + Age);
		System.out.println("PN: " + pn);
		System.out.println("Phone number: " + Phone);

		input.close();

	}

}
