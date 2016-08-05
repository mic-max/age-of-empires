package ageofempires.units;

import ageofempires.civilisations.*;
import ageofempires.resources.*;

public class Villager extends Unit {
	private static final String MODEL = "[Villager 3D Model]";
	private static final Resource COST = new Resource(50, 0, 0, 0);
	private static final int BUILD_TIME = 20;
	private static final int BASE_HEALTH = 25;

	public Villager(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return MODEL;
	}

	@Override
	public int getBuildTime() {
		return BUILD_TIME;
	}

	@Override
	public Resource getCost() {
		return COST;
	}

	@Override
	public int getBaseHealth() {
		return BASE_HEALTH;
	}
}