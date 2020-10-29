import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen2 {

        public static void main(String[] args) {
            try { bestandInlezen();
            } catch (FileNotFoundException f) {
                System.out.println("Bestand niet gevonden.");
            }
            finally {
                System.out.println("Einde programma.");
            }
        }

    private static void bestandInlezen() throws FileNotFoundException{
        File f = new File( "Hello.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());

        }
    }
}
