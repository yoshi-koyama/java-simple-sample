import java.util.concurrent.*;
import java.util.logging.Logger;

public class EventWithRunnableAndCallable {
    public static class EventLoggingTask implements Runnable {
        private Logger logger = Logger.getAnonymousLogger();

        @Override
        public void run() {
            logger.info("Message");
        }
    }

    public static class FactorialTask implements Callable<Integer> {
        int number;

        public FactorialTask(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            int fact = 1;
            // ...
            for (int count = number; count > 1; count--) {
                fact = fact * count;
            }

            return fact;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new EventLoggingTask());
        executorService.shutdown();

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(5);
        Future<Integer> future2 = executorService2.submit(task);

        System.out.println(future2.get().intValue());

    }
}
