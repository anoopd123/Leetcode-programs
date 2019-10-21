package Leetcode_Problems;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
class Code2{
   public int addTwoNumbers(ListNode l1, ListNode l2) {
	   int sum=0;
	   while(l1.next!=null)
	   {
		   sum=sum+l1.val;
	   }
	return sum;
     
   }
   public static void main(String args[])
   {
	   ListNode l1=new ListNode(5);
	   ListNode l2=new ListNode(6);
   }
}