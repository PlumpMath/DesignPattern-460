package com.coosam.factory.simplefactory;

/**
 * 工厂类角色
 * 
 * 在简单工厂模式中，可以根据自变量的不同返回不同类的实例。
 * 
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
 * 
 * 简单工厂模式的适用环境 : （1）工厂类负责创建的对象比较少：由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂；
 * （2）客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数
 * 
 * @author Administrator
 * 
 */
public class Driver {
	// 工厂方法.注意 返回类型为抽象产品角色
	public static Car driverCar(String s) throws Exception {
		// 判断逻辑，返回具体的产品角色给Client
		if (s.equalsIgnoreCase("Benz"))
			return new Benz();
		else if (s.equalsIgnoreCase("Bmw"))
			return new Bmw();
		else
			throw new Exception();
	}
}
