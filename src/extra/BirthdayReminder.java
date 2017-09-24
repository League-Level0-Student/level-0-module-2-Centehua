//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		
		// 1. OPTION: correct the birthdays for your family below
		String momsBirthday = "October 10th";
		String dadsBirthday = "June 3th";
		String myBirthday = "March 18th";

		// 2. Find out whose birthday the user wants and and store their response in a variable
	String userBDay =JOptionPane.showInputDialog("What birthday do you want?");
	
		// 3. Print out what the user typed
		System.out.println(userBDay);
		// 4. if user asked for "mom"
		if(userBDay.equalsIgnoreCase("mom's birthday")){
			System.out.println(momsBirthday);
		} else if(userBDay.equalsIgnoreCase("dad's birthday")) {
			System.out.println(dadsBirthday);
		} else if(userBDay.equalsIgnoreCase("my birthday")) {
			System.out.println(myBirthday);
		}else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		} 
		
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for you
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

}
