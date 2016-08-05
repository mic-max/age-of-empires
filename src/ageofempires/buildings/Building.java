package ageofempires.buildings;

import ageofempires.*;
import ageofempires.civilisations.*;

public abstract class Building extends MapObject {
	public Building(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	protected abstract int getPopulation();
}