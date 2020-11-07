import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args)
   {
		int s=0,rem;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int m= sc.nextInt();
      int n=m;
      while(n>0)
      {
      	rem=n%10;
         n=n/10;
         s=s*10+rem;
		}
		if(s == m)
      {
      	System.out.println("Entered Number is Palindrome");
      }
		else
		{
      	System.out.println("Entered Number is Not a Palindrome");
      }
	}
}
