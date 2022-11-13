/*Преобразуйте созданный вами в задании 1 LinkedList в HashMap и напечатайте ее на экран.
Ключами карты должны быть индексы элементов в LinkedList. */
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> progLang = new LinkedList<String>();

        progLang.add("Java");
        progLang.add("JavaScript");
        progLang.add("C++");
        progLang.add(2,"Python");
        progLang.addFirst("Fortran");
        progLang.addLast("Basic");
        progLang.add(6,"G-code");

        System.out.println("LinkedList: "+ progLang.toString());

        int n = progLang.indexOf(progLang.getLast());

        HashMap<Integer, String> magicMap = new HashMap<>();

        for (int i = 0; i <= n; i++)
        {
            magicMap.put(i, progLang.get(i));
        }
        System.out.println("HashMap: "+ magicMap);
    }
}