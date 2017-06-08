package concertwithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fun on 2017/5/30.
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopconfig.xml");
        Performance performance = (Performance) context.getBean("concertwithxml.PerformanceImpl#0");
        performance.perform();

        ((Encoreable) performance).performEncore();
    }
}
