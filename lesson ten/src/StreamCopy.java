import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamCopy {
    public static void main(String[] args){
         String myString = "";

         try (FileReader inFile = new FileReader("input.txt");
              FileWriter outFile = new FileWriter("output.txt")) {
             int symbol = inFile.read();
             while (symbol != -1) {
                 myString += (char) symbol;
                 symbol = inFile.read();
             }
             outFile.write(myString);
             }catch (IOException e) {
             System.err.println(e.getMessage());
         }
    }
}
