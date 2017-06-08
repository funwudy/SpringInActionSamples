package owntest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by luosf on 2017/6/8.
 */
@Aspect
public class TestAspect {

    @Pointcut("execution(* owntest.OneInterface.oneMethod(..))")
    public void methodExecute() {}

    @Pointcut("execution(* owntest.OneInterface.oneMethodWithParam(int)) && args(param2)")
    public void methodWithParamExecute(int param2) {}

    @Before("methodExecute()")
    public void meFirst() {
        System.out.println("Hehe, i am the first");
    }

    @Before("methodWithParamExecute(param1)")
    public void beforeMethodWithParam(int param1) {
        System.out.println("Let me use param " + param1 + " first");
    }

    @Around("methodExecute()")
    public void aroundAdvice(ProceedingJoinPoint jp) {
        try {
            System.out.println("guess who is the first?");
            jp.proceed();
            System.out.println("Okay, i am the last");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
