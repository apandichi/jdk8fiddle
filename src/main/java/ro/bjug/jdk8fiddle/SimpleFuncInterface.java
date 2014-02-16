package ro.bjug.jdk8fiddle;

/**
 * Created by pndl on 2/16/14.
 */
@FunctionalInterface
public interface SimpleFuncInterface {
    public void doWork(String work);

    default public void doOther(String work) {
        System.out.println("Doing other work by default: " + work);
    }
}
