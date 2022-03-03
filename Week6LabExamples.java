package FirstTerm;

import java.util.Scanner;

public class Week6LabExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * double a, b, c; System.out.println("lütfen bir x^2 katsayısı giriniz");
		 * Scanner girdi = new Scanner(System.in); if (girdi.hasNextDouble()) { a =
		 * girdi.nextDouble(); System.out.println("lütfen bir x katsayısı gir"); if
		 * (girdi.hasNextDouble()) { b = girdi.nextDouble();
		 * System.out.println("lütfen bir sabit satı gir"); if (girdi.hasNextDouble()) {
		 * c = girdi.nextDouble();
		 * System.out.println("girdiğiniz katsayıları olan fonksiyonun kökleri"); double
		 * kök1, kök2, delta; delta = Math.pow(b, 2) - (4 * a * c); kök1 = (-1 * b -
		 * Math.sqrt(delta)) / 2 * a; kök2 = (b - Math.sqrt(delta)) / 2 * a; if (delta
		 * == 0) { System.out.
		 * println(" girdiğiniz kat sayılı parabol bir tam karedir ve kökleri çakışıktır"
		 * ); System.out.printf("kök1= %1.3f", kök1); System.out.printf("kök2= %1.3f",
		 * kök2); } else if (delta > 0) {
		 * System.out.println("parabolün 2 farklı kökü vardır");
		 * System.out.printf("kök1= %1.3f", kök1); System.out.printf("kök2= %1.3f",
		 * kök2); } else if (delta < 0) {
		 * System.out.println("denklemin reel köküü yoktur"); } else
		 * System.out.println("lütfen geçerli bir katsayı değeri girin"); } else
		 * System.out.println("lütfen geçerli bir katsayı değeri girin"); } else
		 * System.out.println("lütfen geçerli bir katsayı değeri girin"); } else
		 * System.out.println("lütfen geçerli bir katsayı değeri girin");
		 */
		/*
		 * System.out.println("programı başaltmak için numpadden bir tuşa basınız");
		 * Scanner girdi= new Scanner(System.in);
		 * 
		 * if(girdi.hasNextDouble()) { System.out.println("program çalışıyor"); double
		 * a= (int)(Math.random()*91+10); for(int i =1;i<a;i+=2) {
		 * System.out.println(i); } }else
		 * 
		 * System.out.println("lütfen numpadden bir tuşa bas lan ");
		 */
		// second way
		/*
		 * int num=(int)(Math.random()*91+10); int i=1; while(i<num) {
		 * System.out.println(i); i+=2; }
		 */

		System.out.println("do you wanna play a game ?");
		System.out.println("just enter a number between 0 to 100");
		int sayi;
		Scanner girdi = new Scanner(System.in);
		double randomsayi = (int) (Math.random() * 101);
		while (!girdi.hasNextInt()) {
			System.out.println(" doğru düzgün sayı gir lan");
			girdi.next();
		}
		do {
			int pcsayi = (int) (Math.random() * 101);
			sayi = girdi.nextInt();
			if (sayi > randomsayi) {
				System.out.println("your guess is too high ");
			} else if (sayi < randomsayi) {
				System.out.println("your guess is too low ");
			} else if (sayi == randomsayi) {
				System.out.println("tebrikler bildin ");
			}
			System.out.println("guess of pc =" + pcsayi);
			if (pcsayi > randomsayi) {
				System.out.println("pc's guess is too high ");
			} else if (pcsayi < randomsayi) {
				System.out.println("pc's guess is too low ");
			} else if (pcsayi == randomsayi) {
				System.out.println("tebrikler bildin ");
			}
		} while (sayi != randomsayi);

	}

}
