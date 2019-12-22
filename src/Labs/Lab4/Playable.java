package Labs.Lab4;

public class Playable extends Product {
	protected double runtime;
	protected String title;
	protected double rentalCost;

	/**
	 * Create a new playable product.
	 * 
	 * @param price    The price of the product in pounds.
	 * @param numStock The amount of the product in stock.
	 * @param runTime  The runtime of the product.
	 * @param title    The title of the product.
	 */
	public Playable(double price, int numStock, double runtime, String title) {
		super(price, numStock);

		this.setRuntime(runtime);
		this.setTitle(title);
		
		this.setRentalCost(1.0);
	}

	/**
	 * Create a new playable product.
	 * 
	 * @param price    		The price of the product in pounds.
	 * @param numStock 		The amount of the product in stock.
	 * @param runTime  		The runtime of the product.
	 * @param title			The title of the product.
	 * @param rentalCost	The rental cost of the product.
	 * */
	public Playable(double price, int numStock, double runtime, String title, double rentalCost) {
		this(price, numStock, runtime, title);

		this.setRentalCost(rentalCost);
	}

	/**
	 * Get the runtime of the product.
	 * 
	 * @return The runtime of the product in minutes.
	 */
	public double getRuntime() {
		return runtime;
	}

	/**
	 * Set the runtime of the product in minutes.
	 * 
	 * @param runTime The runtime of the product in minutes.
	 */
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}

	/**
	 * Get the title of the product.
	 * 
	 * @return The title of the product.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title of the product.
	 * 
	 * @param title The title of the product.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the rental cost of the product
	 */
	public double getRentalCost() {
		return this.rentalCost;
	}

	/**
	 * Set the rental cost of the product
	 * 
	 * @param rentalCost The rental cost of the product
	 */
	public void setRentalCost(double rentalCost) {
		this.rentalCost = rentalCost;
	}
}
