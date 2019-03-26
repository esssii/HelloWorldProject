package Bubblesort;

public class Bubblesort {

	public static void main(String[] args) {
		// Bubblesort Array
		// Länge der Reihe
		int[] zahlen = { 2, 4, 3, 5, 7, 4, 9, 8 };
		System.out.println("Die Reihe hat " + zahlen.length + " Zahlen");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
		//
		System.out.println("Bubblesort");
		//
		// Bubblesort
		for (int z = zahlen.length; z > 1; z--) {
			for (int s = 0; s < z - 1; s++) {
				if (zahlen[s] > zahlen[s + 1]) {
					int a = zahlen[s];
					zahlen[s] = zahlen[s + 1];
					zahlen[s + 1] = a;

				}
			}
		}
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}
}