package com.coosam.adapter;

/**
 * Adapter适配器角色：在Target目标角色与Adaptee源角色之间提供一种过渡，
 * 即把Adaptee源角色所提供的接口转换为Target目标角色所提供的接口
 * 
 * 类适配器采用“多继承”的实现方式 带来了不良的高耦合，所以一般不推荐使用。对象适配器采用“对象组合”的方式，更符合松耦合精神
 * 
 * @author Administrator
 * 
 */
public class ClassAdapter extends Adaptee implements Target {
	public void request() {
		this.specialRequest();
	}
}
