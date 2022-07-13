package Task_2.Task11;
import java.util.Scanner;
public class Insurance {
	 Scanner sc=new Scanner(System.in);
	    int age,premium;
	    String gender,place,health;
	    public void input(){
	        System.out.println("Is your health excellent or poor?");
	        health=sc.nextLine();
	        System.out.println("Enter your age:");
	        age = sc.nextInt();
	        System.out.println("You live in village or city?");
	        place=sc.next();
	        System.out.println("Enter your gender:");
	        gender=sc.next();
	    }
	    public void display(){
	    if(health.equals("excellent") && age>=25 && age<=35 && place.equals("city") && gender.equals("male")){
	        premium=4000;
	        System.out.println("Premium will be 4k,you are insured");}
	    else if(health.equals("excellent") && age>=25 && age<=35 && place.equals("city") && gender.equals("female")){
	        premium=3000;
	        System.out.println("Premium will be 3k,you are insured");}
	    else if(health.equals("poor") && age>=25 && age<=35 && place.equals("village") && gender.equals("male")){
	        premium=6000;
	        System.out.println("Premium will be 6k,you are insured");
	}else {
	    System.out.println("You are not insured!!");
	}
	    }
	public static void main(String[] args){
	Insurance i=new Insurance();
	i.input();
	i.display();
	}
}
