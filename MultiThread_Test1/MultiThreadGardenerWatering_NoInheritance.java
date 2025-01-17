package testing1;

public class MultiThreadGardenerWatering_NoInheritance {
	public static void main (String[] args) {
		GardenerWatering_NoInheritance  gardener1 = new GardenerWatering_NoInheritance("Dahlia the gardener", 3);
		GardenerWatering_NoInheritance gardener2 = new GardenerWatering_NoInheritance("Daisy the gardener", 2);
		GardenerWatering_NoInheritance gardener3 = new GardenerWatering_NoInheritance("Orchid the gardener", 1);
		
		Thread thread1 = new Thread(gardener1);
		Thread thread2 = new Thread(gardener2);
		Thread thread3 = new Thread(gardener3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("All gardeners are gardening...");
	}
}
