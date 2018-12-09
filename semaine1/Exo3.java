package MonPremierProjet; // 

import java.util.Scanner; // 

public class Exo3 //

{
	
	public static void main(String[] args) 
	
	{
		
		
		Scanner sc = new Scanner(System.in); // 
		
			System.out.println("Veuillez entrer votre nom s'il vous plait puis valider avec la touche entrer de votre clavier :  "); 
			// message afficher destiné a l'utilisateur.

		
		String nom = sc.nextLine(); // saisie utilisateur (nom de la personne)

		
			System.out.println("Vous avez saisie : " + nom); 
			// reponse donné a l'utilisateur, vous avez saisie + le nom de la personne
			
			sc.close(); // fermeture scanner 
	}
		
}

	
	

 /*Exercice 03
3.1– Ecrivez un programme (une classe ) qui réalise les opératons suivantes :
• demander son nom à un utlisateur
• l’utlisateur doit saisir dans la console son nom + [entrée]
• le programme doit ré-afcier en console le nom saisi par l’utlisateur.*/