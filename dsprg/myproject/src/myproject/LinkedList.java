package myproject;

import java.util.Scanner;

class Linklst
{
	int data;
    Linklst next;
    Linklst(int data, Linklst next) {
        this.data = data;
        this.next = next;
    }
    public String toString() {
        return data + " ";
    }
}
class LinkedList {
public Linklst head;
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int ch=0;
		System.out.println("Enter the data and address");
		int d=s.nextInt();
		int n=s.nextInt();
		Linklst l=new Linklst(d,n);
       ch=s.nextInt();
		switch
		{
		case 1:
			System.out.println("Enter the data in frst");
			int d1=s.nextInt();
			l.insFirst(d1);
			break;
		case 2:
			System.out.println("Enter the data last");
			int d2=s.nextInt();
			l.insLast(d2);
			break;
		case 3:
			System.out.println("Enter the data and key");
			int d2=s.nextInt();
			int key=s.nextIt();
			l.insAft(d2,key);
			break;
		}
	}
	 void insFirst(int data) {
	        Linklst head = new Linklst(data, head);
	        Linklst t = head;
	        while (t != null) {
	            t = t.next;
	        }
	    }
     public void insLast(int data) {
	        if (head == null) {
	            insFirst(data);
	          } 
	        else {
	            Linklst t = head;
	            while (t.next != null) {
	                t = t.next;
	                t.next = new Linklst(data, null);
	            }
	        }
	    }

	   

	    public void insAft(int _data, int k) {
	        Linklst t = head;
	        while (t != null && t.data != k) {
	            t = t.next;
	        }
	        if (t != null) {
	            t.next = new Linklst(_data, t.next);
	        }
	    }
	
	}

