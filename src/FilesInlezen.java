import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {
    public static void main(String[] args) {
        try {
            File f = new File( "Hello.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                System.out.println(s.hasNextLine());
            }
        } catch (FileNotFoundException f) {
            System.out.println("Bestand niet gevonden.");
        }
    }
}
