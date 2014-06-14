package impl;

import intf.BaseInterface;

/**
 * 
 * @author shiqing
 *
 * @param <U> The generic type for the impl
 * @param <T> The generic type for the interface
 * 
 * The reason why we have two generic type here is we need to differentiate the generic type between 
 * interface and implementation.
 * Why?
 * Because in your final interface and implementation,
 * If you only have one generic type, 
 * In your interface you will pass the finalInterface as the generic type
 * and in your implementation you will pass the finalImpl as the generic type
 * which will make the T get confused.
 * 
 * So the right way is to have different generic type both for interface and impl.
 * This is the core idea here!!!
 */
public abstract class Base<U extends Base<U, T>, T extends BaseInterface<T>> implements BaseInterface<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T get() {
		return (T) this;
	}
	
}
