package test3;
import java.util.Scanner;
public class uu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point:");
		 float x = input.nextFloat();
	     float y = input.nextFloat();
	     if ((x>=-5&&x<=5)&&(y>=-2.5&&y<=2.5)) {
	    	 System.out.println("Point ("+ x +","+ y +") is in the rectangle");
	     }
	     else {
	    	 System.out.println("Point ("+ x +","+ y +") is not in the rectangle");
	     }
	}

}
