import java.util.Scanner;

public class Calculatrice {

    // Méthode d'addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Méthode de soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode de multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode de division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux nombres
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        // Saisie de l'opération
        System.out.print("Choisissez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        double resultat;

        // Utilisation de switch pour appeler la méthode selon l'opération
        switch (operation) {
            case '+':
                resultat = addition(num1, num2);
                break;
            case '-':
                resultat = soustraction(num1, num2);
                break;
            case '*':
                resultat = multiplication(num1, num2);
                break;
            case '/':
                resultat = division(num1, num2);
                break;
            default:
                System.out.println("Opération non valide !");
                return;
        }

        // Affichage du résultat
        System.out.println("Résultat = " + resultat);
    }
}