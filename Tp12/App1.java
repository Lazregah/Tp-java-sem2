package Tp12;
import java.util.Scanner;
public class App1{
    
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
        public static int somme_rec(int n,int i=0){
           int somme=0;
            while (i<n){
                somme=1+somme_rec(n,i+1);
         return somme;}}
    
}

