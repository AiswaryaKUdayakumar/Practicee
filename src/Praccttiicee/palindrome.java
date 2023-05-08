/**
 * 
 */
package Praccttiicee;

import java.util.Scanner;

//Create a recursive function that determines whether a word is a palindrome or not.

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String=");
		int s=sc.nextInt();
		String str=str.toLowerCase();
		String rev="";
		boolean flag=false;
		for(int i=str.length();i>0;i--) {
			rev++;
			if(str==rev) {
				flag=true;
			}
			else {
				flag=false;
			}
}
		if(flag) {
System.out.println("is Palidrome");
}
		else {
			System.out.println("not Palindrome");
		}
}
}
