package daily_task;

import java.util.Scanner;

public class TowerOfhanoi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a the no of disk");
		int d=sc.nextInt();
		int m=(int) (Math.pow(2, d)-1);
		System.out.println(m);
	}

}
