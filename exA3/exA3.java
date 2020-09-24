
import java.util.ArrayList;
import java.util.List;

public class exA3 {

	public static void main(String[] args)  {
		String courseTitle = "Java Reskilling";
		int nbrDays = 20;
		double pricePerDay = 195.99;
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