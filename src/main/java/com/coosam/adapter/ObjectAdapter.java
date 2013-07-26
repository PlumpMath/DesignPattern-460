package com.coosam.adapter;

public class ObjectAdapter implements Target
{

	Adaptee adaptee = new Adaptee();
	
	public void request()
	{
		adaptee.specialRequest();
	}
}
