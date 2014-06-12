package impl;

import intf.FirstInterface;


public class First<T extends First<T, U>, U extends BaseU> extends Base<T> implements FirstInterface<T, U>{
	protected U u;
	
	public void setU(U u) {
		this.u = u;
	}
	
	protected void printU() {
		u.printSelf();
	}
}
