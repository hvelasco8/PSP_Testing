package testing1;

class GardenerWatering extends Thread {
	private String gardenerName;
	private int wateringTime;
	private String flower;
	
	public GardenerWatering(String petName, int eatingTime, String flower) {
		this.gardenerName = petName;
		this.wateringTime = eatingTime;
		this.flower = flower;
	}

	public void run() {
		System.out.println(gardenerName + " started watering.");
		try {
			Thread.sleep(wateringTime * 1000L);
		} catch (InterruptedException e) {
			System.out.println(gardenerName + " was interrupted while watering.");
		}
		System.out.println(gardenerName + " finished watering " + flower + ".");
	}
}