package ageofempires.buildings;

import ageofempires.civilisations.*;

public class TownCentre extends Building {
	public TownCentre(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}

	@Override
	public String getModel() {
		return null;
	}

	@Override
	public String getName() {
		return "Town Centre";
	}
}