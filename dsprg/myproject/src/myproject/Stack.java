package myproject;

import java.util.Scanner;

class Stck
{
	int stk[];
	int top;
	Stck(int m)
	{
		stk=new int[m];
		top=-1;
	}
	void push(int data)
	{
		if(top>stk.length)
			System.out.println("Stack is full");
		else
		{
			top++;
			stk[top]=data;
		}
		
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is  empty");
			return 0;
		}
		else
		{
			int p=stk[top];
			top--;
			return p;
		}
	}
	void show()
	{
		if(top<0)
			System.out.println("stak is empty");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stk[i]);
		}
	}
}
   public class Stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the size");
		int m1=s.nextInt();
		Stck s1=new Stck(m1);
		int ch=0;
		do
		{
			System.out.println("ENter\n 1-push\n2-pop\n3-show");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data");
				int m=s.nextInt();
				s1.push(m);
				break;
			case 2:
				int n;
				n=s1.pop();
				System.out.println("The popped element is "+n);
				break;
			case 3:
				s1.show();
				break;
			}
		}while(ch<4);

	}

}
