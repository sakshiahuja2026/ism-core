package Task_2.Task21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileJava {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name with path:");
        String filename = sc.next();
        File file = new File(filename);
        System.out.println(file.exists());
		System.out.println(filename);

        
        int count = 0;
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File file1:files){
                if(file1.getName().endsWith(".java")){
                    count++;
                }
                }
            }else {
            	System.out.println("No java file found!!");
        }
        System.out.println("Total java files in this folder are:"+count);
    }

}
