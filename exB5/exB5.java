import java.util.Scanner;

public class exB5{

	public static void main(String[] args)  {
		String answer;
		do {
			System.out.println("Welcome!");
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to be greeted again ? (Y/N)");
			answer = sc.nextLine();
		} while (answer.equals("Y"));
	}
}
	