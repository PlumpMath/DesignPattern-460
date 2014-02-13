package com.coosam.factory.abstractfactory;

/**
 * 具体产品
 * 
 * @author Administrator
 * 
 */
public class WesternTrousers extends Trousers {
	private int waistSize;
	private int height;
	private String name;

	WesternTrousers(String name, int waistSize, int height) {
		this.name = name;
		this.waistSize = waistSize;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public int getWaistSize() {
		return waistSize;
	}
}
