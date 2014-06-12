package intf;


public interface FirstInterface<T extends FirstInterface<T, U>, U extends UInterface> 
	extends BaseInterface<T> {
}
