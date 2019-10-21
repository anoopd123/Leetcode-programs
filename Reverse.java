package Leetcode_Problems;

public class Reverse {
	public static void main(String args[])
	{
		int number=325;
		int rev=0;
		while(number!=0)
		{
			int n=number%10;
			System.out.println(n);
			rev=n+(rev*10);
			number=number/10;
		}
		System.out.println(rev);
	}
}
