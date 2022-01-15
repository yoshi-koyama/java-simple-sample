import java.util.concurrent.CyclicBarrier;
import java.util.logging.Logger;

public class TaskExecutor {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Logger LOG = Logger.getAnonymousLogger();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            // ...
            LOG.info("All previous tasks are completed");
        });

        Thread t1 = new Thread(new Task(cyclicBarrier), "T1");
        Thread t2 = new Thread(new Task(cyclicBarrier), "T2");
        Thread t3 = new Thread(new Task(cyclicBarrier), "T3");

        if (!cyclicBarrier.isBroken()) {
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
