package testing1;

public class MultiThreadGardenerWatering {
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