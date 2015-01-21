import java.util.Scanner;
public class EnterYourUserName
{
	public static void main(String []args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your username");
		String userName= input.nextLine();
		System.out.println("Enter your password");
		String password= input.nextLine();
		System.out.print("Hello "+userName+" Welcome to CSC200 class!");
		System.out.print(" And your password is "+password);
	}
}