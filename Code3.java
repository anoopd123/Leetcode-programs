package Leetcode_Problems;


public class Code3 {
	
	public static void main(String args[])
	{
		String str="pwwkew";
		String s1="";int flag=0;
		int max=0;int prev=0;
		s1=s1+str.charAt(0);int sflag=0;
		for(int i=1;i<str.length();i++)
		{
			if(flag==1)
				s1=s1+str.charAt(i);System.out.println(s1);
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)==str.charAt(i))
				{
					System.out.println(str.charAt(i)+"aaaa");
					System.out.println(s1.charAt(j)+"bbbbb");
					sflag=1;
					break;
				}
				else
				{
					sflag=0;
				}
			}
			if(sflag==0)
			{
				s1=s1+str.charAt(i);
				System.out.println(s1);
				flag=0;
			}
			else
			{
				flag=1;
			}
			prev=s1.length();
			if(prev>max) { System.out.println(s1);max=prev;prev=0;}
			if(i<str.length())
				if(flag==1)
					s1="";
				
		}
		System.out.println(max);
	}
}
