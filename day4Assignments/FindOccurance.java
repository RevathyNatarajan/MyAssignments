package week1.day4.homeassignments;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Testleaf";
		char targetChar='e';
		int count=0;
		char[] str1=str.toCharArray();
		for(int i=0;i<=str1.length-1;i++) {
			if(str1[i]==targetChar) {
				count=count+1;	
									}
			
			
			}
				
		System.out.println("Number of occurrance of "+targetChar+" is "+ count +" times"); 
		
	}

}
