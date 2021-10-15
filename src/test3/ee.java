package test3;
import java.util.Scanner;
public class ee {
// 3.15 ²ÊÆ±
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = (int)(Math.random()*900+100);
		Scanner input = new Scanner(System.in);
		System.out.print("enter a numbers:");
		int n2 = input.nextInt();
		int a1 = n1 / 100 ;
		int a3 = n1 % 10;
		int a2 = (n1 / 10)%10;
		int b1 = n2 / 100 ;
		int b3 = n2 % 10;
		int b2 = (n2 / 10)%10;
		System.out.print("prize is:");
		if (a1==b1 && a2==b2 && a3==b3 ) {
			System.out.print("10000");
		}
		else if ((a1==b2&&a2==b1&&a3==b3)||(a1==b2&&a2==b3&&a3==b1)||(a1==b3&&a2==b2&&a3==b1)||(a1==b3&&a2==b1&&a3==b2)||(a1==b1&&a2==b3&&a3==b2)) {
			System.out.print("3000");
		}
		else if (a1==b1||a1==b2||a1==b3||a2==b1||a2==b2||a2==b3||a3==b1||a3==b2||a3==b3) {
			System.out.print("1000");
		}
		else {
			System.out.print("0");
		}
	}

}
