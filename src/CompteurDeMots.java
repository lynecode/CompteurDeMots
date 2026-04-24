import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurDeMots {
    public static void main(String[] args) {
        try {

            File file = new File("texte.txt");
            Scanner scanner = new Scanner(file);

            int total = 0;


            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] mots = ligne.split(" ");
                total += mots.length;
            }

            scanner.close();
            System.out.println("Le total des mots est de : " + total);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
        }
    }
}
