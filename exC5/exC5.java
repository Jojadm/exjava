
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Label {CHEAP, OK, EXPENSIVE};

public class exC5 {

	public static void main(String[] args)  {
		String courseTitle;
		int nbrDays = 0;
		double pricePerDay = 0;
		boolean priorKnowledgeRequired = true;
		List<String> instructors = new ArrayList<String>();
		instructors.add("Sandy");
		instructors.add("Guy");
		boolean correctType = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter course title");
		courseTitle = sc.nextLine();
		do {	
			System.out.println("Please enter number of days");
			try {
				nbrDays = Integer.parseInt(sc.nextLine());
				correctType = true;
			} catch (NumberFormatException e) {
				System.out.println("Not a correct type is entered. Try again.");
			}
		}
		while (!correctType);
		correctType=false;
		do {	
			System.out.println("Please enter price per day");
			try {
				pricePerDay = Double.parseDouble(sc.nextLine());
				correctType = true;
			} catch (NumberFormatException e) {
				System.out.println("Not a correct type is entered. Try again.");
			}
		}
		while (!correctType);
	
		printInfo(courseTitle, nbrDays, pricePerDay, priorKnowledgeRequired, instructors);
	}
	
	public static void printInfo(String courseTitle, int nbrDays, double pricePerDay, boolean priorKnowledgeRequired, List<String> instructors) {
		System.out.println("\nCourse title: " +courseTitle+ "\nNumber of days: " +nbrDays+ "\nPrice per day: " +pricePerDay+ "\nPrior knowledge requested : " +priorKnowledgeRequired);
		System.out.println("Number of instructors: " +instructors.size());
		double totalPriceToPay = totalPriceCalculation(nbrDays, pricePerDay, priorKnowledgeRequired);
		System.out.println("Total price (no taxes to pay) : " +totalPriceToPay);
		Label courseLabel;
		if (totalPriceToPay < 500) {
			courseLabel = Label.CHEAP;
		} else if (totalPriceToPay >= 500 && totalPriceToPay <= 1500) {
			courseLabel = Label.OK;
		} else {
			courseLabel = Label.EXPENSIVE;
		}
		System.out.println("This price for this course is " +courseLabel);		
	}
	
	public static double totalPriceCalculation(int nbrDays, double pricePerDay, boolean priorKnowledgeRequired) {
		double totalPriceWithoutTVA = nbrDays * pricePerDay; 
		double totalPriceWithTVA = totalPriceWithoutTVA + (totalPriceWithoutTVA * 21/100);
		double totalPrice = ((nbrDays > 3) && priorKnowledgeRequired) ? totalPriceWithoutTVA : totalPriceWithTVA;
		return totalPrice;
	}
}