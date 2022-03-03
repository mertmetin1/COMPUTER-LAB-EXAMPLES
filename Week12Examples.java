package FirstTerm;

public class Week12Examples {
	public static int recursivepow(int x,int n) {
		if(n==1)
			return x;
		else
			return x*recursivepow(x, n-1);
		}
	public static int sum(int a) {
		if(a==1)
			return 1;
		else
			return a+sum(a-1);
	}
	public static int fak(int x) {
			if(x==1)
				return 1;
			else
			 return x*fak(x-1);
		 }

	public static void main(String[] args) {
System.out.println(fak(5));
System.out.println(sum(5));
System.out.println(recursivepow(5, 3));
	}

}
