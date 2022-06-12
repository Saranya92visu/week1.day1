package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean prime = true;
		int a = 13;
		for (int i=2; i<=a/2; ++i) {
			if (a%i==0) {
				prime=false;
				break;
			}
		}
if(prime) {
    System.out.println(a + "is a Prime number");}
else {
	System.out.println(a + "is not a Prime number");
	}
}
}