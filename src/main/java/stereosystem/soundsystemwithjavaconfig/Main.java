package stereosystem.soundsystemwithjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by luosf on 2017/6/8.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TrackCounterConfig.class);
        CompactDisc disc = (CompactDisc) context.getBean("sgt");
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
