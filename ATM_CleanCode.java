package chaper01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class ATM {
	
		static int money = 0; //global variable 
	
	public static void main(String[] args) {
		ATM Mo_ney = new ATM(); //truy cập vào biến global money
		
		final int FIVE_HUNDRED_THOUSAND	= 500000;
		final int Total_FIVE_HUNDRED_THOUSAND = 2;
		final int TWO_HUNDRED_THOUSAND	= 200000;
		final int Total_TWO_HUNDRED_THOUSAND	= 2;
		final int ONE_HUNDRED_THOUSAND	= 100000;
		final int FIFTY_THOUSAND		= 50000;
		final int TWO_THOUSAND		= 20000;
		final int TEN_THOUSAND			= 10000;
		
		int fiveHundredThousand	= 0;
		int twoHundredThousand	= 0;
		int oneHundredThousand	= 0;
		int	fiftyThousand		= 0;
		int twoThousand		= 0;
		int tenThousand			= 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input your money: ");
			ATM.money	= sc.nextInt();
		} while(ATM.money % 10000 != 0);
		sc.close();
		
		System.out.println("----------------------------");
		
		// 500.000
		limitMoney(Total_FIVE_HUNDRED_THOUSAND,fiveHundredThousand,FIVE_HUNDRED_THOUSAND);
		
		// 200.000
		limitMoney(Total_TWO_HUNDRED_THOUSAND,twoHundredThousand,TWO_HUNDRED_THOUSAND);
		
		// 100.000
		toTien(oneHundredThousand,ONE_HUNDRED_THOUSAND);
		
		// 50.000
		toTien(fiftyThousand,FIFTY_THOUSAND);
		
		// 20.000
		toTien(twoThousand,TWO_THOUSAND);
		
		// 10.000
		toTien(tenThousand ,TEN_THOUSAND);
		
	}
	
	// HÀM TỜ TIỀN VÔ HẠN (CÁC TỜ TIỀN CÒN LẠI)
	public static void toTien(int typeMoney ,int finalTypeMoney) {
		DecimalFormat formatter	= new DecimalFormat("#,###");
		if(money >= finalTypeMoney){
			typeMoney	= money / finalTypeMoney; //phép chia lấy số lượng mệnh giá
			money		= money % finalTypeMoney;  // tiền còn lại
			System.out.printf("Mệnh giá %s: %d tờ %n", formatter.format(finalTypeMoney), typeMoney);	
		}
	}
	
	//HÀM TỜ TIỀN GIỚI HẠN (500K VÀ 200K)
	public static void limitMoney(int totalMoney ,int typeMoney ,int finalTypeMoney ) {
		DecimalFormat formatter	= new DecimalFormat("#,###"); //format 3 chữ số 1,000
		if(money >= finalTypeMoney) {     //nếu số tiền nhập vào >= tiền mệnh giá
			typeMoney	= money / finalTypeMoney;
			
			if (typeMoney > totalMoney) {   //nếu số tiền nhập vào >= tiền giới hạn sẵn có
				typeMoney = totalMoney;	
				}
			money = money - finalTypeMoney*typeMoney; // tiền còn lại
			System.out.printf("Mệnh giá %s: %d tờ %n", formatter.format(finalTypeMoney), typeMoney);
		
		}
	}

}
