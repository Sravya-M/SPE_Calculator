// Calculator Program for Devops
// Author: Sravya M, MT2019114
package calculator;
import java.util.*;

public class Calculator {
  public static void main(String[] args){
    System.out.println("CALCULATOR");
	
	int choice,flag=0;
	double operand1, operand2;
	Scanner scanner= new Scanner(System.in);
	
	do
	{
		System.out.println("Option Menu");
		System.out.println("1. Addition");
		System.out.println("2. Exit");
		System.out.println("Enter your choice");
		
		choice=scanner.nextInt();
		if(choice==2)
			flag=1;
		else
		{
			System.out.println("Enter 2 numbers");
			System.out.println("First operand:");
			operand1=scanner.nextDouble();
			System.out.println("Second operand:");
			operand2=scanner.nextDouble();
			
			switch(choice)
			{
				case 1:
					System.out.println(operand1+operand2);
					break;
				default:
					System.out.println("Exiting program");
					flag=1;
			}
		}
		System.out.println("");
	}while(flag==0);
	
  }//End of main
}