package com.coosam.adapter;

/**
 * 
 * 我们经常碰到要将两个没有关系的类组合在一起使用,第一解决方案是：修改各自类的接口，但是如果我们没有源代码，或者，我们不愿意为了一个应用而修改各自的接口。
 * 怎么办? 使用 Adapter，在这两种接口之间创建一个混合接口(混血儿).
 * 
 * Adapter适配器角色：在Target目标角色与Adaptee源角色之间提供一种过渡，
 * 即把Adaptee源角色所提供的接口转换为Target目标角色所提供的接口
 * 
 * @author Administrator
 * 
 */
public class ObjectAdapter implements Target {

	Adaptee adaptee = new Adaptee();

	public void request() {
		adaptee.specialRequest();
	}
}
