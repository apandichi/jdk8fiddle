package ro.bjug.jdk8fiddle;

import org.junit.Test;

/**
 * Created by pndl on 2/16/14.
 */
public class SimpleFuncInterfaceTest {

    @Test
    public void anonInnerClassTest() {
        DoWorkCaller caller = new DoWorkCaller("anonymous work");
        caller.callDoWork(
                new SimpleFuncInterface() {
                    @Override
                    public void doWork(String work) {
                        System.out.println("Doing work from an anonymous inner class: " + work);
                    }
                }

        );
    }

    @Test
    public void lambdaTest() {
        DoWorkCaller caller = new DoWorkCaller("lambda work");
        caller.callDoWork(System.out::println);
    }
}
