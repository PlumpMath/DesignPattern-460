package com.coosam.factory.factorymethod;

/**
 * 具体产品
 * 
 * @author Administrator
 * 
 */
public class RedPenCore extends PenCore {
	
	RedPenCore() {
		color = "红色";
	}

	public void writeWord(String s) {
		System.out.println("写出" + color + "的字" + s);
	}
}
