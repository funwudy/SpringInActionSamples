package stereosystem.soundsystemwithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luosf on 2017/6/8.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("paramaspect.xml");
        CompactDisc disc = (CompactDisc) context.getBean("cd");
        disc.playTrack(1);
        disc.playTrack(2);
        disc.playTrack(3);
        disc.playTrack(3);
        disc.playTrack(3);
        disc.playTrack(3);
        disc.playTrack(7);
        disc.playTrack(7);
    }
}
