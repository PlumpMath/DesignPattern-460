package com.coosam.factory.abstractfactory;

/**
 * 抽象工厂（AbstractFactory）角色：担任这个角色的是工厂方法模式的核心，它是与应用系统的商业逻辑无关的。通常使用Java 接口或者抽象Java
 * 类实现，而所有的具体工厂类必须实现这个Java 接口或继承这个抽象Java 类
 * 
 * 抽象工厂模式提供一个创建一系列或相互依赖的对象的接口，而无需指定它们具体的类
 * 
 * @author Administrator
 * 
 */
public abstract class ClothesFactory {
	public abstract UpperClothes createUpperClothes(int chestSize, int height);

	public abstract Trousers createTrousers(int waistSize, int height);
}
