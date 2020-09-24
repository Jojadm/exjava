import java.util.Scanner;

public class exB4 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your language code: ");
		String languageCode = sc.nextLine();
		
		switch (languageCode) {
			case "NL":
				System.out.println("Goeiedag!");
				break;
			case "FR":
				System.out.println("Bonjour!");
				break;
			case "EN":
				System.out.println("Good day!");
				break;
			default:
				System.out.println ("Goeiedag! Bonjour! Good day!");
		}
	}
}
		