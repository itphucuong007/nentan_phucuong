package chaper01;
import java.util.Scanner;

public class nhapupdate {
	public static void main(String[] args) {
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your length: ");
		length = sc.nextInt();
		int line;
		int count = 1;
		int tmp;
		tmp = length;
		
		for (line = length; line >= 1; line--) {
			if(line == length || line == 1 ) {
				for (int j = 1; j <= tmp; j++) {
					if (j<tmp) 	System.out.print(j +" "); 
					else System.out.print(j);
					}
			} 
			else {
				//space_right
				for (int space_right = 1; space_right <= count; space_right++) {
					System.out.print("  ");
					}
				count += 1;
				System.out.print(count);
				
			}
			System.out.println();	
		}
		sc.close();
	
		
	}
	
	
}
