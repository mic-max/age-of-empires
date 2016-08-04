package ageofempires;

import ageofempires.buildings.*;
import ageofempires.civilisations.*;
import ageofempires.resources.*;
import ageofempires.units.*;

public class Test {
	public static void main(String[] args) {
		Unit unit = new Villager("John", 20, 7);
		Building building = new TownCentre("Town Centre", 30, 4);
		Resource resource = new Stone("Igneous", 45.3f, 34.1f);
		
		
		Civilisation civilisation = new Shang("Shang", 3 , 4);
	}
}
