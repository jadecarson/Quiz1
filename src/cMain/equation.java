package cMain;

import java.util.Scanner;

public class equation {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.print("Enter how many touchdowns: ");
		double TD = input.nextDouble();

		System.out.print("Enter how many total yards: ");
		double Yards = input.nextDouble();

		System.out.print("Enter how many interceptions: ");
		double INT = input.nextDouble();

		System.out.print("Enter how many completions: ");
		double comp = input.nextDouble();

		System.out.print("Enter the number of passes attempted: ");
		double ATT = input.nextDouble();

		double a = ((comp/ATT)-.3) * 5;	

		double b = ((Yards/ATT)-3) * .25;

		double c = (TD/ATT) * 20;

		double d = 2.375 - ((INT/ATT) * 25);

		a = (a>2.375) ? 2.375 : a;
		b = (b>2.375) ? 2.375 : b;
		c = (c>2.375) ? 2.375 : c;
		d = (d>2.375) ? 2.375 : d;

		double PasserRating = ((a + b + c + d)/6) * 100;

		System.out.printf("The rating is %.1f", PasserRating);

	}
}

