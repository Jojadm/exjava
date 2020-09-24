public class exB3 {

	public static void main(String[] args)  {
	
		int[] integers = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int value : integers){
			sum+=value;
		}
		
		double avg = sum / (double) integers.length;
		System.out.println("The average is : " +avg);
	}
}
		