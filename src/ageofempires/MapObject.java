package ageofempires;

import ageofempires.civilisations.*;
import ageofempires.resources.*;

public abstract class MapObject {
	protected float x, y;
	protected Civilisation civilisation;
	protected int health;

	public MapObject(float x, float y, Civilisation civilisation) {
		this.x = x;
		this.y = y;
		this.civilisation = civilisation;
		this.health = getBaseHealth();
		System.out.println(this);
	}

	protected void update() {
	}

	protected void render() {
	}

	// getters for static properties
	public String getModel() {
		return getModel();
	}

	public int getBuildTime() {
		return getBuildTime();
	}

	public int getBaseHealth() {
		return getBaseHealth();
	}

	public Resource getCost() {
		return getCost();
	}

	protected String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return String.format("%s %s @ (%f, %f) HEALTH: %d/%d", civilisation, getName(), x, y, health, getBaseHealth());
	}
}