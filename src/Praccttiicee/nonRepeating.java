package Praccttiicee;

import java.util.ArrayList;
import java.util.Scanner;

public class nonRepeating {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String= ");
		String s=sc.next();
		String str="";
		char ch[]=s.toCharArray();
		int count=0;
		ArrayList<Character> arr = new ArrayList<>();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;i<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count=count+1;
				}
			}
				if(count==1) {
					arr.add(ch[i]);
					count=0;
				}
				else {
					count=0;
				}
				System.out.println(arr);
			}
		}
		
		

	}

