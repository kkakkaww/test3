package test3;
import java.util.Scanner;
public class rr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("enter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
        	System.out.println(a+b+c);
        }
        else {
        	System.out.println("error");
        }
	}

}
