import java.util.Arrays;
import java.util.Scanner;
public class TextLab11aMain {

	public static void main(String args[]){

				// This main method needs additions for the 100 point version.
				Scanner input = new Scanner(System.in);
				System.out.println("How many prime numbers do you wish to compute? >>>>>");
				final int MAX = input.nextInt() + 1;
				int index = 1;
				
				boolean primes1[];
				primes1 = new boolean[MAX];
				while (index < MAX){
					primes1[index] = true;
					index ++;
				}
				
				
				displayPrimes(computePrimes(primes1));
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
			    System.out.println(primes.length);
				while ( i < primes.length)			// goes through each number starting at 2
				{
					if (i > 2 ){
						
					}
					
					if( primes[i] = true )			// if value is prime will do loop below
					{	
						int k = i;
						while (k+k < primes.length)	//changes all multiples of number to not prime
						{
							k +=k;
							primes2[k] = false;
							System.out.println(Arrays.toString(primes2));
						}
						
					}
					i++;
					System.out.println("I made it!");
				}
				return primes2;
				
			}

			public static void displayPrimes(boolean primes2[])
			{
				System.out.println("\nPRIMES BETWEEN 1 AND "+ (primes2.length-1));
				int i = 1;
				
				while (i < primes2.length){
					if (primes2[i] == true ){
					System.out.println(i);
					}
					i++;
				}	
			}
}
			
			

