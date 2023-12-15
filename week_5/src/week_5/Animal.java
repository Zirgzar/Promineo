package week_5;

public class Animal {
	
	String name;
	String type;
	double weight;
	double height;
	String location;
	
	public Animal() {}
	
	public Animal(String name, String type, double weight, double height, String location) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void describe() {
		System.out.println("Animal Description");
		System.out.println("------------------");
		System.out.println("\tName: " + name);
		System.out.println("\tType: " + type);
		System.out.println("\tWeight: " + weight + " kg");
		System.out.println("\tHeight: " + height + " cm");
		System.out.println("\tLocation: " + location);
	}

}
