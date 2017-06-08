package owntest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luosf on 2017/6/8.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        OneInterface oi1 = (OneInterface) context.getBean("oneImpl");
        oi1.oneMethod();

        OneInterface oi2 = context.getBean(OneInterface.class);
        oi2.oneMethodWithParam(2);

    }
}
