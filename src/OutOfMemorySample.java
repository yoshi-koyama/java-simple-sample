public class OutOfMemorySample {

    public static void main(String[] args) {
        // int's byte size is 4.
        // when the size is 2,500,000, the byte size is 10,000,000 (10M)
        int[] overSizeArray = new int[2500000];
        System.out.printf("The array's size is %d\n", overSizeArray.length);
    }
}
