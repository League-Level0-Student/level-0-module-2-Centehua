//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class RocketShip {
	public static void main(String[] args) {
		
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String userTime = JOptionPane.showInputDialog("When would you like to start?");
//		// 3. convert the user's answer to an int (Integer.parseInt)
		int num= Integer.parseInt(userTime);
		// 4. count down from user's starting point
		for (int i = num; i >= 0; i--) {
			
			System.out.println(i);
			
		}
		
		// 1. count down from 10 to 0 (print each number)
//		for (int i = 10; i >=0 ; i--) {
//			System.out.println(i);
//		}
		// 5. when the counting is done, print "blastoff!"
		speak("blastoff!");
		// 6. replace the print commands with calls to the speak() method 
		
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

