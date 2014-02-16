package ro.bjug.jdk8fiddle;

/**
 * Created by pndl on 2/16/14.
 */
public class DoWorkCaller {

    private String work;

    public DoWorkCaller(String work) {
        this.work = work;
    }

    public void callDoWork(SimpleFuncInterface sfi) {
        sfi.doWork(work);
    }
}
