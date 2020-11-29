package introduction.rightturner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import kareltherobot.Directions;
import kareltherobot.World;

public class FancyRightTurnerTest {

	@Test
	public void testTurnRight() {
		World.setSize(1, 1);
		World.setDelay(0);

		FancyRightTurner robot = new FancyRightTurner(1, 1, Directions.East);
		robot.turnRight();
		assertTrue(robot.facingSouth());
	}

}
