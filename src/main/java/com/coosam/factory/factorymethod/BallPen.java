package com.coosam.factory.factorymethod;

/**
 * 
 * 所谓工厂方法模式（Factory Method Pattern），就是定义一个创建产品对象的工厂接口，让子类决定实例化哪一种实例对象，
 * 
 * 也就是将实际创建实例对象的工作推迟到子类当中 ，核心工厂类不再负责具体产品的创建。
 * 
 * @author Administrator
 * 
 */
public abstract class BallPen {

	BallPen() {
		System.out.println("生产一只装有" + getPenCore().color + "笔芯的圆珠笔");
	}

	public abstract PenCore getPenCore();
}