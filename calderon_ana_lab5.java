
public class calderon_ana_lab5 {
	
	public static void main(String args[]) {
		
		// 1. given any number n. print values in the following way
		//    input: n = 11
		//	  output:  11 8 5 4 1 -2 1 4 5 8 11
		
		// 2. get sum of all the integer numbers in a string
		//    input: str = "ab1c2dd4g55a"
		//    output: 17
		int n = 11;
		printValues(n);

		String str = "ab1c2dd4g55a";
		System.out.println("\nThe sum of the digits is " + sum_of_digit(str));
	}

	static void printValues(int n){
		
		if(n>=0){
			System.out.println(n);
			printValues(n-3);
		}
			
		System.out.println(n);
	
	}

	static int sum_of_digit(String str) {  
        int sum = 0;
        if (str.length()<1){
        	return 0; 
        } 
        if(Character.isDigit(str.charAt(0))){
        	int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        	sum = sum + a;
        }

        return sum+sum_of_digit(str.substring(1)); 
    } 
    
}
