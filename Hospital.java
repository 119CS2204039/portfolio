class Hospital{
	//Instance variable
	String patientName;
	int patientid;
	//Static (class)variable
	static String DocName="Dr.Murthy";
	void sethospital(String pN,int pId)
	{
		patientName=pN;
		patientid=pId;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatient()
	{
		return patientid;
	}
}
public class DemoScopeofVariables{
	public static void main(String args[])
	{
		//Local variable
		String hospitalName="Apollo Hopital";
		
		Hospital patient = new Hospital();
		patient 1.sethospital("Sanjana",101);
		System.out.println("The patient"+patient 1.getpatientName()+"With the id"+patient 1.getpatientid()+"is treated by"+patient1.DocName+"at"+hopitalName);
		
	}
	
}
