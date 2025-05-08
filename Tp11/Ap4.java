import java.util.Scanner;

public class Ap4 {
    public static int lectureN(Scanner sc){
        int n;
        do{
            System.out.println("Entre un entier strictement positifs:");
            n=sc.nextInt();

        }while(n<=0);
        return n;
    }
    public static void RemplirTAb(int[][]tab,int n1,int n2,Scanner sc){
        for(int i=0; i<n1;i++){
            for(int j=0; j<n2;j++){
                System.out.println("Entre lélément" +(i+1)+":"+(j+1)+ " : ");
                tab[i][j]=sc.nextInt();

            
            }
        }
    }
    public static void CalculSomme(int[][]tab,int n1, int n2 ){
        for(int i = 0; i<n1;i++){
          int somme=0;
          for(int j= 0;j<n2;j++){
            somme+= tab[i][j]; 
    
          }
        }
    }

}
