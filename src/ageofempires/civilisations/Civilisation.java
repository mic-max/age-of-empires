package ageofempires.civilisations;

import java.util.*;

import ageofempires.buildings.*;
import ageofempires.units.*;

public abstract class Civilisation {
	protected List<Unit> units = new ArrayList<Unit>();
	protected List<Building> buildings = new ArrayList<Building>();
	protected int maxPopulation; // equal to sum of buildings.population

	// x and y are the town centre's location
	public Civilisation(float x, float y) {
		for (int i = 0; i < 4; i++)
			this.units.add(new Villager(x, y, this)); // use x and y locations for TownCentre and spawn villagers nearby
		this.buildings.add(new TownCentre(x, y, this));
		System.out.println(this);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}