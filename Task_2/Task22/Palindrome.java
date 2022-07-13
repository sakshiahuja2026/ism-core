package Task_2.Task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Palindrome extends Thread{
	 int a, b;

	 Palindrome(int a, int b) 
	 {
	  this.a = a;
	  this.b = b;
	 }
	 public void run() 
	 {
	     
	      for(int i=a;i<b;i++)
	      {
	  try 
	  {
	   String line = Files.readAllLines(Paths.get("C:\\ISM\\Palindrome.txt")).get(i);
	   String s = line.toLowerCase();
	         StringBuilder name = new StringBuilder(s);
	   StringBuilder j = name.reverse();
	   if (s.contentEquals(j)) 
	       {
	    System.out.println(line + "--------- is palindrome"+"--------------------------"+i);
	          }
	   }  
	  catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	      }
	  }
	     }

	 public static void main(String[] args) throws IOException {
	  Path f = Paths.get("C:\\ISM\\Palindrome.txt");
	  long count = Files.lines(f).count();
	  int num = (int) count;
	  Palindrome t = new Palindrome(0, num / 10);
	  Palindrome t2 = new Palindrome(num/10,num/8);
	  Palindrome t3 = new Palindrome(num/8, num/6);
	  Palindrome t4 = new Palindrome( num / 6,num/4);
	  Palindrome t5 = new Palindrome(num/4,num/2);
	  Palindrome t6 = new Palindrome(num/2, num);
	  t.start();
	  t2.start();
	  t3.start();
	  t4.start();
	  t5.start();
	  t6.start();
	  
	 }
}
