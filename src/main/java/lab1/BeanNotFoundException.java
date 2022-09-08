package lab1;


public class BeanNotFoundException extends Exception {
    public BeanNotFoundException(){
        super("BeanNotFoundException exception, no such kind of bean");
    }
}
