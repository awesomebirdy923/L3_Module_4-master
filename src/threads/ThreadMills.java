package threads;

public class ThreadMills implements Runnable {

	Thread t1;

	public ThreadMills() {
		t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("Hi.");
			}
		});
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new ThreadMills().run();
	}

}
