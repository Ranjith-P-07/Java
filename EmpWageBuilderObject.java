public class EmpWageBuilderObject{
   public static final int isFullTime = 2;
   public static final int isPartTime = 1;

	private final String Company;
	private final int EmpratePerHr;
	private final int numWorkingDays;
	private final int max_hrs_in_month;
	private int totalEmpWage;

   public EmpWageBuilderObject(String Company, int EmpratePerHr, int numWorkingDays, int max_hrs_in_month)
   {
		this.Company = Company;
		this.EmpratePerHr = EmpratePerHr;
		this.numWorkingDays = numWorkingDays;
		this.max_hrs_in_month = max_hrs_in_month;
	}
	public void computeemployeewage(){
		int EmpHrs = 0, total_emp_hrs = 0, total_working_days = 0;
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
         total_emp_hrs += EmpHrs;
         System.out.println("Day : " + total_working_days + " Emp Hr: " + EmpHrs);
         total_working_days++;
      }
      totalEmpWage = total_emp_hrs * EmpratePerHr;
	}
	@Override
	public String toString() {
	return "Total Emp Wage for Company : " +Company+ " is : " + totalEmpWage;
	}
   public static void main(String args[])
   {
		EmpWageBuilderObject Flipkart=new EmpWageBuilderObject("Flipkart", 20, 2, 10);
		EmpWageBuilderObject Amazon=new EmpWageBuilderObject("Amazon", 10, 4, 20);
      Flipkart.computeemployeewage();
		System.out.println(Flipkart);
      Amazon.computeemployeewage();
		System.out.println(Amazon);
   }
}
