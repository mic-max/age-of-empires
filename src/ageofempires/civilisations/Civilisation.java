package ageofempires.civilisations;

import java.util.*;

import ageofempires.buildings.*;
import ageofempires.units.*;

public abstract class Civilisation {
	
	protected String name;

	protected List<Unit> units = new ArrayList<Unit>();
	protected List<Building> buildings = new ArrayList<Building>();
	
	// x and y are the town centre's location
	public Civilisation(String name, float x, float y) {
		this.name = name;
		for(int i = 0; i < 4; i++)
			this.units.add(new Villager(i + "", 4, 5));
		this.buildings.add(new TownCentre("Civilisation Town Centre", x, y));
		
		System.out.println(this);
	}
	
	public String toString() {
		return getClass().getName() + ": " + name;
	}
}