public class ThreadSample {
    public static class CustomThread extends Thread {
        public void run() {
            System.out.printf("Thread %s is running\n", getName());
        }
    }

    public static class CustomRunnable implements Runnable {

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.printf("Thread %s is running with %s\n", threadName, getClass());
        }
    }

    public static void main(String[] args) {

        String s = "hello";
        System.out.println(s.length());
        String s1 = "world";
        System.out.println(s1.length());
        String s2 = null;
        System.out.println(s2.length());
        CustomThread thread0 = new CustomThread();
        thread0.start();

        CustomThread thread1 = new CustomThread();
        thread1.start();

        CustomThread thread2 = new CustomThread();
        thread2.start();

        CustomThread thread3 = new CustomThread();
        thread3.start();

        Runnable runnable = new CustomRunnable();
        Thread thread4 = new Thread(runnable);
        thread4.start();
    }

}
