package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	/////////////CONSTRUTOR-PADRÃO\\\\\\\\\\\\\\\

	public Product() {
	}
	
	/////////////END-CONSTRUTOR-PADRÃO\\\\\\\\\\\\\\\
	
	/////////////CONSTRUTOR\\\\\\\\\\\\\\\

	public Product(String name, double price, int quantity) {
		this.name = name;	
		this.price = price;
		this.quantity = quantity;
	}

	////////////END-CONSTRUTOR\\\\\\\\\\\\\
	
	/////////////SOBRECARGA\\\\\\\\\\\\\\\
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/////////////END-SOBRECARGA\\\\\\\\\\\\\\\
	
	public double TotalValueInStock () {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", TotalValueInStock());
	}
	
}
