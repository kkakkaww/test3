package test3;
import java.util.Scanner;
public class oo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point:");
		float x = input.nextFloat();
	    float y = input.nextFloat();
	    if (x>=0&&y>=0&&(y<=(-0.5)*x+100)) {
	    	System.out.println("Point ("+ x +","+ y +") is in the triangle");
	    }
	    else {
	    	System.out.println("Point ("+ x +","+ y +") is not in the triangle");
	    }
	}

}
