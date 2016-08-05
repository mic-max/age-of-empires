package ageofempires;

import ageofempires.civilisations.*;

public abstract class MapObject {
	protected float x, y;
	protected Civilisation civilisation;

	public MapObject(float x, float y, Civilisation civilisation) {
		this.x = x;
		this.y = y;
		this.civilisation = civilisation;
		System.out.println(this);
	}

	protected void update() {
	}

	protected void render() {
	}

	public abstract String getModel();

	protected String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return String.format("%s %s @ (%f, %f)", civilisation, getName(), x, y);
	}
}