package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded implements Runnable {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	static Robot ring1 = new Robot();
	static Robot ring2 = new Robot();
	static Robot ring3 = new Robot();
	static Robot ring4 = new Robot();
	static Robot ring5 = new Robot();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				ring1.move(2);
				ring1.turn(1);
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				ring2.move(2);
				ring2.turn(1);
			}
		});
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				ring3.move(2);
				ring3.turn(1);
			}
		});
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				ring4.move(2);
				ring4.turn(1);
			}
		});
		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				ring5.move(2);
				ring5.turn(1);
			}
		});

		ring1.penDown();
		ring2.penDown();
		ring3.penDown();
		ring4.penDown();
		ring5.penDown();
		ring1.setSpeed(9000);
		ring2.setSpeed(9000);
		ring3.setSpeed(9000);
		ring4.setSpeed(9000);
		ring5.setSpeed(9000);
		ring1.setPenColor(Color.BLUE);
		ring5.setPenColor(Color.RED);
		ring3.setPenColor(Color.BLACK);
		ring2.setPenColor(Color.YELLOW);
		ring4.setPenColor(Color.GREEN);
		ring3.setX(ring1.getX() + 240);
		ring5.setX(ring3.getX() + 240);
		ring2.setX(ring1.getX() + 120);
		ring2.setY(ring2.getY() + 120);
		ring4.setX(ring3.getX() + 120);
		ring4.setY(ring4.getY() + 120);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
