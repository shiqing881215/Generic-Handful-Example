package impl;

import intf.BaseInterface;


public abstract class Base<T extends Base<T>> implements BaseInterface<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T get() {
		return (T) this;
	}
	
}
