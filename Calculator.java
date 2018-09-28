import java.util.Scanner;
import java.io.*;

public class Calculator {
 
	public int add(int num1, int num2){
 
		int sum;
		sum = num1 + num2;
 
	return sum;
	
	}
 
	public int sub(int num1, int num2){

 		int sum;
		sum = num1 - num2;

 		return sum;
	}

 
	public int multi(int num1, int num2){
 
		int sum;
		sum = num1 * num2;

 		return sum;

	}
 
	public int div(int num1, int num2){

 		int sum;
		sum = num1 / num2;
 
		return sum;

	}

 
    public static void main(String[] args) {
 
    	int choice;

    	int x;

    	int y;

    	int result;

    	PrintStream out;

     	Calculator calc = new Calculator();
 
    	try

    	{
    		out = new PrintStream ("output.txt");
 
    		do

    		{

    			System.out.println("Calculator");

    			System.out.println("-----------------");

    			System.out.println("|1.  Add        |");

    			System.out.println("|2.  Subtract 	|");

    			System.out.println("|3.  Multiply 	|");

    			System.out.println("|4.  Divide	|");

    			System.out.println("|0.  Exit	|");
    			System.out.println("-----------------\n");

    			System.out.println("Enter Your Choice: ");

 
    			Scanner input = new Scanner(System.in);

    			choice = input.nextInt();

    			while ((choice < 1 || choice > 4)&& choice!=0)
    			{

    				System.out.println("Please choose a valid option: " );

    				choice = input.nextInt();
    			

    			}
    			if(choice>=1 && choice<=4)
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();

    			y = input.nextInt();

 
    				switch (choice)

    				{

    					case 1: 

    						result = calc.add(x,y);

    						System.out.printf("The sum is %d\n\n",result);

    						out.println(x + "+" + y + "=" + result);

    						break;

 
    					case 2:

    						result = calc.sub(x,y);

    						System.out.printf("The sub is %d\n\n",result);

    						out.println(x + "-" + y + "=" + result);

    						break;

 
    					case 3:

    						result = calc.multi(x,y);

    						System.out.printf("The Multiplication is %d\n\n",result);

    						out.println(x + "*" + y + "=" + result);

    						break;

 
    					case 4:

    						result = calc.div(x,y);

    						System.out.printf("The Div is %d\n\n",result);

    						out.println(x + "/" + y + "=" + result);

    						break;
    						
    					case 0:
    						
    						System.exit(0);
    						
    						break;   					
    				}
    				
    				input.close();	
    		}

    		while (choice != 0);
    		 
    	}
 
    	catch(Exception e)

    	{

    		System.out.println("ERROR: Could not open file!");

    	}
    	

  
    }

}
