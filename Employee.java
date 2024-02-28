class Employee {
		/*These are instance variables*/
		String empName;
		int empNo;
		float salary;
		String empDesig;
		byte expYrs;
		
		void setEmployee(String Name,int no,float sal,String des,byte ex)
		{
			empName = Name;
			empNo = no;
			salary = sal;
			empDesig = des;
			expYrs = ex;
			
		}
		void getEmployee()
		{
			System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t"+salary+"\t"+expYrs+"\n");
			
		}
}
class demoEmployee
{
	public static void main(String args[])
	{
		Employee sajana = new Employee();
		/*Accessing instance variable using setMethod*/
		sajana.setEmployee("Sanjana",917123,88888.0f,"PM",(byte)20);
		System.out.println("empName\tempNo\tempDesig\tsalary\texpYrs\n");
		sajana.getEmployee();
		
		/*Accessing instance variale using dot operator*/
		Employee veena = new Employee();
		veena.empName = "Veena Shree";
		veena.empNo = 783246;
		veena.salary = 6754927.0f;
		veena.empDesig = "Project Lead";
		veena.expYrs = (byte)10;
		veena.getEmployee();
				
	}
}
