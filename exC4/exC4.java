import java.util.Scanner;

public class exC4{

	public static void main(String[] args) {
		welcome();
	}
	
	public static void welcome() {
		System.out.println("Welcome!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be greeted again ? (Y/N)");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Y")){
			welcome();
		}
	}		
}
	