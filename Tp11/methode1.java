 import java.util.Scanner;

public class methode1 {
    
    // M�thode pour lire un entier strictement positif
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : L'entier doit �tre strictement positif.");
            }
        } while (n <= 0);

        return n;
    }

    // M�thode pour compter le nombre de chiffres d'un entier
    public static int Compter(int n) {
        return String.valueOf(n).length();
    }

      // M�thode pour v�rifier si un nombre est pair
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
}