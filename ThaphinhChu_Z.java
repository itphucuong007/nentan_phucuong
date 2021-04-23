package chaper01;

public class thaphinhloai3 {
	public static void main(String[] args) {
		int line = 7;
		int count = 1;
		int space_right;
		
		for (line = 7; line >= 1; line--) {
			if(line == 7 || line == 1 ) {
				for (int j = 1; j <= 7; j++) {
					if (j<7) 	System.out.print(j +" "); 
					else System.out.print(j);
					}

			} 
			else {
				//space_right
				for (space_right = 1; space_right <= count; space_right++) {
					System.out.print("  ");
					
					}
				count += 1;
				System.out.print(count);
			}


			System.out.println();

			
		
	}
		
	
		
		
		
		
		
	}

}
