import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long res = 1L;
        int n;

        System.out.println("Введите целое число от 0 до 20: ");
        Scanner inputInt = new Scanner(System.in);
        n = inputInt.nextInt();

        if (n == 0){
            res = 1;
            System.out.println("Факториал " + n + " равен " + res);
        }
        else if ((n > 0)&&(n <= 20)){
            for (int i = 1; i <= n; i++){
                    res = res*i;
            }
            System.out.println("Факториал " + n + " равен " + res);
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
}
