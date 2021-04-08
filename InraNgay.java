package chaper01;
import java.util.Scanner;
public class thungaythang {
	public static void main(String[] args) {
	
	int clientNumber = 0;
	String clientLanguage	=	new String();
	Scanner sc = new Scanner(System.in);
	System.out.print("Input Your Language: ");
	clientLanguage = sc.nextLine();
	
	
	if (clientLanguage.equals("en") == true || clientLanguage.equals("vi") == true) {
		System.out.print("Input Your Day: ");
		clientNumber = sc.nextInt();
		
		switch (clientLanguage) {
			case "en":
					switch (clientNumber) {
					case 1:
						System.out.print("Monday");
						break;
					case 2:
						System.out.print("Tuesday");
						break;
					case 3:
						System.out.print("Wednesday");
						break;	
					case 4:
						System.out.print("Thursday");
						break;
					case 5:
						System.out.print("Friday");
						break;
					case 6:
						System.out.print("Saturday");
						break;
					case 7:
						System.out.print("Sunday");
						break;
					default:
						System.out.print("Error");
						break;}
			break;

			case "vi":
					switch (clientNumber) {
					case 1:
						System.out.print("Thứ hai");
						break;
					case 2:
						System.out.print("Thứ ba ");
						break;
					case 3:
						System.out.print("Thứ tư");
						break;	
					case 4:
						System.out.print("Thứ năm");
						break;
					case 5:
						System.out.print("Thứ sáu");
						break;
					case 6:
						System.out.print("Thứ bảy");
						break;
					case 7:
						System.out.print("Chủ nhật");
						break;
					default:
						System.out.print("Lỗi");
						break;}
					
					break;			
			}
	} 
	else
		System.out.println("Invaild Format");
	sc.close();
	
} 
}

