package ageofempires;

public class MapObject {
	
	protected String name;
	protected float x, y;
	
	public MapObject(String name, float x, float y) {
		this.name = name;
		this.x = x;
		this.y = y;
		
		System.out.println(this);
	}
	
	public String toString() {
		return String.format("%s: %s @ (%f, %f)", getClass().getName(), name, x, y);
	}
}