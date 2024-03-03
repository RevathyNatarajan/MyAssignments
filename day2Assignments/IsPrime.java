package week1.day2.homeassignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int n = 33;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i != 0) {
				continue;
			} else if (n % i == 0) {
				isPrime = false;
				break;
			}

		}
		if(isPrime==true)
		System.out.println("The input number is prime");else if (isPrime==false) {
			System.out.println("The input number is not prime");
			
		}
			

	}

}
