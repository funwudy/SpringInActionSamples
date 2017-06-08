package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by luosf on 2017/6/8.
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
