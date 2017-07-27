package stereosystem.soundsystem;
import org.springframework.context.annotation.*;

/**
 * Created by Fun on 2017/5/10.
 */
@Configuration
//@ComponentScan(basePackageClasses = CDPlayerConfig.class)
public class CDPlayerConfig {

    @Bean
    public CompactDisc whatever() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(whatever());
    }

//    @Bean
//    public CDPlayer anotherCDPlayer() {
//        return new CDPlayer(whatever());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}
