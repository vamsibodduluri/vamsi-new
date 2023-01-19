package calculator;

import java.util.Scanner;

public class calc {

	public static void main(String args[]) {
		float a,b,div=0;
		Scanner dc = new Scanner(System.in);
		System.out.println("enter a=");
		a = dc.nextFloat();
		
		Scanner ac = new Scanner (System.in);
		System.out.println("enter b=");
		b = ac.nextFloat();
		
		div = a/b;
		
		System.out.println("result = "+div);
		

	}

}
