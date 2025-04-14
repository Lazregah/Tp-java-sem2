import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        String ch,s;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine: ");
        ch = sc.nextLine();
        i=ch.indexOf(" ");
        if (i==-1){
            s=ch;
        } 
        else{
            s=ch.substring(0,i);
        }
        System.out.println("Le premier mot est : "+s);
        sc.close();
    }
}
    

