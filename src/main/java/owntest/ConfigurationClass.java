package owntest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by luosf on 2017/6/8.
 */
@EnableAspectJAutoProxy
public class ConfigurationClass {

    @Bean
    public TestAspect ta() {
        return new TestAspect();
    }

    @Bean
    public OneInterface oneImpl() {
        return new OneInterfaceImpl();
    }
}
