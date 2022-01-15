import java.util.concurrent.*;

public class SquareCalculator {

    private ExecutorService executor
            = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            System.out.printf("calculationg %d\n", input);
            Thread.sleep(input);
            return input * input;
        });
    }

    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {
        Future<Integer> future1 = new SquareCalculator().calculate(1000);
        Future<Integer> future2 = new SquareCalculator().calculate(3000);

        while (!(future1.isDone() && future2.isDone())) {
            System.out.println(
                    String.format(
                            "future1 is %s and future2 is %s",
                            future1.isDone() ? "done" : "not done",
                            future2.isDone() ? "done" : "not done"
                    )
            );
            Thread.sleep(300);
        }

        Integer result1 = future1.get();
        Integer result2 = future2.get();

        System.out.println(result1 + " and " + result2);

//        squareCalculator.shutdown();
    }
}
