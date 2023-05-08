/**
 * 
 */
package Praccttiicee;

import java.util.ArrayList;

//public class repeatedAlpha {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="acabbcdfghj";
//		ArrayList<Character> arr = new ArrayList<>();
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++)	{
//				if(str.charAt(i)==str.charAt(j)) {
//					arr.add(str.charAt(i));
//				}
//			}
//				
//			}
//			System.out.print(arr);
//	}
//}
//........................................................................

public class repeatedAlpha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str="acabbcdfghj";
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++)	{
				if(arr[i]==arr[j]) {
					count=count+1;
				}
			}
				
			}
			System.out.print(count);
	}
}
