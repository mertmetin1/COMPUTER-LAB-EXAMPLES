package FirstTerm;

import java.util.Scanner;

public class Week7Examples {
	public static void main(String[] args) {
		/*	
		System.out.println("sayı gir");
		Scanner girdi = new Scanner(System.in);
		int sayi = girdi.nextInt();
		int bölen = 2;
		int bölünensayi = sayi;
		System.out.println("girdiğiniz sayıları asal çarpanları");
		do {
			if (bölünensayi % bölen == 0) {
				System.out.print(" "+bölen);
				bölünensayi /= bölen;
			} else
				bölen++;  

		} while (bölen <= bölünensayi);
		girdi.close();
*/
	
		
		 	System.out.println("sayı gir");
		Scanner girdi = new Scanner(System.in);
		int sayi = girdi.nextInt();
		for (int i = 0; i <= sayi-1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <sayi-1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
             for(int i=sayi-1;0<=i;i--) {
              for(int j=0;j<i;j++) {
            	  System.out.print(" ");
              }       	 
                for(int k=i;k<sayi-1;k++) {
                	System.out.print("*"+" ");
                }   
                System.out.println();
             }
		 
		/*
		  for (int sayi = 0; sayi < 1002; sayi++) {

			int yüzbas = sayi / 100;
			int onbas = sayi % 100 / 10;
			int birbas = sayi % 10;
			double yüzbasküp, onbasküp, birbasküp;
			yüzbasküp = Math.pow(yüzbas, 3);
			onbasküp = Math.pow(onbas, 3);
			birbasküp = Math.pow(birbas, 3);
			if (sayi == yüzbasküp + onbasküp + birbasküp) {
				System.out.println(sayi + " bir armstring sayıdır");
			}

		}

		*/ 
	}// method
}//class
