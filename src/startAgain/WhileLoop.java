package startAgain;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(StringExample[] args) {
		
//		int apples =1;
//		
//		while( apples <=10 ) 
//		{
//			System.out.println("I am eating apple :D");
//			apples +=2;
//		}
// 		 System.out.println("OK, I stopped eating apple");
		
		
//		int number; 
//		int count=0;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter your number");
//		
//		number = input.nextInt();
//		
//		while(count <=number) {
//			System.out.print(count +", ");
//			count+=5;
//		}
//		System.out.println("Ok, I think I am done");
//		
		Scanner keyboard = new Scanner(System.in); 
		int total=0;
		System.out.println("Enter a postive integer ");
		
		int nextNum = keyboard.nextInt();
		
		while(nextNum>0) {
			total = total + nextNum;
			nextNum = keyboard.nextInt();
			
			
		}
		
		System.out.println("Sum of all numbers: "+ total);
		
		
		
	
		
	}

}
