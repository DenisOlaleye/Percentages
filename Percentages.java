/*a. Create an application named Percentages whose main() method holds
two double variables. Assign values to the variables. Pass both variables to
a method named computePercent() that displays the two values and the
value of the first number as a percentage of the second one. For example, if
the numbers are 2.0 and 5.0, the method should display a statement similar
to “2.0 is 40 percent of 5.0.” Then call the method a second time, passing the
values in reverse order. Save the application as Percentages.java.
b. Modify the Percentages class to accept the values of the two doubles from a
user at the keyboard. Save the file as Percentages2.java.*/

import java.util.Scanner;

public class Percentages 
{
	public static void main (String [] args)
	{
		double one;
		double two;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter firs number ");
		one = input.nextDouble();
		System.out.println("Enter second number ");
		two = input.nextDouble();
		computePercent(one, two);
	}
		
		public static void computePercent(double one, double two)
		{
			double percentOf = one/two;
			double percentage = percentOf*100;
			
			System.out.println(one+ " is " +percentage+ "% of " +two);
			
			double percentRevers = two/one;
			double percentage1 = percentRevers * 100;
			
			System.out.println(two+ " is " +percentage1+ "% of " +one);
		
		}

}


