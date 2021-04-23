package chaper01;

public class Bangcuuchuong {
	public static void main(String[] args) {
		int number = 2;
		int i =1; 
		
		
		for( i = 1; i <= 10; i++) {
				
			for(number = 2; number < 9; number++) {
				System.out.printf("%d x %d = %d \t",number ,i ,i*number);
			}
		System.out.printf("%d x %d = %d \n",number ,i ,i*number);
				

		}
	}
		
	
}
