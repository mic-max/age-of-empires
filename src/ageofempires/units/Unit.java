package ageofempires.units;

import ageofempires.*;
import ageofempires.civilisations.*;

public abstract class Unit extends MapObject {
	public Unit(float x, float y, Civilisation civilisation) {
		super(x, y, civilisation);
	}
}