package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Fun on 2017/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class Main {

    @Autowired
    private Audience audience;

    @Test
    public void audienceShouldNotBeNull() {
        assertNotNull(audience);
    }

    public static void main(String[] args) {


        new PerformanceImpl().perform();
    }
}
