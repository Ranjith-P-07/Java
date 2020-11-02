public class Parttime_Employee{
	public static void main(String args[])
	{
		int isFullTime=2;
		int isPartTime=1;
		int EmpratePerHr=20;
		double Empcheck=Math.floor(Math.random()*10)%3;
		if(isFullTime == Empcheck)
		{
			int EmpHrs=8;
			int salary=EmpHrs*EmpratePerHr;
	      System.out.println(salary);
		}
		else if(isPartTime == Empcheck)
		{
			int EmpHrs=8;
			int salary=EmpHrs*EmpratePerHr;
	      System.out.println(salary);
		}
		else
		{
			int EmpHrs=0;
			int salary=EmpHrs*EmpratePerHr;
			System.out.println(salary);
		}
	}
}
