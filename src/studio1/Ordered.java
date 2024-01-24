package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean test1 = x < y;
		boolean test2 = y < z;
		boolean test3 = test1 && test2;
		boolean test4 = x > y;
		boolean test5 = y > z;
		boolean test6 = test4 && test5;
		boolean isOrdered = test3 || test6;		
System.out.println(isOrdered);
	}

}
