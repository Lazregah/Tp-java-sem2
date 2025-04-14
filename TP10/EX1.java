public class Ex1 {
    public static void main(String[] args) {
      
        int[] entiers = new int[10]; // Tableau pour stocker les 10 entiers

        // Lecture des 10 entiers
        System.out.println("Veuillez entrer 10 entiers strictement positifs :");
        for (int i = 0; i < 10; i++) {
            entiers[i] = methode1.lectureN(); // Appel de la m�thode depuis methode1
        }

        // Affichage des entiers pairs
        System.out.println("\nLes entiers pairs sont : ");
        for (int n : entiers) {
            if (methode1.EstPair(n)) { // Appel de la m�thode depuis methode1
                System.out.print(n + " ");
            }
        }

     
      
    }
}
