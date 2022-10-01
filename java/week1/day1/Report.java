package week1.day1;
/*Assignment:5
=========
Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and create object for student class in main method and print all the variables*/

public class Report {

	public static void main(String[] args) 
	{
		Student student = new Student();
		student.rollNo=123;
		student.markScored=93;
		student.cgpa=9.3f;
		System.out.println("Student Name "+student.studentName);
		System.out.println("Student RollNo "+student.rollNo);
		System.out.println("Student CollegeName "+student.collegeName);
		System.out.println("Student MarkScored "+student.markScored);
		System.out.println("Student CGPA "+student.cgpa);
		
	}

}
