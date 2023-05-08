/**
 * 
 */
package Praccttiicee;

import java.util.Scanner;

//Create a function that recursively counts the integer's number of digits.

public class digitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a==0) {
			count=1;
		}
		while(a!=0) {
			count=count+1;
			a=a/10;
		}
		System.out.println(count);
	

	}

}
