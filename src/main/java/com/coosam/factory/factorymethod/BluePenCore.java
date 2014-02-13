package com.coosam.factory.factorymethod;

/**
 * 具体产品
 * 
 * @author Administrator
 * 
 */
public class BluePenCore extends PenCore {
	BluePenCore() {
		color = "蓝色";
	}

	public void writeWord(String s) {
		System.out.println("写出" + color + "的字" + s);
	}
}
