package MonPremierProjet;

import java.util.Scanner;

public class Exo5 

{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in); // import scanner
		
		System.out.print("veuillez saisir un nombre : "); // tache destiné a l'utilisateur
		
		int nombre = sc.nextInt(); // enregistrement de la saisie faite par l'utilisateur
		
		System.out.print("\n Vous avez saisie : " + nombre); // reponse donné a ce meme utilisateur
		
		sc.close(); // fermeture du scanner
		
		
		
	}

}
/*Exercice 05
Même chose que le 4 mais l'utlisateur doit cioisir le nombre.*/