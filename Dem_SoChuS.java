package chaper01;

import java.util.Scanner;
public class tinhchusoupdate {
	public static void main(String[] args) {
		int input = 0;
		int count = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your number: ");
		input = sc.nextInt();
		
		
		 while (input <= 0) {
	            System.out.println("Số nhập vào phải lớn hơn 0");
	            System.out.print("Mời bạn nhập lại: ");
	            input = sc.nextInt();
	        }
		
		while (input > 0) {
			input /= 10 ;
			count++;
		}
		System.out.println("Số các chữ số = " +count);
		sc.close();
	}
}
