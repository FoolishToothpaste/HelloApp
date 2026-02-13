package package1;
import java.util.*;

public class Subtraction {
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		int diff = a - b;
		System.out.println("Their difference  = " + diff);
	}
}
