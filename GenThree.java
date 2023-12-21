/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */


public class GenThree {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]) ;
                int num2 = Integer.parseInt(args[1]) ;

		int a = (int)(num1 + Math.random() * (num2 - num1)) ;
		System.out.println(a) ;
                int b = (int)(num1 + Math.random() * (num2 - num1)) ;
		System.out.println(b) ; 	
		int c = (int)(num1 + Math.random() * (num2 - num1)) ;
		System.out.println(c) ;

		int minNumber = Math.min( a ,  b) ;
		minNumber = Math.min( minNumber , c ) ;

		System.out.println( "The minimal generated number was " + minNumber ) ;
 
    }
}	
