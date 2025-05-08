import java.util.Scanner;

public class APP2 {

    
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez le nombre d'élèves: ");
            n = sc.nextInt();
        } while (n < 10);
        return n;
    }


    public static void RemplirTAb(int[] tab, Scanner sc) {
        for (int i = 0; i < tab.length; i++) {
            int note;
            do {
                System.out.print("Entrez la note de l'élève " + (i + 1) + " (entre 0 et 20) : ");
                note = sc.nextInt();
            } while (note < 0 || note > 20);
            tab[i] = note;
        }
    }

    
    public static double Calcul_Moy(int[] tab) {
        int somme = 0;
        for (int note : tab) {
            somme += note;
        }
        return (double) somme / tab.length;
    }

    
    public static int NombreNote(int[] tab, double moyenne) {
        int count = 0;
        for (int note : tab) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = lectureN(sc);

        
        int[] notes = new int[n];
        RemplirTAb(notes, sc);

        
        double moyenne = Calcul_Moy(notes);

        
        int nbSup = NombreNote(notes, moyenne);

        
        System.out.println("\nMoyenne de la classe : " + moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nbSup);

        sc.close();
    }
}
