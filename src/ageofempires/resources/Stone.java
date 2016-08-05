package ageofempires.resources;

public class Stone extends Source {
	public Stone(float x, float y) {
		super(x, y);
	}

	@Override
	public String getModel() {
		return null;
	}

	@Override
	public int getBuildTime() {
		return 0;
	}

	@Override
	public Resource getCost() {
		return null;
	}
}