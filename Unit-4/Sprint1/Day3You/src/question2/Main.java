package question2;

/*Question-2
Write a program to check if a number is divisible by 11 or not such that you need to use 
following way to check divisibility
- If the difference between the sums of the alternate digits of the given number is
 either 0 or divisible by 11, then the number is divisible by 11.

Examples:
1. Say number is 123321 so additions of alternate digits is 1 + 3 + 2 = 6 and 2 + 3 + 1 = 6 so 
the difference 6 - 6 = 0 so number is divisible by 11.
2. Say number is 9780 so additions of alternate digits is 9 + 8 = 17 and 7 + 0 = 7 so 
the difference 17 - 7 = 10 so number is not divisible by 11.
 * 
 */
public class Main {
	
	
	
	public static void main(String[] args) {
		int n=123321;
		int eSum=0;
		int oSum=0;
		int len=0;
		while(n>0) {
			n=n/10;
			len++;
		}
		
		while(len>=0) {
			if(len%2==0) {
				eSum+=n%10;
			}else {
				oSum+=n%10;
			}
			
			n=n/10;
			len--;
		}
		
		System.out.println(eSum+" "+oSum);
		
	}
}
