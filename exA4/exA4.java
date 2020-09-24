
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exA4 {

	public static void main(String[] args)  {
		String courseTitle = args[0];
		int nbrDays = Integer.parseInt(args[1]);
		double pricePerDay = Double.parseDouble(args[2]);
		boolean priorKnowledgeRequired = false;
		List<String> instructors = new ArrayList<String>();
		
		instructors.add("Sandy");
		instructors.add("Guy");
	
		double totalPrice = nbrDays * pricePerDay; 
		totalPrice = totalPrice + (totalPrice * 21/100);
		
		System.out.println("Course title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
		System.out.println("Total price : " +totalPrice);
	}
}