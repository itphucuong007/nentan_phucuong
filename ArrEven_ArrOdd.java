package chaper03;

import java.util.Arrays;

public class splitArray {

	public static void main(String[] args) {
		int[] arrInt	= {1, 2, 4, 8, 0, 4, 2, 3, 5, 1};
		int[] chan = new int[10];
		int[] le = new int[10];
		int length = arrInt.length;
		int indexChan = 0;
		int indexLe = 0;
		
		for (int i = 0; i < length; i++) {
			if (arrInt[i] % 2 == 0) {
				chan[indexChan] += arrInt[i];
				indexChan++;
			} else {
				le[indexLe] += arrInt[i];
				indexLe++;
			}
		}
		chan = Arrays.copyOf(chan,indexChan);
		le = Arrays.copyOf(le,indexLe);
		
		System.out.print( Arrays.toString(chan) );
		System.out.println();
		System.out.print( Arrays.toString(le) );
		
		//System.out.println(length);
	}

}
