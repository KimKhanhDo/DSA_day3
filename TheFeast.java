package homework_d3;

import java.util.Scanner;

public class TheFeast {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Money to buy candies: ");
		int moneyToSpend = sc.nextInt();

		System.out.println("Price of each candy: ");
		int priceEachCandy = sc.nextInt();

		System.out.println("Wrapper to receive another candy: ");
		int wrapperToExchange = sc.nextInt();

		System.out.println(
				"Total candies until getting obesity: " + theFeast(moneyToSpend, priceEachCandy, wrapperToExchange));

	}

	// O(n)
	public static int theFeast(int moneyToSpend, int priceEachCandy, int wrapperToExchange) {

		int candies = moneyToSpend / priceEachCandy;
		int currentWrappers = candies;

		while (currentWrappers >= wrapperToExchange) {
			int newCandies = currentWrappers / wrapperToExchange;
			candies += newCandies;
			currentWrappers = newCandies + (currentWrappers % wrapperToExchange);
		}

		return candies;
	}

}
