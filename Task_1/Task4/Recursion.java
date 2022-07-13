package Task_1.Task4;

public class Recursion {
	public static void main(String[] args) {
        int n=11;
        int temp=n;
        int count=0;
        while(temp!=0) {
            count++;
            temp=temp/10;
        }
        int[] arr=new int[count];
        int i=0;
        while(n!=0) {
            arr[i]=n%10;
            n=n/10;
            i++;
        }
        for(int j=0;j<count;j++) {
            System.out.print(arr[j]);
        }
        System.out.println();
        int[] arr1=new int[count];
        for(int j=0;j<count;j++) {
            arr1[j]=arr[j];
        }
        leftShift(arr1,count);
        for(int j=0;j<count;j++) {
            System.out.print(arr1[j]);
        }
    }
    public static void leftShift(int[] arr,int count) {
        int temp=arr[0];
        for(int i=0;i<count-1;i++) {
            arr[i]=arr[i+1];
        }
        arr[count-1]=temp;
    }
}
