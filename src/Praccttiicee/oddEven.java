/**
 * 
 */
package Praccttiicee;
public class oddEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="odd even";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2!=0) {
					StringBuilder sb=new StringBuilder(arr[i]);
				sb.reverse();
				arr[i]=sb.toString();
				}
			else {
				arr[i]=arr[i];
			}
			
			
		}
		String snew=String.join(" ", arr);
		System.out.println(snew);
	}
	

}
