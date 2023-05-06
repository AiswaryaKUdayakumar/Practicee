package Questions;

//1.List of students.write a logic to get the  males and females using map function.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class genderGrouping {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Map<String,Object>> stud=new ArrayList<>();
		student s1=new student("Swe",23,"Female");
		student s2=new student("Sagar",23,"Male");
		student s3=new student("Finn",23,"Female");
		student s4=new student("Meera",23,"Female");
		student s5=new student("Chris",23,"Male");
		student s6=new student("Kevin",23,"Male");
		student s7=new student("Migha",23,"Female");
		student s8=new student("Aiswarya",25,"Female");
		List<student>lis=Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8);
		
	Map<String,List<student>> list=lis.stream().collect(Collectors.groupingBy(student -> (String)student.getGender()));
	System.out.println("Grouped students:"+list );
		
	
	}

}
