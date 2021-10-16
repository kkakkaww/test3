package test3;
import java.util.Scanner;
public class last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, and radius:");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float r1 = input.nextFloat();
        System.out.print("Enter r2's center x-, y-coordinates, and radius:");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float r2 = input.nextFloat();
        float x = x1-x2;
        float y = y1-y2;
        if (Math.sqrt(x*x+y*x)<Math.abs(r1-r2)) {
        	System.out.println("circle2 is inside circle1");
        }
        else if (Math.sqrt(x*x+y*x)<=r1+r2){
        	System.out.println("circle2 overlaps circle1");
        }
        else{
        	System.out.println("circle2 does not overlaps circle1");
        }
	}

}
