package intf;

public interface SecondInterface<T extends SecondInterface<T, U>, U extends UInterface> extends FirstInterface<T, U>{

}
