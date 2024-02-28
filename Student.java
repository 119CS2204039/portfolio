class Student
{
	static byte sem =4;
	String name;
	String reg_no;
	float result;
	void setStudent(String n,String rno,float res)
	{
		name =n;reg_no =rno;result =res;
	}
	void getStudent()
	{
		System.out.println("The name of student is..\n"+name);
		System.out.println("The reg_no of student is..\n"+reg_no);
		System.out.println("The result of student is..\n"+result);
	}
}
class demoStudent
{
	public static void main(String args[])
	{
		Student sanjana = new Student();
		sanjana.setStudent("Sanjana","119CS22040",44);
		sanjana.getStudent();
	}
}