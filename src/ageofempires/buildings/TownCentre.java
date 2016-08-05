package ageofempires.buildings;

import ageofempires.civilisations.*;
import ageofempires.resources.*;

public class TownCentre extends Building {
	public TownCentre(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return "[Town Centre 3D Model]";
	}

	@Override
	public String getName() {
		return "Town Centre";
	}

	@Override
	protected int getPopulation() {
		return 4;
	}

	@Override
	public int getBuildTime() {
		return 60;
	}

	@Override
	public int getBaseHealth() {
		return 600;
	}

	@Override
	public Resource getCost() {
		return new Resource(0, 200, 0, 0);
	}
}