package test3;
import java.util.Scanner;
public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width and height:");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float w1 = input.nextFloat();
        float h1 = input.nextFloat();
        System.out.print("Enter r2's center x-, y-coordinates, width and height:");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float w2 = input.nextFloat();
        float h2 = input.nextFloat();
        if ((x2-w2/2>x1-w1/2)&&(x2+w2/2<x1+w1/2)&&(y2-h2/2>y1-h1/2)&&(y2+h2/2<y1+h1/2)) {
        	System.out.println("r2 is inside r1");
        }
        else if ((Math.abs(y1-y2)>=h1/2+h2/2)||(Math.abs(x1-x2)>=w1/2+w2/2)) {
        	System.out.println("r2 does not overlap r1");
        }
        else{
        	System.out.println("r2 overlap r1");
        }
	}

}
