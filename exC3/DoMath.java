public class DoMath {
	
	public static double calculateAvg(int[] array) {
		double sum = 0;
		for (int value : array){
			sum+=value;
		}
		double avg = sum / array.length;
		return avg;
	}
}