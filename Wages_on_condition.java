public class Wages_on_condition{
   public static void main(String args[])
   {
      int isFullTime=2;
      int isPartTime=1;
		int max_hrs_in_month=100;
      int totalSalary=0;
      int EmpratePerHr=20;
      int EmpHrs=0;
      int numWorkingDays=20;
		int total_working_days=0;
		int total_emp_hrs=0;
      while(total_working_days < max_hrs_in_month && total_working_days < numWorkingDays)
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
			total_emp_hrs+=EmpHrs;
			total_working_days++;
         int salary=(EmpHrs*EmpratePerHr);
         totalSalary=(totalSalary+salary);
      }
      System.out.println("Total Salary in Month is :  " + totalSalary);
   }
}

