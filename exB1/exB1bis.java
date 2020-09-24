
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exB1 {

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
	
		double totalPriceWithoutTVA = nbrDays * pricePerDay; 
		double totalPriceWithTVA = totalPriceWithoutTVA + (totalPriceWithoutTVA * 21/100);
		
		
		System.out.println("Course title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
		double totalPrice = ((nbrDays > 3) && priorKnowledgeRequired) ? totalPriceWithoutTVA : totalPriceWithTVA;
		System.out.println("Total price : " +totalPrice); 
	}
}