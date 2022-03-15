
package bankdemo.java;

import java.util.Scanner;

public class account extends RuntimeException 
{
	String message;
	static int balance;
	public account(String message) {
	super(message);
	
	}
	
	

	public static void main(String[] args) 
	{
		Scanner balance_input=new Scanner(System.in);
		System.out.println("Please enter your balance amount");
		int balance = balance_input.nextInt();
		System.out.println("Amount Entered is" +balance);
		
		if(balance <= 10000)
		{
			throw new account ("Your Account balance is low");
			
		}
		else if(balance >10000 && balance<50000)
		
		
		{
			throw new account ("Your Account balance is healthy");
			
			
		}
		else if(balance>10000) 
		{
		
			throw new account ("Your account balance is sufficient");
		}
		 
		

	}

}
