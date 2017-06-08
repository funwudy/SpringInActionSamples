package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Fun on 2017/5/30.
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = (Performance) context.getBean("performanceImpl");
        performance.perform();

        ((Encoreable) performance).performEncore();
    }
}
