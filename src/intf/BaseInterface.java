package intf;

public interface BaseInterface<T extends BaseInterface<T>> {
	public T get();
}
