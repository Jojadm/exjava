import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Course {
	
	private String title;
	private int nbrDays;
	private double pricePerDay;
	private boolean priorKnowledgeRequired;	
	private List<String> instructors = new ArrayList<String>();
	

	public Course(String title, int nbrDays, double pricePerDay, boolean priorKnowledgeRequired) {
		this.title = title;
		this.nbrDays = nbrDays;
		this.pricePerDay = pricePerDay;
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public int getNbrDays() {
		return nbrDays;
	}

	public void setNbrDays(int nbrDays) {
		this.nbrDays = nbrDays;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public boolean isPriorKnowledgeRequired() {
		return priorKnowledgeRequired;
	}

	public void setPriorKnowledgeRequired(boolean priorKnowledgeRequired) {
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}

	public List<String> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<String> instructors) {
		this.instructors = instructors;
	}

	public void addInstructor(String instructor) {
		instructors.add(instructor);
	}
	
	public void removeInstructor(String instructor) {
		instructors.remove(instructor);
	}
	
	public double totalPriceCalculation() throws IOException {
		double totalPriceWithoutTVA = this.nbrDays * this.pricePerDay; 
		double totalPriceWithTVA = totalPriceWithoutTVA*=1.21;
		double totalPrice = ((this.nbrDays > 3) && this.priorKnowledgeRequired) ? totalPriceWithoutTVA : totalPriceWithTVA;
		return totalPrice;
	}
	
	public void printInfo() throws IOException {
		System.out.println("printinfo");
		List<String> content = new ArrayList<String>();
		content.add("Course title: " +this.title+ " Number of days: " +this.nbrDays+ " Price per day: " +this.pricePerDay+ " Prior knowledge requested : " +this.priorKnowledgeRequired);
		content.add("Number of instructors: " +this.instructors.size());
		double totalPriceToPay = totalPriceCalculation();
		content.add("Total price (no taxes to pay) : " +totalPriceToPay);
		String courseLabel;
		if (totalPriceToPay < 500) {
			courseLabel = "CHEAP";
		} else if (totalPriceToPay >= 500 && totalPriceToPay <= 1500) {
			courseLabel = "OK";
		} else {
			courseLabel = "EXPENSIVE";
		}
		content.add("This price for this course is " +courseLabel);	
		writeToFile(content);
		System.out.println("Ouput successfully written to file");
	}
	
	private void writeToFile(List<String> printLines) throws IOException {
		Path pathToFile= Paths.get("course"+this.title+".txt");
		BufferedWriter writer = Files.newBufferedWriter(pathToFile);
		for (String line : printLines) {
			System.out.println("Printing: " +line);
			writer.write(line);
			writer.newLine();
		}
		writer.close();	
	}	

}
