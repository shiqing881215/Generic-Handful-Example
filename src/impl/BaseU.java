package impl;

import intf.UInterface;

public class BaseU implements UInterface{

	@Override
	public void printSelf() {
		System.out.println("This is the real type of generic type for U : " + this.getClass());
	}
	
}
