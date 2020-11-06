import java.util.HashMap;
import java.util.LinkedList;
public class EmpWageBuilder implements IComputeEmpWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany;
        private LinkedList<CompanyEmpWage> companyEmpWageList;
        private HashMap<String,CompanyEmpWage> companyToEmpWageMap;

        public EmpWageBuilder() {
                companyEmpWageList = new LinkedList<>();
                companyToEmpWageMap = new HashMap<>();
        }

        public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays,
                                                                                        int maxHoursPerMonth){
                CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
                companyEmpWageList.add(companyEmpWage);
                companyToEmpWageMap.put(company, companyEmpWage);
        }

        public void computeEmpWage() {
                for (int i=0; i < companyEmpWageList.size(); i++){
                        CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
                        companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
                        System.out.println(companyEmpWage);
                }
        }
        public int getTotalWage(String company) {
                return companyToEmpWageMap.get(company).totalEmpWage;
        }

        public int computeEmpWage(CompanyEmpWage companyEmpWage) {
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                while(totalWorkingDays < companyEmpWage.numOfWorkingDays && totalEmpHrs <= companyEmpWage.maxHoursPerMonth)
                {
                totalWorkingDays++;
                int empcheck = (int) Math.floor(Math.random() * 10 ) % 3;
                switch(empcheck){
                case IS_PART_TIME:
                        empHrs=8;
                        break;
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                default:
                        empHrs=0;
                        break;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day : " + totalWorkingDays + " Emp Hr: " + empHrs);
                }
                return totalEmpHrs * companyEmpWage.empRatePerHour;

        }

        public static void main(String[] args) {
                IComputeEmpWage empWageBuilder = new EmpWageBuilder();
                empWageBuilder.addCompanyEmpWage("Flipkart", 20, 2, 10);
                empWageBuilder.addCompanyEmpWage("Amazon", 10, 4, 20);
                empWageBuilder.computeEmpWage();
                System.out.println("Total Wage for Flipkart Company: " + empWageBuilder.getTotalWage("Flipkart"));
        }
}
