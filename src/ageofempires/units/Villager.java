package ageofempires.units;

import ageofempires.civilisations.*;

public class Villager extends Unit {
	public Villager(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return null;
	}
}