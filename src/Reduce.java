public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        doReduce(i);
    }

    public static void doReduce(int i) {
        int j = i;
        int count = 0;
        while (true){
            boolean b = j != 0;
            if (!b) break;
            if (j % 2 == 0) {
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
