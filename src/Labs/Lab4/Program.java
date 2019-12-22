package Labs.Lab4;

public class Program {

	public static void main(String[] args) {
		Product[] products = { new DVD(100.0, 10, 2.2, "Avatar", "James Cameron", 2.0),
				new DVD(100.0, 5, 2.0, "How to train dragon 3", "Dean DeBlois"),
				new CD(20.0, 2, 1.0, "Christmas songs", "Band") };

		for (Product product : products) {
			if (product instanceof DVD) {
				DVD dvd = (DVD) product;
				System.out.println(String.format("DVD:\n\tTitle: %s\n\tDirector: %s\n\tRental cost: %.1f", dvd.getTitle(), dvd.getDirector(), dvd.getRentalCost()));
			} else if (product instanceof CD) {
				CD cd = (CD) product;
				System.out.println(String.format("CD:\n\tTitle: %s\n\tArtist: %s\n\tRental cost: %.1f", cd.getTitle(), cd.getArtist(), cd.getRentalCost()));
			}
		}
	}
}