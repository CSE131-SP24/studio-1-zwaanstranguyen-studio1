package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int yr1 = in.nextInt();
		boolean d4 = (yr1 % 4)== 0;
		boolean d100 = ((yr1 % 100) != 0);
		boolean d400 = (yr1 % 400) == 0;
		boolean test1 = d4 && d100;
		boolean test2 = test1 || d400;
		System.out.println(yr1 + " is a leap year: " + test2);
	}

}
