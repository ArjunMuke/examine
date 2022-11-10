package bean;

import java.util.ArrayList;

public class StudentList {
public static void main(String[]agrs) {
	ArrayList<Student> StudentList = new ArrayList<>();
	Student s1=new Student(1, "Mukesh");
	Student s2=new Student(2, "Arjun");
	Student s3=new Student(3, "Krishna");
	Student s4=new Student(4, "MSurya");
     StudentList.add(s1);
     StudentList.add(s2);
     StudentList.add(s3);
     StudentList.add(s4);
     for (Student student : StudentList) {
		if(student.getName().startsWith("A")) {
			System.out.println(student.getId()+ " " + student.getName());
		}
	}
     }
}
