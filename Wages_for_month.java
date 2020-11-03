public class Wages_for_month{
	public static void main(String args[])
	{
		int isFullTime=2;
		int isPartTime=1;
		int totalSalary=0;
		int EmpratePerHr=20;
		int EmpHrs=0;
		int numWorkingDays=20;
		int day=1;
		for(day=1; day<=numWorkingDays; day++)
		{
			double Empcheck=Math.floor(Math.random()*10)%3;
			switch((int)Empcheck){
				case 1:
					EmpHrs=8;
					break;
				case 2:
					EmpHrs=8;
					break;
				default:
					EmpHrs=0;
					break;
			}
			int salary=EmpHrs*EmpratePerHr;
   		totalSalary=(totalSalary+salary);
		}
		System.out.println("Total Salary of Month is :  " + totalSalary);
	}
}
