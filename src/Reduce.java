public class Reduce {
    public static void main(String[] args) {
        doReduce(i);
    }

    public static void doReduce(int i) {
        int j = i;
        int count = 0;
        if (j != 0){
            if (i % 2 == 0) {
                j = j / 2;
                count ++;
            } else {
                j = j - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
