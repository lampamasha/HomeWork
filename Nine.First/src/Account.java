/*1. Создайте класс Аккаунт, в котором будет текстовое поле Логин и метод checkLogin,
который принимает на вход строку с логином пользователя. В данном методе проверьте,
что введенный логин не равен null и его длина больше 5 и меньше 20.
Если условия выполнены, то присвойте его значение полю Логин класса Аккаунт,
иначе выбросите собственную ошибку WrongLoginException и обработайте ее с выводом на экран.
2. В уже созданный вами класс Аккаунт добавьте поле Пароль. Добавьте метод checkPassword,
который будет принимать на вход два строковых параметра: пароль и подтверждение пароля.
Проверьте, что пароль не равен null, его длина больше 8 и меньше 20,
а также что значения строки пароль и подтверждение пароля совпадают.
Если условия выполнены, то присвойте значение пароля полю Пароль класса Аккаунт,
иначе выбросите собственную ошибку WrongPasswordException и обработайте ее с выводом на экран.
3. В класс Аккаунт добавьте поле типа HashMap с парами логинов пользователей и паролей.
Добавьте метод checkLoginAndPassword, который будет принимать на вход строку логина и строку пароля и проверять,
содержится ли такая пара в поле типа HashMap. В случае успеха верните строку “Вы успешно вошли в аккаунт!”.
В случае неудачи выбросите собственную ошибку WrongLoginOrPasswordException и обработайте ее с выводом на экран.
 */
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Account {
    String login;
    String password;
    static HashMap<String, String> users= new HashMap<String, String>();

    public Account(String login, String password){
        this.login = login;
        this.password = password;
    }

    void checkLogin(String login) throws WrongLoginException{
        if ((login.equals(null))|(login.length()<=5)|(login.length()>=20)) {
            System.out.println("Недопустимый логин.");
            throw new WrongLoginException();
        }
        this.login = login;
    }

    void checkPassword(String password1, String password2) throws WrongPasswordException{
        if ((password1.equals(null))|(password1.length()<=5)|(password1.length()>=20)|(!password1.equals(password2))) {
            System.out.println("Неверный пароль.");
            throw new WrongPasswordException();
        }
        this.password = password1;
    }
    void checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException{
        if ((users.containsKey(login))){
            Object p = users.get(login);
            if (p.equals(password)){
                System.out.println("Вы успешно вошли в аккаунт!");
            }
        } else {
            System.out.println("Неверный логин или пароль.");
            throw new WrongLoginOrPasswordException();
        }
    }

    public static void main(String args[]) {
        System.out.println("Придумайте логин:");
        Scanner input = new Scanner(System.in);
        String loginIn = input.nextLine();
        System.out.println("Придумайте пароль:");
        String passwordIn1 = input.nextLine();
        System.out.println("Повторите пароль:");
        String passwordIn2 = input.nextLine();
        System.out.println("Введите логин:");
        String checkLogin = input.nextLine();
        System.out.println("Введите пароль:");
        String checkPassword = input.nextLine();
        input.close();

        Account accountOne = new Account("user123", "qwerty123");

        try {
            accountOne.checkLogin(loginIn);
        }catch (WrongLoginException e){
            System.out.println("Исключение:" + e);
        }

        try {
            accountOne.checkPassword(passwordIn1, passwordIn2);
        }catch (WrongPasswordException e){
            System.out.println("Исключение:" + e);
        }

        users.put("user11", "qwerty11");
        users.put("user22", "qwerty22");
        users.put("user33", "qwerty33");
        users.put(accountOne.login, accountOne.password);

        try {
            accountOne.checkLoginAndPassword(checkLogin, checkPassword);
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Исключение:" + e);
        }
    }
}

