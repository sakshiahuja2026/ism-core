package Task_2.Task20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) throws IOException {
		int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name with path:");
        String filename = sc.next();
        File file = new File(filename);
        System.out.println(file.exists());
		System.out.println(filename);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while(true) {
			int s = br.read();
			if(s==-1) {break;}
			if(s=='a'||s=='e'||s=='i'||s=='o'|| s=='u'||s=='A'||s=='E'||s=='I'||s=='O'|| s=='U') {
				count++;
			}	
		}System.out.println("Total Number of vowels--->"+count);           
	}

}
