public class BaeldungSynchronizedMethods {

    private int sum = 0;

    public void calculate() {
        setSum(getSum() + 1);
    }

    public synchronized void syncronizedCalculate() {
        setSum(getSum() + 1);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return this.sum;
    }
}
