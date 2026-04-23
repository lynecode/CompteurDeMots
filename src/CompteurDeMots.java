import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurDeMots {
    public static void main(String[] args) {
        try {
            // Le fichier "texte.txt" doit être dans le dossier du projet
            File file = new File("texte.txt");
            Scanner scanner = new Scanner(file);

            int totalMots = 0;

            // Boucle qui lit chaque ligne du fichier
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                // Sépare la ligne en mots en utilisant l'espace comme délimiteur
                String[] mots = ligne.split(" ");
                totalMots += mots.length;
            }

            scanner.close();
            System.out.println("Le nombre total de mots dans ce fichier est : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
        }
    }
}
