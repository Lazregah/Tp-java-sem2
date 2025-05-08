public class ex5 {

    // Affiche les valeurs du tableau ligne par ligne
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Vérifie si le tableau est régulier
    public static boolean regulier(double[][] t) {
        int taille = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille) return false;
        }
        return true;
    }

    // Calcule la somme des lignes du tableau
    public static double[] sommeLignes(double[][] t) {
        double[] result = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            result[i] = somme;
        }
        return result;
    }

    // Additionne deux tableaux s'ils sont réguliers et compatibles
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (t1.length != t2.length || !regulier(t1) || !regulier(t2) || t1[0].length != t2[0].length) {
            return null;
        }

        double[][] result = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return result;
    }

    // Méthode principale
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes : ");
        int lignes = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int colonnes = sc.nextInt();

        double[][] t1 = new double[lignes][colonnes];
        double[][] t2 = new double[lignes][colonnes];

        System.out.println("Saisir les valeurs du tableau t1 :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("t1[" + i + "][" + j + "] = ");
                t1[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Saisir les valeurs du tableau t2 :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("t2[" + i + "][" + j + "] = ");
                t2[i][j] = sc.nextDouble();
            }
        }

        // Affichage et tests
        System.out.println("\nTableau t1 :");
        affiche(t1);

        System.out.println("Tableau régulier ? " + regulier(t1));

        System.out.println("Somme des lignes de t1 :");
        double[] sommes = sommeLignes(t1);
        for (double s : sommes) {
            System.out.println(s);
        }

        System.out.println("Somme de t1 et t2 :");
        double[][] sommeTotale = somme(t1, t2);
        if (sommeTotale != null) {
            affiche(sommeTotale);
        } else {
            System.out.println("Erreur : tableaux incompatibles.");
        }



