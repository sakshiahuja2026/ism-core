package Task_1.Task1;

import java.util.Scanner;

public class RightShift {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a ={1,2,3,4,5};
		  
        System.out.println("Original aay: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");     
        }    
		//Scan by user
		System.out.println("Enter the no. for Shift ");
		int n = sc.nextInt();
		
		 for(int i = 0; i < n; i++){    
            int j, last;    
			
            last = a[a.length-1];    
            
            for(j = a.length-1; j > 0; j--){  
			
                a[j] = a[j-1];    
            }    
            
            a[0] = last;    
        }    
        
        System.out.println();    
            
         
        System.out.println("aay after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
		
	}

}
