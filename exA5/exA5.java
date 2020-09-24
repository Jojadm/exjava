
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exA5 {

	public static void main(String[] args)  {
		String courseTitle;
		int nbrDays = 0;
		double pricePerDay = 0;
		boolean priorKnowledgeRequired = false;
		List<String> instructors = new ArrayList<String>();
		
		instructors.add("Sandy");
		instructors.add("Guy");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter course title");
		courseTitle = sc.nextLine();
		System.out.println("Please enter number of days");
		nbrDays = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter price per day");
		pricePerDay = Double.parseDouble(sc.nextLine());
	
		double totalPrice = nbrDays * pricePerDay; 
		totalPrice = totalPrice + (totalPrice * 21/100);
		
		System.out.println("Course title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
		System.out.println("Total price : " +totalPrice);
	}
}