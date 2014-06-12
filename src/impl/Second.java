package impl;

import intf.SecondInterface;

public class Second extends First<Second, BaseU> implements SecondInterface<Second,BaseU>{
	
	public static void main(String[] args) {
		Second s = new Second();
		System.out.println(s.get().getClass());
		BaseU bu = new BaseU();
		s.setU(bu);
		s.printU();
	}

}
