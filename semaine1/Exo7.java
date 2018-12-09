package MonPremierProjet;

import java.util.Scanner;

public class Exo7 

{

	public static void main(String[] args) 
	
	{
		 Scanner sc = new Scanner (System.in); //import scanner
		 
	        System.out.print("Saisissez un nombre à multiplier : "); // tache destiné a l'utilisateur
	        int x = sc.nextInt(); // enregistrement de la saisie 

	        System.out.print("Saisissez le nombre d'entiers à multiplier : "); //second tache destiné a l'utilisateur
	        int n = sc.nextInt(); // enregistrement de la deuxieme saisie
		
		 // Variante avec boucle while
	        System.out.print("\n\n Boucle WHILE :");
	        int i = 1; // veleur donner a i
	        while(i <= n) // quand i et plus petit ou egal a la valeur de n 
	       

	        	
	        {
         System.out.print(GetReply("WHILE", x, n, i)); 
         i++;
	        } 
	}
         public static String GetReply(String mode, int x, int n, int i)
         
         {
             return "\n (Boucle " + mode +") Le résultat pour X = " + x + " et N = " + i + " est : " + n*i;
         }	
         
}





