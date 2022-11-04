public class Main {
    public static void main(String[] args) {
        int [] massiv = new int[] {33,456,3785,93,872,201,50};
        float res;
        float sum = 0;
        for (int i : massiv) {
            sum += i;
        }
        res = sum/massiv.length;
        System.out.println("Среднее арифметическое = " + res);
    }
}