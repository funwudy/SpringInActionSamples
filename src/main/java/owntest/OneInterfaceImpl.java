package owntest;

/**
 * Created by luosf on 2017/6/8.
 */
public class OneInterfaceImpl implements OneInterface {

    public void oneMethod() {
        System.out.println("oneMethod() is being executed");
    }

    public void oneMethodWithParam(int param) {
        System.out.println("oneMethodWithParam(int) is being executed with param " + param);
    }
}
