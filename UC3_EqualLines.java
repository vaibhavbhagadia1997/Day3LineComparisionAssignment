package Day3LineComparision;

public class UC3_EqualLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		   double Fx1 = 1;
	        double Fy1 = 1;

	        double Fx2 = 5;
	        double Fy2 = 5;

	        double Sx1 = 1;
	        double Sy1 = 1;

	        double Sx2 = 5;
	        double Sy2 = 5;

	        double distance1 = Math.sqrt((Fx2 - Fx1) * (Fx2 - Fx1) + (Fy2 - Fy1) * (Fy2 - Fy1));
	        double distance2 = Math.sqrt((Sx2 - Sx1) * (Sx2 - Sx1) + (Sy2 - Sy1) * (Sy2 - Sy1));
	        if (distance1 == distance2)
	            System.out.println("lines are equal");
	    }

	}
	