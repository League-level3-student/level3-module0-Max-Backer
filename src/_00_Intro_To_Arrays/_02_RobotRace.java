package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Random rand = new Random();
		Robot[] robots = new Robot[5];
		boolean moving = true;
		// 3. use a for loop to initialize the robots

		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();

			robots[i].moveTo(100 + i * 170, 400);

			robots[i].setSpeed(10);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (moving) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(rand.nextInt(0, 50));
				if (robots[i].getY() < 0) {
					robots[i].sparkle();
					moving = false;
					System.out.println("Robot number " + i + 1 + " wins");
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.
		
		// 9. make the robots race around a circular track.

	}
}
