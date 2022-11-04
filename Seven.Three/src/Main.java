import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stroki = new ArrayList<String>();
        ArrayList<Integer> dlina = new ArrayList<Integer>();

        stroki.add("Как");
        stroki.add("упоительны");
        stroki.add("в");
        stroki.add("Russia");
        stroki.add("вечера!");

        System.out.println("Исходный список:");
        System.out.println(stroki.toString());
        System.out.println("Получившийся список: ");

        for (String I : stroki){
            dlina.add(I.length());
        }
        System.out.println(dlina.toString());
    }
}