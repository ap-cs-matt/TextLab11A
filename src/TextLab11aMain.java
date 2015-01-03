import java.util.Arrays;
import java.util.Scanner;
public class TextLab11aMain {

	public static void main(String args[]){

				// This main method needs additions for the 100 point version.
				Scanner input = new Scanner(System.in);
				System.out.println("How many prime numbers do you wish to compute? >>>>>");
				final int MAX = input.nextInt() + 1;
				int index = 1;
				int counter = 0;
				
				boolean primes[];
				primes = new boolean[MAX];
				while (index < MAX){
					primes[index] = true;
					index ++;
				}
				System.out.println(Arrays.toString(primes));
				computePrimes(primes);
				displayPrimes(primes);
			}

			public static void computePrimes(boolean primes[])
			{
				System.out.println("\nCOMPUTING PRIME NUMBERS");
				int i = 2; //loop control + index counter
				
				while ( i < primes.length)			// goes through each number starting at 2
				{
					if( primes[i] = true )			// if value is prime will do loop below
					{	
						int k = i;
						while (k < primes.length && k+k < primes.length)	//changes all multiples of number to not prime
						{
							k +=k;
							primes[k] = false;
							System.out.println("false");
							System.out.println(Arrays.toString(primes));
						}
					}
					i++;
				}
			}

			public static void displayPrimes(boolean primes[])
			{
				System.out.println("\n\nPRIMES BETWEEN 1 AND "+ (primes.length-1));
				int i = 1;
				
				while (i < primes.length){
					
					if (primes[i] == false ){
					System.out.println(i);
					}
					i++;
				}
				
			}
	}

