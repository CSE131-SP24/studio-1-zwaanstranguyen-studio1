package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two numbers to be averaged?");
		double n1 = in.nextInt();
		System.out.println("The second of two numbers to be averaged?");
		double n2 = in.nextInt();
		double avg = ((n1 + n2) / 2);
		System.out.println("the average of the two numbers is " + (avg) + ".");

	}

}
