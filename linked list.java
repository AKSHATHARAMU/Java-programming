package sample;

public class List {
	int data;
	List next;
	List(int value)
	{
		data=value;
	}
	
public static void main(String args[])
{
	List head=new List(10);
	List one=new List(20);
	List two=new List(30);
	head.next=one;
	one.next=two;
	two.next=null;
	List temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	
}
}
