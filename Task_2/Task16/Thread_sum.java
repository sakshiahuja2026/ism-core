package Task_2.Task16;

class Thread1 extends Thread {
	int sum1 = 0;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("The sum of 100 numbers is:" + sum1);
	}
}

public class Thread_sum {
	public static void main(String args[]) {
		Thread1 t1 = new Thread1();
		t1.start();

	}
}