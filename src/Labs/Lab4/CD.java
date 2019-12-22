package Labs.Lab4;

public class CD extends Playable {

	public CD(double price, int numStock, double runtime, String title, String artist) {
		super(price, numStock, runtime, title);
		
		this.setArtist(artist);
	}
	
	public CD(double price, int numStock, double runtime, String title, String artist, double rentalCost) {
		super(price, numStock, runtime, title);
		this.setRentalCost(rentalCost);
	}

	protected String artist;

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
