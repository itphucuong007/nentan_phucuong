package chaper03;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	static 	int size;
	static Scanner sc = new Scanner(System.in);
	static String choose;
	static boolean flagTotal = true; //cờ ktra mảng đã sắp xếp chưa ?
	public static void main(String[] args) {
		
		System.out.print("Input Your Size: ");
		size = sc.nextInt();
		int arr[] = new  int[size];
		inputSize(size,arr);
		sc.nextLine();
		CheckArr(arr); //ktra mảng đã sắp xếp chưa
		if (flagTotal == false) yesNo(arr);  //nếu cờ ktra sai thì cần sắp xếp và ngược lại
		else System.out.println("Output: " + Arrays.toString(arr));	
	
		sc.close();
	}
	
	//nhập kích thước và giá trị của mảng
	public static void inputSize(int size, int[] arr) {
		int length = arr.length;
		for (int i = 0; i <= length - 1; i++) {
			System.out.print("arr[" +i +"] = " );
			arr[i] = sc.nextInt();
		}
	}
	
	//sort từ cao xuống thấp
	public static void sortarray(int [] arr) {
		int length = arr.length;
		for(int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] < arr[j]) {
	            	int temp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = temp;
	            } 
			}
		}
	}
	
	// hàm check mảng
	public static void CheckArr(int [] arr) {
		int length = arr.length;
		int [] arr2 = Arrays.copyOf(arr,length);
		boolean flag = false;
		boolean flag2 = false;
		
		// ktra mảng theo chiều giảm dần
		for(int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
	            if (arr[i] >= arr[j]) {
	            	flag = true;
	            }
			}
			
		}
		// ktra mảng theo chiều tăng dần
		for(int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
	            if (arr2[i] < arr2[j]) {
	            	flag2 = true;
	            	
	            }
			}
			
		}
		
		 if (flag == true && flag2 == false) System.out.println("Mảng đã sắp xếp theo giảm dần");   
		 else if (flag == false && flag2 == true) System.out.println("Mảng đã sắp xếp theo tăng dần");  
		 else {
			 System.out.println("Mảng Chưa được sắp xếp"); 
			 flagTotal = false;
		 }
		 
	}
	
	//yesno
	public static void yesNo(int [] arr) {
		System.out.println("Bạn có muốn sắp xếp mảng không (Y/N) ?");
		choose = sc.nextLine();
		
		if (choose.equals("Y")) {
			System.out.println("Chọn tăng dần hoặc giảm dần (1/0) ?");
			choose = sc.nextLine();
			if (choose.equals("1")) {
				Arrays.sort(arr);
			} else if(choose.equals("0")) {
				sortarray(arr);
			}
			System.out.println("Output: " + Arrays.toString(arr));		
		} 
		else if (choose.equals("N"))
			System.out.println("Output: " + Arrays.toString(arr));	
	}


	
}

