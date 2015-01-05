import java.text.DecimalFormat;
import java.util.Scanner;

public class TextLab11a_Matthew_Pearce {
	
	public static void main(String args[]){

		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the primes upper bound  ===>>   >>>>>");
		final int MAX = input.nextInt() + 1;
		int index = 2;
		
		boolean primes1[];
		primes1 = new boolean[MAX];
		while (index < MAX){
			primes1[index] = true;
			index ++;
		}
		
		displayPrimes(computePrimes(primes1));		//compute primes recieves the returned array and passes it to the display primes
	}

	public static boolean[] computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		
		//creates a duplicate array
		int r = 0;
		boolean[] primes2 = new boolean[primes.length];
	    while(r < primes.length) { 
		
	         primes2[r] = primes[r];
	    r++;
	    }
	    //////////////////
	    
	    int i = 2; //loop control + index counter
		while ( i < primes.length -1 )			// goes through each number starting at 2
		{
			if( primes[i] = true )			// if value is prime will do loop below
			{	
				int k = i;
				int t = k;  // t stores intial value of k
				while (k + t < primes.length)	//changes all multiples of number to not prime
				{
					k = k + t;	
					primes2[k] = false;	
				}
			}
			i++;
		}
		return primes2;
	}

	public static void displayPrimes(boolean primes2[])
	{
		System.out.println("\nPRIMES BETWEEN 1 AND "+ (primes2.length-1));
		
		DecimalFormat prime = new DecimalFormat("0000 ");
		int i = 1;
		int counter = 0; //for total number of primes
		int last = 0;  // for largest prime number
		while (i < primes2.length){
			if (primes2[i] == true ) 	// if index reads true will print out that location
			{
				
				System.out.print(prime.format(i));
				last = i;
				counter ++;
			}
			i++;
		}	
		System.out.println("\n\nThe largest prime number is: " + prime.format(last));
		System.out.println("The total number of prime numbers in the range you entered is: " + counter);
	}
}
