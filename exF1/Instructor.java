import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Instructor {
	private String name;
	private String lastName;
	private int age;
	private int startAge;
	private double startSalary;
	
	public Instructor(String name, String lastName, int age, int startAge, double startSalary) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.startAge=startAge;
		this.startSalary=startSalary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	} 
	
	public int getStartAge() {
		return this.startAge;
	}
	
	public double getStartSalary() {
		return this.startSalary;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setStartAge(int startAge) {
		this.startAge=startAge;
	}
	
	public void setStartSalary(double startSalary) {
		this.startSalary=startSalary;
	}
	
	public void printSalaryHistory () throws IOException {
		double calcSalary=this.startSalary;
		int seniority=this.age-this.startAge;
		int calcAge = this.startAge;
		List<String> printLines = new ArrayList<String>();
				
		while ((calcAge <= 65) && (seniority <= 35)) {
			printLines.add("Salary of " +name+ " " +lastName+ " at " +calcAge+ " is " +calcSalary);
			calcSalary*=1.03;
			calcAge+=5;
			seniority+=5;
		}
		printLines.add("Maximum salary reached");
		writeToFile(printLines);
	}

	private static void writeToFile(List<String> printLines) throws IOException {
		Path pathToFile= Paths.get("salaryhistory.txt");
		BufferedWriter writer = Files.newBufferedWriter(pathToFile);
		for (String line : printLines) {
			System.out.println("Printing: " +line);
			writer.write(line);
			writer.newLine();
		}
	}
}
	