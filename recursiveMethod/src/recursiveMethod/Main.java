package recursiveMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayý giriniz: ");
		number = scan.nextInt();
		run(number,number,number);
	}

	static void run(int n1, int n2, int n3) {
		if (n1 > 0) {
			System.out.print(n1 + " ");
			n1-=5;
			n3=n1;
			run(n1,n2,n3);
		}else {
			System.out.print(n3 + " ");
			n3+=5;
			if(n2==n3) {
				System.out.println(n2);
			}else {
				run(n1,n2,n3);
			}
			
		}

	}

}
