import java.io.IOException;

public class exF1 {

	public static void main(String[] args) {

		Course co1 = new Course("Java", 2, 300, false);
		co1.addInstructor("Donald");
		co1.addInstructor("Daisy");
		Course co2 = new Course("Python", 3, 400, true);
		co2.addInstructor("Frans");
		Course co3 = new Course("Cobol", 6, 500, false);
		co2.addInstructor("Jarno");
		co2.addInstructor("Jolien");
		
	
		Course[] courses = { co1, co2, co3 };

		try {
			for (Course c : courses) {
				c.printInfo();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}