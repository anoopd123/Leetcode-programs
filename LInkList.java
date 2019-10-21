package Leetcode_Problems;

public class LInkList {
	Node head;
	public void insert(int data)
	{
		Node n=new Node();
		n.val=data;
		n.next=null;
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node newnode=head;
			while(newnode.next!=null)
			{
				newnode=newnode.next;
			}
			newnode.next=n;
		}
	}
	public void display()
	{
		Node s=head;
		while(s.next!=null)
		{
			System.out.println(s.val);
			s=s.next;
		}
		System.out.println(s.val);
	}
	public int showl1()
	{
		Node l1=head;
		int sum=0,rev=0; 
        while(l1.next!=null)
        {
            sum=l1.val+(sum*10);
            l1=l1.next;
        }
        sum=(sum*10)+l1.val;
        while(sum!=0)
		{
			int n=sum%10;
			rev=n+(rev*10);
			sum=sum/10;
		}
        System.out.println(rev);
        return rev;
	}
	

}
