/**
 * 
 */
package Praccttiicee;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

//You have a pack of 5 randomly numbered cards, which can range from 0-9. You can win if you can produce
//a higher two-digit number from your cards than your opponent. Return true if your cards win that round.

public class highestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s = sc.nextInt();
		System.out.println("Enter the  array");
		int arr1[] = new int[s];
		for (int i = 0; i < s; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the array2");
		int arr2[] = new int[s];
		for (int i = 0; i < s; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int a = arr1[s - 1] * 10 + arr1[s - 2];
		System.out.println(a);
		int b = arr2[s - 1] * 10 + arr2[s - 2];
		System.out.println(b);
		if (a > b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
