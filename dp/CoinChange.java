package dp;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for(int coins_i=0; coins_i < m; coins_i++){
			coins[coins_i] = in.nextInt();
		}
		Arrays.sort(coins);
		int ways = coinChange(money,coins);
		System.out.println(ways);

	}

	private static int coinChange(int money, int[] coins) {
		if(money<0 || money>0 && money< coins[0]) {
		return 0;
		}
		int[] changevalues = new int[money+1];
		changevalues[0]=1;
		if(changevalues[money]==0) {
			for(int coin:coins){
				int remaining  = money - coin;
				changevalues[money] += coinChange((remaining), coins);
				System.out.println("money: "+money+" coin: "+coin+" money-coin: "+(remaining));
			}
		}
		return changevalues[money];
	}
}
