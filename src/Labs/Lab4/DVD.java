package Labs.Lab4;

public class DVD extends Playable {

	/**
	 * Create a new playable product.
	 * 
	 * @param price    		The price of the product in pounds.
	 * @param numStock 		The amount of the product in stock.
	 * @param runTime  		The runtime of the product.
	 * @param title			The title of the product.
	 * @param director		The director of the product.
	 * */
	public DVD(double price, int numStock, double runtime, String title, String director) {
		super(price, numStock, runtime, title, 1.2);
		 
		this.setDirector(director);
	}
	
	/**
	 * Create a new playable product.
	 * 
	 * @param price    		The price of the product in pounds.
	 * @param numStock 		The amount of the product in stock.
	 * @param runTime  		The runtime of the product.
	 * @param title			The title of the product.
	 * @param director		The director of the product.
	 * @param rentalCost	The rental cost of the product.
	 * */
	public DVD(double price, int numStock, double runtime, String title, String director, double rentalCost) {
		super(price, numStock, runtime, title, rentalCost);
		 
		this.setDirector(director);
	}

	protected String director;

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
