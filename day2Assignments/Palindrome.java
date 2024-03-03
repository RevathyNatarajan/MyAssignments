package week1.day2.homeassignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=12332;
int output=0;
for(int i=input;i>0;i=i/10) {
	int rem=i%10;
	output=10*output+rem;
		}
		System.out.println(output);
	
		if(input==output) {
			System.out.println("The number is palindrome");
			
		}else {
			System.out.println("The number is not a palindrome");
		}
	
}
	}


