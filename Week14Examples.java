package FirstTerm;

import java.util.Arrays;
import java.util.Scanner;

public class Week14Examples {
	public static int method(int[] average) {
		Arrays.sort(average);
if(average.length%2==0)
	return average[average.length/2];
else
return average[average.length/2+1];
		
}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("array kaç haneli olsun");
		int toplamtek=0;
		int toplamçift=0;
		int a=in.nextInt();
		 int[] array=new int[a];
		 for(int i =0;i<a;i++) {
			System.out.println(i+" inci elemanı kaç olsun");
			int b=in.nextInt();
	         array[i]=b;
	         if(b%2==0) { //çift ise
	 			toplamçift+=b;
	 		}
	 		if(b%2!=0) { //çift ise
	 			toplamtek+=b;
	 		}
		 }

		 System.out.println(" dizinin çift elemanlarının toplamı "+toplamçift);
	System.out.println("dizinin tek elemeanlarının toplamı "+toplamtek);
  
	}

}
/*
 Scanner girdi=new Scanner(System.in);
System.out.println("sayi gir ");
int sayi=girdi.nextInt();
int[] arr=new int[sayi];
for(int i=0;i<sayi;i++) {
	System.out.println("arr["+i+ "] = ?");
	int sayi2=girdi.nextInt();
			arr[i]=sayi2;
}
for(int i=sayi-1;0<=i;i--) {
	System.out.println("arr["+i+ "] = "+arr[i]);
}
  */
