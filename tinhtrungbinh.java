package chaper01;
import java.util.Scanner;
public class tinhtrungbinh {

	public static void main(String[] args) {
		float number = 0;
		float sum = 0;
		float avarage;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input your Quantity: " );
		int	inputQualtity = sc.nextInt();
		
		for (int i = 1; i <= inputQualtity; i++) {
			 System.out.println("Number" +i);
			 number = sc.nextInt();
			 sum += number;
		}
			avarage = sum/inputQualtity;
		
		sc.close();
		System.out.println("Avarage: " +avarage);
	}

}
