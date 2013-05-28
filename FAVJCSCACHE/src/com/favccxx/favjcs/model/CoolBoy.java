package com.favccxx.favjcs.model;

import java.io.Serializable;

public class CoolBoy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1755725468766564159L;
	
	private String boyName;
	private int boyHeight;
	private String tShirt;
	private String hairColor;
	
	
	public String getBoyName() {
		return boyName;
	}
	public void setBoyName(String boyName) {
		this.boyName = boyName;
	}
	public int getBoyHeight() {
		return boyHeight;
	}
	public void setBoyHeight(int boyHeight) {
		this.boyHeight = boyHeight;
	}
	public String gettShirt() {
		return tShirt;
	}
	public void settShirt(String tShirt) {
		this.tShirt = tShirt;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	
}
