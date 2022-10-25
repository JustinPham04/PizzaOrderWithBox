package mypackage;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Assignment4 
{

	public static void main(String[] args)
	{
		// TASK #1: declare scanner and variables
		Scanner in = new Scanner(System.in); 
		String userName;
		int pizzaInches; 
		boolean discount = false; 
		double ordercost = 0; 
		String crustType; 
		String topping = "Cheese";
		int numberofToppings = 0; 
		String choiceYN;
		char ch; 
		final double TAXRATE = 0.08; 
		double tax;
		double totalordercost; 
		JOptionPane.showMessageDialog(null, "Welcome to Pizza ");
		
		
		//TASK #2: Comparing Strings, Using a Flag as a Condition
		
		System.out.println("Welcome to Our Pizzeria");
		System.out.println("Enter your first name: ");
		userName = JOptionPane.showInputDialog("What is your name?");
		
		//pizza menu
		System.out.println("Pizza Size(inches)      Cost");
		System.out.println("        10              $10.99");
		System.out.println("        12              $12.99");
		System.out.println("        14              $14.99");
		System.out.println("        16              $16.99");

		
		//discount statement 
		if (userName.equals("Adam")|| userName.equals("May")|| userName.equals("adam")|| userName.equals("may"))
		{
			discount = true;
			System.out.println("Your are eligible for a $2.00 discount");
			ordercost = ordercost - 2; 
		}
		
		
		//TASK #3: The if-else-if Statements 
		System.out.println("What size pizza would you like?"); 
		System.out.println("10, 12, 14, or 16 (enter the number only): ");
		
		pizzaInches = Integer.parseInt(JOptionPane.showInputDialog("Enter the size"));
		
		//implement the if else, else if  statements 
		if (pizzaInches == 10)
		{
			ordercost = ordercost + 10.99; 
		}
		else if (pizzaInches == 12)
		{
			ordercost = ordercost + 12.99;
		}
		else if (pizzaInches == 14)
		{
			ordercost = ordercost + 14.99;
		}
		else if (pizzaInches == 16)
		{
			ordercost = ordercost + 16.99;
		}
		else
		{
			ordercost = ordercost + 12.99; 
			pizzaInches = 12; 
		}
		
		
		//TASK #4: The switch statements
		
		System.out.println("What type of crust do you want?");
		System.out.println("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): All pizzas come with cheese.");
		crustType = JOptionPane.showInputDialog("What type of crust do you want H, T or D");
		
		switch(crustType)
		{
			case "H":
			case "h":
				crustType = "Hand-tossed"; break; 
			case "T":
			case "t": 
				crustType = "Thin-crust"; break;
			case "D":
			case "d": 
				crustType = "Deep-dish"; break;
			default: 
				crustType = "Hand-tossed"; break; 
		}
		
		//TASK #5: String Concatenation
		
		System.out.println("Additional toppings are $1.25 each, choose from:");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom");
		System.out.print("Do you want Pepperoni? (Y/N): ");
		choiceYN = JOptionPane.showInputDialog("Do you want to add Pepperoni");
		ch = choiceYN.charAt(0); 
		if (ch == 'Y' || ch == 'y' )
		{ 
			numberofToppings++; 
			topping = topping + " Pepperoni";
			ordercost = ordercost + 1.25; 
		}
		System.out.print("Do you want Sausage? (Y/N): ");
		choiceYN = JOptionPane.showInputDialog("Do you want to add Sausage");
		ch = choiceYN.charAt(0); 
		if (ch == 'Y' || ch == 'y')
		{ 
			numberofToppings++; 
			topping = topping + " Sausage"; 
			ordercost = ordercost + 1.25;
		}
		System.out.print("Do you want Onion? (Y/N): ");
		choiceYN = JOptionPane.showInputDialog("Do you want to add Onion");
		ch = choiceYN.charAt(0); 
		if (ch == 'Y' || ch == 'y')
		{ 
			numberofToppings++; 
			topping = topping + " Onion"; 
			ordercost = ordercost + 1.25;
		}
		
		System.out.print("Do you want Mushroom? (Y/N): ");
		choiceYN = JOptionPane.showInputDialog("Do you want to add Mushroomon");
		ch = choiceYN.charAt(0); 
		if (ch == 'Y' || ch == 'y')
		{ 
			numberofToppings++; 
			topping = topping + " Mushroom"; 
			ordercost = ordercost + 1.25;
		}
		
		
		//TASK #6: Formatting Output 
		
		//calculate tax
		tax = (TAXRATE * ordercost) - 0.01; 
		totalordercost = (ordercost + tax); 
		System.out.println("");
		System.out.println("Your order is as follows:");
		System.out.println(pizzaInches + "-inch pizza");
		System.out.println(crustType + " crust");
		System.out.println(topping);
		System.out.printf("The cost of your order is: $%.2f %n", ordercost);
		System.out.printf("The tax is: $%.2f %n", tax );
		System.out.printf("The total due is: $%.2f %n", totalordercost);
		System.out.println("Your order will be ready for pickup in 30 minutes.");
		String message = String.format("The total due is $%.2f", totalordercost);
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showMessageDialog(null, "Your order will be ready for pick up in 30 minutes.");
		
	}
}
