package Task_1.Task2;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	int studentid;
	String name;
	String eid;
	String pw;
	Student()
	{
		System.out.println("enter the name :");
		name=sc.nextLine();
		System.out.println("enter the email id :");
		eid=sc.nextLine();
		System.out.println("enter the pw :");
		pw=sc.nextLine();
		studentid=(int) (Math.random()*100000);
				//p_u();
		System.out.println("name:" + name +"\t"+ " email id:" + eid +"\t"+ " password:" + pw+ "\t"+" studentid: " + studentid);
		
	}
	 
	public static void main(String args[])
	{
		Student s1= new Student();
		//s1.input_u();
		
	}
}