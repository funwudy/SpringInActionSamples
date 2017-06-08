package concertwithxml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by luosf on 2017/6/8.
 */
public class AudienceV2 {

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("Oh yeah baby!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
