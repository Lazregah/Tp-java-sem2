import java.util.Scanner;
public class ex7{
	public static void main (String[] args) {
	
	String verbe;
	Scanner sc= new Scanner(System.in);
	
		do{
			System.out.println("entre un verbe");
			verbe= sc.nextLine();
		}while(!verbe.endsWith("er")||verbe.equals("aller"));
	
			System.out.println("je "+ verbe.replace("er","e"));
			System.out.println("tu "+ verbe.replace("er","es"));
			System.out.println("il "+ verbe.replace ("er","e"));
			
			if(verbe.equals("manger")){
			
				
			System.out.println("nous "+ verbe.replace("er","ons"));
			}
			else if(verbe.equals("commencer")){
				System.out.println("nous "+ verbe.replace("cer","ons"));
				
			}
			
			System.out.println("vous "+ verbe.replace("er","ez"));
			System.out.println("ils "+ verbe.replace("er","ent"));
			System.out.println("elles "+ verbe.replace("er","ent"));
		
		
	}
}
