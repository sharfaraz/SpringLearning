package com.peer.pkg;

public class Animals {
	private int height;
	private int weight;
	private Color color;
	
	public Animals() {
		super();
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	private String speciesName;
	

	
    public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getSpeciesName() {
		return speciesName;
	}



	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}



	public Animals( int height, int weight, String speciesName, Color color) {
		this.height = height;
		this.weight = weight;
		this.speciesName = speciesName;
		this.color = color;
	}

}
