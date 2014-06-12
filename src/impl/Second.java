package impl;

import intf.SecondInterface;

public class Second extends First<Second> implements SecondInterface<Second>{
	
	public static void main(String[] args) {
		Second s = new Second();
		System.out.println(s.get().getClass());
	}

}
