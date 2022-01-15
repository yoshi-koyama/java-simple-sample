import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Logger;

public class Task implements Runnable {

    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public static Logger LOG = Logger.getAnonymousLogger();

    @Override
    public void run() {
        try {
            LOG.info(Thread.currentThread().getName() +
                    " is waiting");
            barrier.await();
            LOG.info(Thread.currentThread().getName() +
                    " is released");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}
