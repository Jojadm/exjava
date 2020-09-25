import java.io.IOException;
public class exF1 {

	public static void main(String[] args)  {
				
		Instructor instr1 = new Instructor("Donald", "Duck", 35, 23, 1500);
		Instructor instr2 = new Instructor("Daisy", "Duck", 24, 23, 1400);
		
		try {
			instr1.printSalaryHistory();
			instr2.printSalaryHistory();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}