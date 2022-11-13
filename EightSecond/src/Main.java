/*Создайте HashMap, состоящую из языков программирования и ответственных за них программистов в компании.
Ключ - название языка, значение - имя программиста.
Выведите на экран карту при помощи цикла foreach, а затем список всех языков программирования,
использующихся в компании (ключи) и всех ответственных за них программистов (значения).*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> progLangNames = new HashMap<>();

        progLangNames.put("JavaScript", "Лиза");
        progLangNames.put("Python", "Валентин");
        progLangNames.put("Java", "Альбина");
        progLangNames.put("Go", "Димас");
        progLangNames.put("C++", "Мария");

        for (Map.Entry<String, String> node : progLangNames.entrySet()){
            System.out.println(node);
        }

        Set<String> progLangs = progLangNames.keySet();
        System.out.println("Языки програмирования: " + progLangs);

        ArrayList<String> names = new ArrayList<>(progLangNames.values());
        System.out.println("Имена разработчиков: " + names);
    }
}