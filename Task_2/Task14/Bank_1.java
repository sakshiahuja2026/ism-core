package Task_2.Task14;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank_1 {
	public static void main(String[] args) {	
		String forName;
		String forPass;
		int forMoney;
		ArrayList<Bank> bankList = new ArrayList<>();
		Scanner snr = new Scanner(System.in);
		while (true) {
			Bank bank = new Bank();
			System.out.println("\n1. Add User" +"\n2. Check Balance\n"+ "3. wid\n" + "4 Dep \n"  + "5 Logout ");
			switch (snr.nextInt()) {
			case 1:
				System.out.println("You are in Add User Section");

				System.out.println("Enter Name:");
				bank.setName(snr.next());

				System.out.println("Enter Password:");
				bank.setPassword(snr.next());

				while (true) {
				System.out.println("Enter money you want to deposit");
				long i = snr.nextLong();
					if (i < 5000) {
						System.out.println("Plese Deposit minimum 5000");
					} else {
						bank.setMoney(i);
						break;
					}
				}
				int ac = (int)( Math.random() * 1000);
				bank.setAcNumber(ac);
				bankList.add(bank);
				break;
			case 2:
				System.out.println("You are on view section");
				System.out.println("Enter Name:");
				 forName=snr.next();
				System.out.println("Enter Password:");
				 forPass=snr.next();
				for(int j=0;j<bankList.size();j++) {
					if(bankList.get(j).getName().equals(forName) && bankList.get(j).getPassword().equals(forPass)) {
					System.out.println(bankList.get(j));
					}
				}
				break;
			case 3:
				System.out.println("You are on Wid section");
				System.out.println("Enter Name:");
				 forName=snr.next();
				System.out.println("Enter Password:");
				forPass=snr.next();
				for(int j=0;j<bankList.size();j++) {
					if(bankList.get(j).getName().equals(forName) && bankList.get(j).getPassword().equals(forPass)) {
						
						while (true) {
							System.out.println("Enter how much money you want to wid...");
							forMoney = snr.nextInt();							
							forMoney = (int) (bankList.get(j).getMoney()-forMoney);
								if (forMoney < 5000) {
									System.out.println("Minimum Balance 5000!!!!!!!!!");
								} else {
									bankList.get(j).setMoney(forMoney);
									break;
								}
							}
						
					}
				}
				break;
			case 4:
				System.out.println("You are on Dep section");
				System.out.println("Enter Name:");
				 forName=snr.next();
				System.out.println("Enter Password:");
				forPass=snr.next();
				for(int j=0;j<bankList.size();j++) {
					if(bankList.get(j).getName().equals(forName) && bankList.get(j).getPassword().equals(forPass)) {
							System.out.println("Enter how much money you want to dip...");
							forMoney = snr.nextInt();							
							forMoney = (int) (bankList.get(j).getMoney()+forMoney);
							bankList.get(j).setMoney(forMoney);
					}
				}
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Value");
			}
		}	
	}
}
	
	
class Bank {
	String name;
	String password;
	int acNumber;
	long money;
	int maxTanc;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(int acNumber) {
		this.acNumber = acNumber;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public int getMaxTanc() {
		return maxTanc;
	}

	public void setMaxTanc(int maxTanc) {
		this.maxTanc = maxTanc;
	}
	
	public String toString() {
		return "\nName:"+name+"\nAc. Number:"+acNumber+"\nPassword:"+password+"\nBalance:"+money;
	}
}