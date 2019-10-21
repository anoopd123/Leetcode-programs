package Leetcode_Problems;

public class Runner {
	public static void main(String args[])
	{
		LInkList list=new LInkList();
		LInkList list1=new LInkList();
		LInkList list2=new LInkList();
		list.insert(2);
		list.insert(4);
		list.insert(3);
		list1.insert(5);
		list1.insert(6);
		list1.insert(4);
		System.out.println("The entered l1 is");
		int n=list.showl1();
		System.out.println("The entered l2 is");
		int m=list1.showl1();
		int z=n+m;
		System.out.println("Sum of two numbers");
		System.out.println(z);
		while(z!=0)
		{
			int n1=z%10;
			list2.insert(n1);
			z=z/10;
		}
		list2.display();
	}
}
