package ageofempires;

import ageofempires.buildings.*;
import ageofempires.civilisations.*;
import ageofempires.resources.*;
import ageofempires.units.*;

public class Test {
	public static void main(String[] args) {
		Civilisation civilisation = new Shang(3, 4); // create civilisation here
		System.out.println("---------------------------------------");
		Unit unit = new Villager(20, 7, civilisation);
		Building building = new TownCentre(30, 4, civilisation);
		// Source resource = new Stone(45.3f, 34.1f);
	}
}