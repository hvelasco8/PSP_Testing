package testing1;

public class GardenerWatering_99Threads implements Runnable {
	private static int wateringCounter = 0;
	private int wateringTime;
	private String gardenerName;

	public GardenerWatering_99Threads(String gardenerName, int wateringTime) {
		this.gardenerName = gardenerName;
		this.wateringTime = wateringTime;
	}

	public void setWateringCounter(int wateringCounter) {
		GardenerWatering_99Threads.wateringCounter = wateringCounter;
	}

	@Override
	public void run() {
		System.out.println(gardenerName + " started watering with counter " + wateringCounter + ".");
		try {
			Thread.sleep(wateringTime*1000L);
		} catch (InterruptedException e) {
			System.out.println(gardenerName + " was interrupted while watering.");
		}
		System.out.println(gardenerName + " finished watering with counter " + wateringCounter + ".");
	}


	public static void main(String[] args) {
		GardenerWatering_99Threads gardener = new GardenerWatering_99Threads("Dahlia the gardener", 3);

		for (int i = 0; i < 99; i++) {
			Thread thread1 = new Thread(gardener);
			thread1.start();
			gardener.setWateringCounter(i);
		}

		System.out.println("All threads started...");
	}
}
