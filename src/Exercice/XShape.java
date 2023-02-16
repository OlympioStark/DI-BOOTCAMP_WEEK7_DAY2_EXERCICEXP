package Exercice;

public class XShape extends Shape {
	
	private String name;

	public XShape(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return super.getName() + ", " + this.name;
	}




}
