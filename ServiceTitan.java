import java.util.Scanner;

public class ServiceTitan {

	public static void main(String [] args) {
		Scanner in  = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		System.out.println(canReach(x1, y1, x2, y2));
	}
	// Complete the canReach function below.
	static boolean canReach(int x1, int y1, int x2, int y2) {

		boolean left = false;
		boolean right = false;
		if(x1 == x2 && y1 == y2){
		return true;
		}
		if(x1+y1<=x2) {
			left = canReach(x1+y1,y1,x2,y2);
		}if(x1+y1<=y2) {
			left = canReach(x1,x1+y1,x2,y2);
		}
		
		return left|| right;
	}
}



