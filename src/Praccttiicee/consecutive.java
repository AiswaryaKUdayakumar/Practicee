/**
 * 
 */
package Praccttiicee;

import java.util.Arrays;
import java.util.Scanner;

//Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of 
//numbers where each number appears exactly once.
public class consecutive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int s=sc.nextInt();
		System.out.println("Enter the array");
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		boolean flag=false;
		for(int i=arr.length-1;i>0;i--) {
//			int num=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				int num1=arr[j];
//				int sum=num1-num;
//				if(sum==1) {
//					flag=true;
//				}
//				else {
//					flag=false;
//				}
//			}
//		}
//		if(flag) {
//		System.out.println("true");
//		}
//		else
//			System.out.println("false");
		if(arr[i]-arr[i-1]==1) {		
			flag=true;
		}
		else {		
			flag=false;
		}
		}
		if(flag) {
			System.out.println("consecutive");
		}
		else {
			System.out.println("not");
			
		}

	}

}
