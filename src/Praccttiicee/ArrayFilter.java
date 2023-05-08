/**
 * 
 */
package Praccttiicee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * create a function that takes an array of string and returns an array with only the strings that have numbers in them.
 * if there are no strings containing numbers,return an empty array
 *
 */

 

public class ArrayFilter {

 

 public static void main(String[] args) {

 // TODO Auto-generated method stub
	 ArrayList<String> arr = new ArrayList<>();
	 ArrayList<String> arr1 = new ArrayList<>();
	 Scanner n = new Scanner(System.in);
	 int siz = n.nextInt();
	 for(int i=0;i<siz;i++) {
		 String s = n.next();
		 arr.add(s);
}
	 	String reg = "\\D+";
	 	for(String ss:arr) {
	 		if(!ss.matches(reg)) {
	 			arr1.add(ss);
	 		}
}
	 System.out.print(arr1);

 	}

}