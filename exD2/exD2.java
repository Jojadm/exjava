
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

enum Label {CHEAP, OK, EXPENSIVE};

public class exD2 {

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
		List<String> content = new ArrayList<String>();
		content.add("Course title: " +courseTitle+ "Number of days: " +nbrDays+ "Price per day: " +pricePerDay+ "Prior knowledge requested : " +priorKnowledgeRequired);
		content.add("Number of instructors: " +instructors.size());
		double totalPriceToPay = totalPriceCalculation(nbrDays, pricePerDay, priorKnowledgeRequired);
		content.add("Total price (no taxes to pay) : " +totalPriceToPay);
		Label courseLabel;
		if (totalPriceToPay < 500) {
			courseLabel = Label.CHEAP;
		} else if (totalPriceToPay >= 500 && totalPriceToPay <= 1500) {
			courseLabel = Label.OK;
		} else {
			courseLabel = Label.EXPENSIVE;
		}
		content.add("This price for this course is " +courseLabel);	
		
		writeToFile(content);
		System.out.println("Ouput successfully written to file");
	}
	
	public static double totalPriceCalculation(int nbrDays, double pricePerDay, boolean priorKnowledgeRequired) {
		double totalPriceWithoutTVA = nbrDays * pricePerDay; 
		double totalPriceWithTVA = totalPriceWithoutTVA + (totalPriceWithoutTVA * 21/100);
		double totalPrice = ((nbrDays > 3) && priorKnowledgeRequired) ? totalPriceWithoutTVA : totalPriceWithTVA;
		return totalPrice;
	}
	
	public static void writeToFile(List<String> content) {
		try {
            File file = new File("outputfile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter x = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(x); 
			for (String line: content) {
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			} 
        catch (IOException e) {
        	e.printStackTrace();

        }
	}
	
}