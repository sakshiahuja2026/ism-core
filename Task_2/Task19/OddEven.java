package Task_2.Task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		//File f = new File("D:\\Temp\\java");// logical link
		File t = new File("D:\\Temp\\java\\demo.txt");
		File E=new File("D:\\Temp\\java\\even.txt");
		File O=new File("D:\\Temp\\java\\odd.txt");
		//f.mkdir();
		//	File f1 = new File("numbers.txt");// current folder
			Scanner scr = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(t);
			for (int i = 1; i <= 5; i++) {
				System.out.println("enter number:");
				int num = scr.nextInt();
				pw.println(num);
			}
			pw.close();
			BufferedReader br = new BufferedReader(new FileReader(t));
			PrintWriter pw1=new PrintWriter(O);
			PrintWriter pw2=new PrintWriter(E);
			
			while (true) {
				String num = br.readLine();
				if (num == null)
					break;
				
//				int x = (Integer)str;
				if (Integer.parseInt(num) % 2 == 0) {
					pw1.println(num);
					
					System.out.println(num + " even");
					
				} else {
					pw2.println(num);
					System.out.println(num + " odd");
				}
			}
			br.close();
			pw1.close();
			pw2.close();	
		}
}
