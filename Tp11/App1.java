import java.util.Scanner;

public class App1 {

    // Méthode pour lire un entier strictement positif
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    // Méthode pour remplir le tableau
    public static void RemplirTAb(int[] tab, Scanner sc) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }
    }

    // Méthode pour remplacer toutes les occurrences de X1 par X2
    public static void Remplacer(int[] tab, int X1, int X2) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == X1) {
                tab[i] = X2;
            }
        }
    }

    // Méthode pour afficher le contenu du tableau
    public static void AfficheTAb(int[] tab) {
        System.out.print("Tableau : ");
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Méthode principale
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lectureN(sc); // lire la taille du tableau
        int[] tab = new int[n];

        RemplirTAb(tab, sc); // remplir le tableau
        AfficheTAb(tab);     // afficher avant remplacement

        System.out.print("Entrez la valeur à remplacer (X1) : ");
        int X1 = sc.nextInt();
        System.out.print("Entrez la nouvelle valeur (X2) : ");
        int X2 = sc.nextInt();

        Remplacer(tab, X1, X2); // effectuer le remplacement
        AfficheTAb(tab);        // afficher après remplacement

        sc.close();
    }
}

