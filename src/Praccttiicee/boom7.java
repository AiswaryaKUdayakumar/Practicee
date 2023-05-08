/**
 * 
 */
package Praccttiicee;

import java.util.Scanner;

public class boom7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int s = sc.nextInt();
		System.out.println("enter the array");
		int[] arr = new int[s];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			int num=arr[i];
			while(num!=0) {
				int dig=num%10;
				if(dig==7) {
					flag=true;
					break;
				}
				else {
					num=num/10;
				}
			}
			
		}
		if(flag) {
			System.out.println("boom");
			
		}
		else
			System.out.println("there is no 7 in the array");
					
	}
}
