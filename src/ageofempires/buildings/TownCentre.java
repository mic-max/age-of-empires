package ageofempires.buildings;

import ageofempires.civilisations.*;
import ageofempires.resources.*;

public class TownCentre extends Building {
	private static final int BASE_HEALTH = 600;
	private static final int POPULATION = 4;
	private static final Resource COST = new Resource(0, 200, 0, 0);
	private static final int BUILD_TIME = 60;
	private static final String MODEL = "[Town Centre Model]";

	public TownCentre(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return MODEL;
	}

	@Override
	public String getName() {
		return "Town Centre";
	}

	@Override
	protected int getPopulation() {
		return POPULATION;
	}

	@Override
	public int getBuildTime() {
		return BUILD_TIME;
	}

	@Override
	public int getBaseHealth() {
		return BASE_HEALTH;
	}

	@Override
	public Resource getCost() {
		return COST;
	}
}