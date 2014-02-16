package ro.bjug.jdk8fiddle;

import org.junit.Test;

/**
 * Created by pndl on 2/16/14.
 */
public class SimpleFuncInterfaceTest {

    @Test
    public void anonInnerClassTest() {
        DoWorkCaller caller = new DoWorkCaller();
        caller.callDoWork(
                new SimpleFuncInterface() {
                    @Override
                    public void doWork() {
                        System.out.println("Doing work from an anonymous inner class");
                    }
                });
    }

    @Test
    public void lambdaTest() {
        DoWorkCaller caller = new DoWorkCaller();
        caller.callDoWork(
                () -> System.out.println("Doing work from a lambda implementation"));
    }
}
