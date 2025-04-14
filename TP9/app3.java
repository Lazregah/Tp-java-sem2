import java.util.Scanner;
public class app3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch;
        int i,j;
        char a;
        do{ 
            System.out.println("Entrez une chaine:");
            ch=sc.nextLine();
        }while(ch.length()>20);
        StringBuffer ch1=new StringBuffer(ch);
        for(i=0;i<ch1.length();i++){
            j=ch1.indexOf(" ",i);
            if(j==-1){
                j=ch1.length();
            }
            if(i==0||ch1.charAt(i-1)==' '){
                a=ch1.charAt(i);
                ch1.setCharAt(i, Character.toUpperCase(a));
            }
            i=j;
        }
        System.out.println(ch1);
        sc.close();
    }
}