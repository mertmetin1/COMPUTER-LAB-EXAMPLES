package FirstTerm;

import java.util.Scanner;

public class Week10Examples {
	public static int ekok(int sayi1,int sayi2) {
		int k=0;
		for(int i=1;i<=sayi1*sayi2;i++) {
			if(i%sayi1==0&&i%sayi2==0) {
			k=i;
				break;
			}
			}  return k ;
	}
	public static int ebob(int sayi1,int sayi2) {
		int k=0;
if(sayi1>sayi2) {
		for(int i=1;i<=sayi1;i++) {
		     if(sayi1%i==0&&sayi2%i==0) {
		    	 k=i;
		    	 
		     }
		     }}
else if(sayi2>sayi1) {
	for(int i=1;i<=sayi1;i++) {
	     if(sayi1%i==0&&sayi2%i==0) {
	    	 k=i;
	    	 
	     }
	     }}
return k;

	}
	public static double domatesPSratio(double an) {
	double a1=1660;  
	/*  
	 an =a1 +(n-1)*r 
	 a3 =a1+(2)*r =1000
	 a6=a1+(5)*r =10
	 r=-330
	 a1=1660
	 */
	an=a1 + (an-1)*(-330);
	return Math.round(an);
}

	public static void main(String[] args) {
	
	 	/*  //satış adet bulma   
		 System.out.println("domatesin fiyatını gir;");
		Scanner girdi=new Scanner(System.in);
		double sayi=girdi.nextDouble();
System.out.println("tahmini satış adeti "+domatesPSratio(sayi));
	
		 */
		/*   // ebob bulma 
		System.out.println("2 sayı gir ");
		Scanner girdi= new Scanner(System.in);
		int sayi1 =girdi.nextInt();
		int sayi2 =girdi.nextInt();
		System.out.println(ebob(sayi1,sayi2));		
		 */
		
		    // ekok bulma
		 System.out.println("2 sayı gir ");
Scanner input = new Scanner(System.in);
int sayi1=input.nextInt();
int sayi2=input.nextInt();
System.out.println("girdiğiniz sayıalrın ekokku");
System.out.println(ekok(sayi1,sayi2));
   
				}

}
