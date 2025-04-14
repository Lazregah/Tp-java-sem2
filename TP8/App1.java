import java.util.Scanner;

public class App1{
    public static void main(String[] args) {
        String ch1;
        char k;
        int c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine: ");
        ch1=sc.nextLine();

        System.out.print("Entre un caractere qui vous cherche: ");
        k=sc.next().charAt(0);
        c=0;
        for (i=0;i<ch1.length();i++){
            if (ch1.charAt(i)==k){
                c++;
            }
        }
        System.out.println("Le caractere : "+k+" apparait "+c+" fois dans la chaine");
        sc.close();
    }
}
