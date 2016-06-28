package com.sapient.beans;
import com.sapient.beans.Student;
public class StudentClient {
public static void main(String[] args)
{
	Student stu=new Student(1001,"ram",89);
	Student stu2=new Student(1001,"ram",89);
	System.out.println(stu);
	System.out.println(stu2);
	System.out.println(stu.equals(stu2));
	stu=null;
	stu2=null;
	System.gc();
			System.out.println("line 2");
			System.out.println("line 3");
			
	
}
}
