import java.util.Scanner;

public class App{
    public static int lectureN(Scanner sc){
        int n;
        do{
            System.out.println("Entre un entier strictement positifs:");
            n = sc.nextInt();
        }while(n<=0);
        return n;
    }
    public static void RemplirTAb(int[]tab,Scanner sc){
        for(int i = 0;i<tab.length;i++){
            System.out.println("Entre l'élément:"+(i + 1)+ ":");
            tab[i]=sc.nextInt();
        }
    }

}