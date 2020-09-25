import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class exE1 {

	public static void main(String[] args)  {
		boolean correctType=false;
		int currentAge=0, startingAge=0;
		double startingSalary=0;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		do {	
			System.out.println("Please enter your age");
			try {
				currentAge = Integer.parseInt(sc.nextLine());
				correctType = true;
			} catch (NumberFormatException e) {
				System.out.println("Not a correct type is entered. Try again.");
			}
		}
		while (!correctType);
		correctType=false;
		do {	
			System.out.println("Please enter your starting age at ABIS");
			try {
				startingAge = Integer.parseInt(sc.nextLine());
				correctType = true;
			} catch (NumberFormatException e) {
				System.out.println("Not a correct type is entered. Try again.");
			}
		}
		while (!correctType);
		correctType=false;
		do {	
			System.out.println("Please enter your starting salary");
			try {
				startingSalary = Double.parseDouble(sc.nextLine());
				correctType = true;
			} catch (NumberFormatException e) {
				System.out.println("Not a correct type is entered. Try again.");
			}
		}
		while (!correctType);
		
		int seniority = currentAge-startingAge;		
		List<String> printLines = new ArrayList<>();
		printSalaryHistory(printLines, name, currentAge, startingAge, startingSalary, seniority);
	}
	
	public static void printSalaryHistory (List<String> printLines, String name, int currentAge, int startingAge, double salary, int seniority) {
		
		printLines.add("Salary of " +name+ " at " +startingAge+ " is " +salary);
		System.out.println("Salary of " +name+ " at " +startingAge+ " is " +salary);
		salary*=1.03;
		startingAge+=5;
		currentAge+=5;
		seniority+=5;
		if ((currentAge <= 65) && (seniority <= 35)) {
			printSalaryHistory(printLines, name, currentAge, startingAge, salary, seniority);
		} else {
			printLines.add("Maximum salary reached");
			writeToFile(printLines);
		}
	}
	
	public static void writeToFile(List<String> printLines) {
		Path pathToFile= Paths.get("salaryhistory.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
			for (String line : printLines) {
				System.out.println("Printing: " +line);
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}