public class Switch_Case{
	public static void main(String args[])
	{
		int isFullTime=2;
		int isPartTime=1;
		int EmpratePerHr=20;
		double Empcheck=Math.floor(Math.random()*10)%3;
		switch((int)Empcheck){
			case 1:
				int EmpHrs=8;
				int salary=EmpHrs*EmpratePerHr;
      		System.out.println(salary);
				break;
			case 2:
				EmpHrs=8;
				salary=EmpHrs*EmpratePerHr;
      		System.out.println(salary);
				break;
			default:
				EmpHrs=0;
				salary=EmpHrs*EmpratePerHr;
      		System.out.println(salary);
				break;
		}

	}
}
