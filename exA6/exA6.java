import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exA6 {

	public static void main(String[] args)  {
		Map<String, Integer> months = new HashMap<>();
		
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		months.put("May", 31);
		months.put("June", 30);
		months.put("July", 31);
		months.put("August", 31);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month name");
		String monthName = sc.nextLine();
		System.out.println("Please enter the day number");
		int dayNumber = Integer.parseInt(sc.nextLine());
		
		int nbrOfDaysLeft = months.get(monthName) - dayNumber;
				
		System.out.println("Still " +nbrOfDaysLeft+ " more days to go in " +monthName);
		
	}
	
}