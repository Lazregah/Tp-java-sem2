import java.util.Scanner;
public class ex6 {
public static void main (String[] args) {
String m;

	Scanner sc =new Scanner(System.in);
	
	System.out.println("Ecrirez un mot");
	 m=sc.nextLine();
	 char[]voyelles={'a','e','i','o','u','y'};
	 int[]compteur=new int[voyelles.length];
	 
	 for(char c : m.toCharArray()){
	 	for(int i=0;i<voyelles.length;i++){
	 		if (c==voyelles[i]){
	 			compteur[i]++;
	 		}
	 	}
	 }
	System.out.println("Le mot comporte : ");
        for (int i = 0; i < voyelles.length; i++) {
            System.out.println(compteur[i] + " fois la lettre " + voyelles[i]);
        }
        
        sc.close();
    }
}
		
