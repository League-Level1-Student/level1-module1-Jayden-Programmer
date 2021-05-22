package _01_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar race = new RaceCar("Tesla", 5); 
		// 2. Print the RaceCar's position in the race 
		System.out.println(race.getPositionInRace());   
		// 3. Crash the RaceCar
		race.crash(); 
		// 4. If the car is damaged. Bring it in for a pit stop.
		race.pit();
		// 5. Help the car move into first place.
		while (race.getPositionInRace()!= 1) { 			//Explanation: The purpose of getPositionInRace is to make sure that if the position is not 1, it will repeat overtake and go forward positions until it is in its correct position at 1st place.  
		race.overtake();
//update: because of the while statment, the code would not stop trying to overtake the position in the race until it is succsesfully conducted.	
		//race is the name of the variable which means that in the methods in order to transfer methods to other files is by adding the name and the method you want Ex.) Race.getPositionInRace  
			
			// ! = not
			// ! no space
			//!=1 
			
		}   
	}
}
