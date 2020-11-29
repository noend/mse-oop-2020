package introduction.rightturner;

import kareltherobot.Robot;

public class RightTurner extends Robot {

	/**
	 * 
	 * @param street    the starting X
	 * @param avenue    the starting Y
	 * @param direction the starting direction the robot facing
	 * 
	 */
	public RightTurner(int street, int avenue, Direction direction) {
		super(street, avenue, direction, 0);
		// TODO Auto-generated constructor stub
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
