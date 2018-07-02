package com;

public class Example {

	public static void main(String[] args) {
	//System.out.println("this is what i love~");

		
		Linkdlist llnode1= new Linkdlist(1);
		Linkdlist llnode2= new Linkdlist(2);
		Linkdlist llnode3= new Linkdlist(3);
		Linkdlist llnode4= new Linkdlist(4);
		Linkdlist llnode5= new Linkdlist(5);
		Linkdlist llnode6= new Linkdlist(6);
		
		llnode1.setNext(llnode2);
		llnode2.setNext(llnode3);
		llnode3.setNext(llnode4);	
		llnode4.setNext(llnode5);
		llnode5.setNext(llnode6);
		
		Linkdlist updated= reverse(llnode1);
		
		while(updated != null) {
			System.out.println(updated.getData());
			updated =updated.getNext();
		}
		
	}

	
	public static Linkdlist reverse(Linkdlist head) {
		
		Linkdlist temp1=null;
		Linkdlist temp2=null;
		
		while(head!=null && head.getNext()!=null) {
		
			if(temp1!=null) {
				temp1.getNext().setNext(head.getNext()); 
			}
			
			temp1 = head.getNext();
			head.setNext(temp1.getNext());
			temp1.setNext(head);
			
			if(temp2==null) {
				temp2=temp1;
			}
			
			head= head.getNext();
		}
		return temp2;
	} 
	



}



class Linkdlist{

	
	private int data;
	private Linkdlist next;
	
	public Linkdlist(int data) {
		this.data= data;
		next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Linkdlist getNext() {
		return next;
	}
	public void setNext(Linkdlist next) {
		this.next = next;
	}
	
	
	
}