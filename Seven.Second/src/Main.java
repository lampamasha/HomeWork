import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int [] massiv = new int[] {33,456,3785,93,872,201,50};
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        System.out.print("Получившийся массив: ");
        for (int i : massiv){
            if (i%2 == 1){
                spisok.add(i);
                i = 0;
                //System.out.println(i);
            }
            System.out.print(i + "  ");
        }
        System.out.print("\nПолучившийся список: ");
        for (Integer I : spisok){
            System.out.print(I + "  ");
        }
    }
}