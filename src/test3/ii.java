package test3;
import java.util.*;
public class ii {
//3.24
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = (int)(Math.random()*13+1);
		int n2 = (int)(Math.random()*5);
		String a,b;
		if (n2==0) {
			a="of Clubs";
		}
		else if (n2==1) {
			a="of Diamonds";
		}
		else if (n2==2) {
			a="of Hearts";
		}
		else {
			a="of Spades";
		}
		switch (n1){
			case 1:
				b="The card you pick is Ace ";
				System.out.println(b+a);
				break;
			case 2:
				b="The card you pick is 2 ";
				System.out.println(b+a);
				break;
			case 3:
				b="The card you pick is 3 ";
				System.out.println(b+a);
				break;
			case 4:
				b="The card you pick is 4 ";
				System.out.println(b+a);
				break;
			case 5:
				b="The card you pick is 5 ";
				System.out.println(b+a);
				break;
			case 6:
				b="The card you pick is 6 ";
				System.out.println(b+a);
				break;
			case 7:
				b="The card you pick is 7 ";
				System.out.println(b+a);
				break;
			case 8:
				b="The card you pick is 8 ";
				System.out.println(b+a);
				break;
			case 9:
				b="The card you pick is 9 ";
				System.out.println(b+a);
				break;
			case 10:
				b="The card you pick is Jack ";
				System.out.println(b+a);
				break;
			case 11:
				b="The card you pick is Queen ";
				System.out.println(b+a);
				break;
			case 12:
				b="The card you pick is King ";
				System.out.println(b+a);
				break;
		}
	}

}
