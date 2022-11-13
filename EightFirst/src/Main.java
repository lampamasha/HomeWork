/*Создайте LinkedList, состоящий из языков программирования.
Воспользуйтесь разными версиями метода add при добавлении элементов
(add, add с указанием позиции, addFirst, addLast).
Распечатайте на экран весь список, затем первый и последний элемент без удаления и с удалением.*/
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> progLang = new LinkedList<String>();

        progLang.add("Java");
        progLang.add("JavaScript");
        progLang.add("C++");
        progLang.add(2,"Python");

        System.out.println("Весь список:");
        System.out.println(progLang.toString());
        System.out.println("Первый элемент: " + progLang.peekFirst());
        System.out.println("Последний элемент: " + progLang.peekLast());

        progLang.addFirst("Fortran");
        progLang.addLast("Basic");
        progLang.add(6,"G-code");

        System.out.println("Обновленный список:");
        System.out.println(progLang.toString());
        System.out.println("Первый элемент до удаления: " + progLang.pollFirst());
        System.out.println("Последний элемент до удаления: " + progLang.pollLast());
        System.out.println("Получившийся список:");
        System.out.println(progLang.toString());
    }
     }