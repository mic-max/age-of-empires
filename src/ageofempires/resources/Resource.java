package ageofempires.resources;

public class Resource {
	int food, wood, gold, stone;

	public Resource(int food, int wood, int gold, int stone) {
		this.food = food;
		this.wood = wood;
		this.gold = gold;
		this.stone = stone;
	}

	@Override
	public String toString() {
		return String.format("%d Food, %d Wood, %d Gold, %d Stone", food, wood, gold, stone);
	}
}