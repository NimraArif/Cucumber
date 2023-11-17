package step_definitions;

public class ResturantMenuItemCart {
	private String name;
	private int price;
	
	public ResturantMenuItemCart(String name, int prive) {
		super();
		this.name = name;
		this.price = prive;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
}



}
