package myproject;

import java.util.Scanner;

class Que
{
	Scanner s=new Scanner(System.in);
	int q[],r,f;
	Que(int m)
	{
		q=new int[m];
		r=-1;
		f=-1;
	}
	void ins()
	{
		int data;
		if(r==q.length-1)
			System.out.println("Queue overflow");
		else
		{
			if(f==-1)
				f=0;
			System.out.println("Insert the element in queue ");
		    data=s.nextInt();
			r=r+1;
			q[r]=data;		}
	}
	void del()
	{
		if(f==-1||f>r)
		{
			System.out.println("Queue underflow");
			return;
		}
		else
		{
			System.out.println("ELement deleted from queue is "+q[f]);
			f=f+1;
		}
	}
	void disp()
	{
		if(f==-1)
			System.out.println("Queue is empty");
		else
		{
			System.out.println("Queue is");
			for(int i=f;i<=r;i++)
			   System.out.println(q[i]);
	
		}
	}
}
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("Enter the size");
int m1=s1.nextInt();
Que s2=new Que(m1);
int ch=0;
while(ch<4)
{
	System.out.println("Enter \n1-Insert\n2-Delete\n3-Display");
	ch=s1.nextInt();
	switch(ch)
	{
	case 1:
		s2.ins();
		break;
	case 2:
		s2.del();
		break;
	case 3:
		s2.disp();
		break;	
	}
}
	}

}
