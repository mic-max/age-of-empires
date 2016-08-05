package ageofempires.units;

import ageofempires.civilisations.*;
import ageofempires.resources.*;

public class Villager extends Unit {
	public Villager(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return "[Villager 3D Model]";
	}

	@Override
	public int getBuildTime() {
		return 20;
	}

	@Override
	public Resource getCost() {
		return new Resource(50, 0, 0, 0);
	}

	@Override
	public int getBaseHealth() {
		return 25;
	}
}