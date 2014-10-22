/*
 * Michael Ng
 * Yu Sun
 * CS356
 * Project 1: iClicker
 */

import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean MC = false; //set if multiple choice question
		String input;
		Scanner kb = new Scanner(System.in);

		System.out
				.println("Do you want to ask a Multiple Choice question? y/n");  //ask user if they want a multiple choice question
		input = kb.nextLine();
		input.toUpperCase();
		if (input.equals("YES") || input.equals("Y"))
			MC = true;

		Student[] s = new Student[30];  //create new student object
		iClicker c = new iClicker();	//create new iclicker object
		Questions q = new Questions();	//create new question object

		for (int j = 0; j < 30; j++)	//create 30/i student objects
			s[j] = new Student();

		for (int i = 0; i < 30; i++) {	//get students to answer questions
			if (MC == true) {
				c.addAnswer(s[i].getID(), s[i].submitMC());
			} else {
				c.addAnswer(s[i].getID(), s[i].submitTF());
			}
		}

		Object[] array = new Object[30];	//create new object array to hold results
		//System.out.print(c.map.values());
		array = c.map.values().toArray();	
		q.setMC(MC);	//set questions to multiple choice or T/F
		q.addAnswer(array, 30);	//Count results
		q.printResults();	//print counted results
		

	}
}