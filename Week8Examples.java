package FirstTerm;

import java.util.Scanner;

public class Week8Examples {
	public static int enkücüksayi(int a,int b,int c) {
		if(a<=b&&a<=c) {
			return a;
			//System.out.println(a);
	 }else if(b<=a&&b<=c) {
		 return b;
		// System.out.println(b);
	 }else 
		 return c;
	 //System.out.println(c);
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner girdi=new Scanner(System.in);
        int a=girdi.nextInt();
        int b=girdi.nextInt();
        int c = girdi.nextInt();
        System.out.println("en küçük olan sayı 3 tane gir");
System.out.println(enkücüksayi(a,b,c));	
	}

}
