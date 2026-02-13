package package1;

import java.util.Scanner;

public class Addition 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		int sum = a + b;
		System.out.println("Their sum = " + sum);
	}
}
