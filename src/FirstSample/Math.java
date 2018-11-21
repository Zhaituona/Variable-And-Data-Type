package FirstSample;

public class Math {

	public static void main(String[] args) {
		double x = 4;
		double y = Math.sqrt(x);// sqrt() is static method , we can directly use without creating an object
		double z = Math.min(2,3);
		
		System.out.println(y);// this is System.out is an object we call println() method by this object .

	}

	private static double min(int i, int j) {
		
		return 0;
	}

	private static double sqrt(double x) {
		
		return 0;
	}

}
