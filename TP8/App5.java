import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        String ch1,ch2;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine : ");
        ch1=sc.nextLine();
        ch2="";
        for(i=0;i<ch1.length();i++){
            ch2=ch2+ch1.charAt(i)+"*";
        }
        System.out.println("La chaine est: "+ch2);
        sc.close();
    }
}
    

