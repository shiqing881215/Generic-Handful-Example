package intf;

/**
 * 
 * @author shiqing
 *
 * @param <T> We only want the T should be the BaseInterface itself or subclass of BaseInterface here
 */
public interface BaseInterface<T extends BaseInterface<T>> {
	public T get();
}
