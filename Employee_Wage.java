public class Employee_Wage{
   public static void main(String args[])
   {
      int isPresent = 1;
      double Empcheck=Math.floor(Math.random()*10)%2;
      if(isPresent == Empcheck)
      {
         int EmpratePerHr=20;
			int EmpHrs=8;
			int salary=EmpHrs*EmpratePerHr;
			System.out.println(salary);
      }
      else
      {
         int salary=0;
			System.out.println(salary);
      }
   }
}
