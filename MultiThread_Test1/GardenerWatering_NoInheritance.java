package testing1;

public class GardenerWatering_NoInheritance implements Runnable {
	private String gardenerName;
	private int wateringTime;
	
	public GardenerWatering_NoInheritance(String gardenerName, int wateringTime) {
		super();
		this.gardenerName = gardenerName;
		this.wateringTime = wateringTime;
	}
	
	@Override
	public void run() {
		System.out.println(gardenerName + " started watering.");
		try {
			Thread.sleep(wateringTime*1000L);
		} catch (InterruptedException e){
			System.out.println(gardenerName + " was interrupted while watering.");
		}
		System.out.println(gardenerName + " finished watering.");
	}
	
}
