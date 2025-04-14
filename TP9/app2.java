import java.util.Scanner;
public class app2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch1;
        int i;
        char a,b;
        do{
            System.out.println("Donner le text: ");
            ch1=sc.nextLine();
        }while(ch1.length()>30);
        StringBuffer ch2 = new StringBuffer(ch1);
        for (i = 0; i < ch2.length(); i++) {
            a = ch2.charAt(i);
           b =(char) (a + 3); 
            ch2.setCharAt(i, b);
        }
        System.out.println(ch2);
        sc.close();
    }
}