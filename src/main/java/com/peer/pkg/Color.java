package com.peer.pkg;

public class Color {
	private String colorName;
	private int colorID;
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public int getColorID() {
		return colorID;
	}
	public void setColorID(int colorID) {
		this.colorID = colorID;
	}
	public Color(String colorName, int colorID) {
		super();
		this.colorName = colorName;
		this.colorID = colorID;
	}
	
	

}
