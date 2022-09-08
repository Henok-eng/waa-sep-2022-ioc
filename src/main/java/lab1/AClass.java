package lab1;

@MyBean
public class AClass {

    @MyAutowired
    BClass bClass;


    @Override
    public String toString() {
        return "AClass{" +
                "bClass=" + bClass +
                '}';
    }
}
