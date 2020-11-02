public class Employee_Attendance{
	public static void main(String args[])
	{
		int isPresent = 1;
		double Empcheck=Math.floor(Math.random()*10)%2;
		if(isPresent == Empcheck)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is not Present");
		}
	}
}
