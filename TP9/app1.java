import java.util.Scanner;
public class app1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ph,ch,ch1;
        int i;
        do{
            System.out.println("Donner le text: ");
            ph=sc.nextLine();
        }while(ph.length()>50);
        do{
            System.out.println("Donner le mot a remplacer: ");
            ch=sc.nextLine();
        }while(ch.length()>10);
        do{
            System.out.println("Donner le mot a remplacement: ");
            ch1=sc.nextLine();
        }while(ch1.length()>10);
        StringBuffer ph1 = new StringBuffer(ph);
        i = ph1.indexOf(ch);
        while (i != -1) {
            ph1.replace(i, i + ch.length(), ch1);
            i = ph1.indexOf(ch);
        }
        System.out.println(ph1);
        sc.close();
    }
}