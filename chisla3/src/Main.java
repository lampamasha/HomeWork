public class Main {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 50){
            i+=1;
            if ((i == 5)||(i == 25)){
                continue;
            }
            else if (i == 49){
                break;
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
