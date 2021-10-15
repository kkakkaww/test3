package test3;
import java.util.Scanner;
public class tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int y = input.nextInt();
        System.out.print("Enter month:");
        int m = input.nextInt();
        System.out.print("Enter day:");
        int q = input.nextInt();
        if (m==1||m==2) {
        	m=m+12;
        	y=y-1;
        }
        int j = y/100;
        int k = y%100;
        int h = (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        switch (h){
        	case 0:
        		System.out.println("Saturday");
        		break;
        	case 1:
        		System.out.println("Sunday");
        		break;
        	case 2:
        		System.out.println("Monday");
        		break;
        	case 3:
        		System.out.println("Tuesday");
        		break;
        	case 4:
        		System.out.println("Wednesday");
        		break;
        	case 5:
        		System.out.println("Thursday");
        		break;
        	case 6:
        		System.out.println("Friday");
        		break;
        		
        }
	}

}
