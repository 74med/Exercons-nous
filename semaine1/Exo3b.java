package MonPremierProjet;

import java.util.Scanner;

public class Exo3b {

	public static void main(String[] args) 
	
	{

		Scanner sc = new Scanner (System.in);
		
			System.out.println("Veuillez entrer votre nom s'il vous plait puis valider avec la touche entrer de votre clavier :  ");
			// message afficher destiné a l'utilisateur.

		
		String nom = sc.nextLine(); // saisie utilisateur (nom de la personne)

		
			System.out.println("Salut "  + nom +  " j'espere que tu va bien ");	
			/* reponse donné a l'utilisateur, vous avez saisie + le nom de la personne concerner 
			+ petit message*/
			
		
	    sc.close(); // fermeture scanner

		
	}

}
/*Exercice 03b
3.2 à partr du résultat du 1.1 écrivez un programme qui demande son nom à un utlisateur et qui ensuite dit bonjour à cet utlisateur en
l’appelant par son nom.*/