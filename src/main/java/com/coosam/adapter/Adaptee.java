package com.coosam.adapter;

/**
 * Adaptee源角色：这是我们原有的产品，也是需要被适配的产品
 * 
 * @author Administrator
 * 
 */
public class Adaptee {
	public void specialRequest() {
		System.out.println("Called SpecificRequest() in Adaptee ");
	}
}
