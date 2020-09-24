
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Label {CHEAP, OK, EXPENSIVE};

public class exB2 {

	public static void main(String[] args)  {
		String courseTitle;
		int nbrDays = 0;
		double pricePerDay = 0;
		boolean priorKnowledgeRequired = true;
		List<String> instructors = new ArrayList<String>();
		
		double totalPriceToPay = 0;
		Label courseLabel;
		
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
		
		
		System.out.println("\nCourse title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
		
		if (nbrDays > 3 && priorKnowledgeRequired) {
			System.out.println("\nTotal price (no taxes to pay) : " +totalPriceWithoutTVA); 
			totalPriceToPay = totalPriceWithoutTVA;
		} else {
			System.out.println("\nTotal price : " +totalPriceWithTVA);
			totalPriceToPay = totalPriceWithTVA;
		}
		
		if (totalPriceToPay < 500) {
			courseLabel = Label.CHEAP;
		} else if (totalPriceToPay >= 500 && totalPriceToPay <= 1500) {
			courseLabel = Label.OK;
		} else {
			courseLabel = Label.EXPENSIVE;
		}
		
		System.out.println("\nThis price for this course is " +courseLabel);
	
	}
}