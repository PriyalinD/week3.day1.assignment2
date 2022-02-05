package week3.day1.assignment2;
public class Student extends Department {
	public void studentName()
	{
		System.out.println("studentName->Student");
		
	}
public void studentDept()
{
	System.out.println("studentDept->Student");
}
public void studentId()
{
	System.out.println("studentId->Student");
}
public static void main(String arg[])
{
	College c=new College();
	Department d =new Department();
	Student s=new Student();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
}
}
