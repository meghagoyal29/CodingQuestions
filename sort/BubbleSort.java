package sort;

import java.io.*;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		int swaps = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		int size =0;
		for(int i = 0; i<n; i++){
			String line = in.next();
			if(line != " ")
			{
				array[size] = Integer.parseInt(line);
				size++;
			}

		}
		boolean isSorted = false;
		int sortedLength = array.length -1;
		while(!isSorted){
			isSorted = true;
			for(int j = 0; j<sortedLength; j++){

				if(array[j]>array[j+1]){

					swap(array[j], array[j+1]);

					isSorted = false;
					swaps++;

				}
			}
			sortedLength--;
		}

		System.out.println("Array is sorted in "+swaps+ " swaps.");
		System.out.println("First Element: "+ array[0]);
		System.out.println("Last Element: "+ array[size-1]);
	}
	private static void swap(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
	}
}
