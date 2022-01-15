import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ExecutorServiceBasic {
    public static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        logger.info("Main Thread ID " + Thread.currentThread().getId());

        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                logger.info("Task A's Thread ID " + Thread.currentThread().getId());
            }
        }, 5, TimeUnit.SECONDS);

        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                logger.info("Task B's Thread ID " + Thread.currentThread().getId());
            }
        }, 3, TimeUnit.SECONDS);

        executorService.shutdown();

    }

}
