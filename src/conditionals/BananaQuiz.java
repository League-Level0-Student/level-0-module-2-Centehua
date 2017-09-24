//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String userFruit = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if(userFruit.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null,"You are crazy!");
			System.exit(0);
		} else if(userFruit.equalsIgnoreCase("yes")) {
			String userH=JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, userH+ " is much better with bananas!");
			System.exit(0);
		} 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
