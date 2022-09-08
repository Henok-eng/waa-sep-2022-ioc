package lab1;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, BeanNotFoundException {

        MyInjector myInjector = new MyInjector();
        myInjector.scan();
        myInjector.injectAnnotatedFields();

        AClass firstClass = (AClass) myInjector.getBean(AClass.class);

        System.out.println(firstClass);

        NoBean noBean = (NoBean) myInjector.getBean(NoBean.class);



    }
}
