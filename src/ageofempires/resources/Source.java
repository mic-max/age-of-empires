package ageofempires.resources;

import ageofempires.*;

public abstract class Source extends MapObject {
	// needs a new parent class
	protected Resource resource;

	public Source(float x, float y) {
		super(x, y, null);
	}
}