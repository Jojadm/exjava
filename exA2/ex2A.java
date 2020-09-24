
import java.util.ArrayList;
import java.util.List;

public class ex2A {

	public static void main(String[] args)  {
		String courseTitle = "Java Reskilling";
		int nbrDays = 20;
		double pricePerDay = 195.99;
		boolean priorKnowledgeRequired = false;
		List<String> instructors = new ArrayList<String>();
		
		instructors.add("Sandy");
		instructors.add("Guy");
		
		System.out.println("Course title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
	}
}