package intf;

/**
 * 
 * @author shiqing
 *
 * This is the end interface. So we don't need any generic type here.
 * We should give the real type like SecondInterface to let all the parent interface know
 * when I have this interface, all the previous T is SecondInterface type
 */
public interface SecondInterface extends FirstInterface<SecondInterface>{

}
