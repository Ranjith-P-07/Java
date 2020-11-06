public class EmpWageBuilderArray {
   public static final int isFullTime = 2;
   public static final int isPartTime = 1;

   private int numofCompany = 0;
   private CompanyEmpWage[] companyEmpWageArray;

   public EmpWageBuilderArray() {
      companyEmpWageArray = new CompanyEmpWage[5];
   }
   private void addCompanyEmpWage(String Company, int EmpratePerHr, int numWorkingDays,
                                                   int max_hrs_in_month){
      companyEmpWageArray[numofCompany] = new CompanyEmpWage(Company, EmpratePerHr, numWorkingDays, max_hrs_in_month);
      numofCompany++;
   }
   private void computeEmpWage() {
      for (int i=0; i < numofCompany; i++) {
         int totalEmpWage = this.computeEmpWage(companyEmpWageArray[i]);
         System.out.println("Total Emp Wage for Company "+ companyEmpWageArray[i] + " is: " + totalEmpWage);
      }
   }
   private int computeEmpWage(CompanyEmpWage companyEmpWage){
      int EmpHrs = 0, total_emp_hrs = 0, total_working_days = 0;
      while(total_working_days < companyEmpWage.numWorkingDays && total_emp_hrs <= companyEmpWage.max_hrs_in_month)
      {
         total_working_days++;
         double Empcheck=Math.floor(Math.random()*10)%3;
         switch((int)Empcheck){
            case isPartTime :
               EmpHrs=8;
               break;
            case isFullTime:
               EmpHrs=8;
               break;
            default:
               EmpHrs=0;
               break;
         }
         total_emp_hrs += EmpHrs;
         System.out.println("Day : " + total_working_days + " Emp Hr: " + EmpHrs);
      }
      return total_emp_hrs * companyEmpWage.EmpratePerHr;
   }

   public static void main(String args[])
   {
      EmpWageBuilderArray EmpWageBuilder = new EmpWageBuilderArray();
      EmpWageBuilder.addCompanyEmpWage("Flipkart", 20, 2, 10);
      EmpWageBuilder.addCompanyEmpWage("Amazon", 10, 4, 20);
      EmpWageBuilder.computeEmpWage();
   }

}
