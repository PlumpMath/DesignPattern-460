package com.coosam.factory.factorymethod;

/**
 * 具体构造者
 * 
 * @author Administrator
 * 
 */
public class BlueBallPen extends BallPen {
	public PenCore getPenCore() {
		return new BluePenCore();
	}
}
