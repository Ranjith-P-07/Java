public class Switch_Case{
	public static void main(String args[])
	{
		int isFullTime=2;
		int isPartTime=1;
		int EmpratePerHr=20;
		int EmpHrs=0;
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
        System.out.println(salary);
	}
}
