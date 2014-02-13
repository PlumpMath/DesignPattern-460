package com.coosam.factory.abstractfactory;

/**
 * 具体工厂类（Conrete
 * Factory）角色：这个角色直接在客户端的调用下创建产品的实例。这个角色含有选择合适的产品对象的逻辑，而这个逻辑是与应用系统的商业逻辑紧密相关的
 * 。通常使用具体Java 类实现这个角色
 * 
 * @author Administrator
 * 
 */
public class ShanghaiClothesFactory extends ClothesFactory {
	public Trousers createTrousers(int waistSize, int height) {
		return new WesternTrousers("上海牌裤子", waistSize, height);
	}

	public UpperClothes createUpperClothes(int chestSize, int height) {
		return new WesternUpperClothes("上海牌上衣", chestSize, height);
	}
}
