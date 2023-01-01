package Day3LineComparision;

public class UC1_LineDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//point 1
		double x1 = 2;
		double y1 = 2;
				
		//point 2
		double x2 = 5;
		double y2 = 5;
		
		// calculate distance between two points
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        System.out.println("Dstance between two points :" + distance);
 }
}


