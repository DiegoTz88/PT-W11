package homework_week_11.entity;

public class Cheese {

	private String name;
	
	
	
	public Cheese(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return  name + " Cheese";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
