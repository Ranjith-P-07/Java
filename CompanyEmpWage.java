public class CompanyEmpWage {
   public final String Company;
   public final int EmpratePerHr;
   public final int numWorkingDays;
   public final int max_hrs_in_month;

   public CompanyEmpWage(String Company, int EmpratePerHr, int numWorkingDays, int max_hrs_in_month)
   {
      this.Company = Company;
      this.EmpratePerHr = EmpratePerHr;
      this.numWorkingDays = numWorkingDays;
      this.max_hrs_in_month = max_hrs_in_month;
   }
}
