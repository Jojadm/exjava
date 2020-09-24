public class exC3 {

	public static void main(String[] args)  {
	
		int[] integers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The average is : " +calculateAvg(integers));
	}
	
	public static double calculateAvg(int[] array) {
		double sum = 0;
		for (int value : array){
			sum+=value;
		}
		double avg = sum / array.length;
		return avg;
	}
}
		