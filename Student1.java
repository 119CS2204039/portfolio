package week02;

class Student {
	String StudName,dept;
	int Rollno;
	static String clg = "GPT";
	int percentage;
	void setstudent(String Name,int rollno,String cdept,int per)
	{
		StudName=Name;
		Rollno=rollno;
		dept=cdept;
		percentage=per;
	}
	void getStudent()
	{
		System.out.println(StudName+"\t"+Rollno+"\t"+clg+"\t"+dept+"\t"+percentage);
	}
}
class Stud
{
	public static void main(String args[])
	{
		System.out.println("Name\tRollno\tCollege\tDepartment\tPercentage");
		Student stud1=new Student();
		Student stud2=new Student();
		stud1.setstudent("Sanjana",155,"CS",99);
		stud2.setstudent("Veena",100,"CE",45);
		stud1.getStudent();
		stud2.getStudent();
	}
}
