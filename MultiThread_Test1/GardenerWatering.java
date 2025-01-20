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
	
	public static void main(String[] args) {
		GardenerWatering gardener1 = new GardenerWatering("Dahlia the gardener", 3, "dhalias");
		GardenerWatering gardener2 = new GardenerWatering("Daisy the gardener", 2, "daisies");
		GardenerWatering gardener3 = new GardenerWatering("Orchid the gardener", 1, "orchids");

		gardener1.start();
		gardener2.start();
		gardener3.start();

		System.out.println("All gardeners are gardening...");
	}
}
