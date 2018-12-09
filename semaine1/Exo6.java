package MonPremierProjet;

import java.util.Scanner;

public class Exo6 

{

	public static void main(String[] args) 
	
	{

		
		Scanner sc = new Scanner(System.in); // import scanner
		
		
		System.out.println("Veuillez saisir un nombre entre -1000 et 1000 :"); // tache destine a l'utilisateur 
		int Nb1 = sc.nextInt(); // recup du premier nombre
		System.out.println("Vous avez saisi : " + Nb1); // reponse donner
		
		System.out.println("Veuillez saisir un deuxieme nombre entre -1000 et 1000 :"); // seconde tache destiné a l'utilisateur
		int Nb2 = sc.nextInt(); // recup du deuxieme nombre
		System.out.println("Vous avez saisi : " + Nb2); //reponse donner
		
		sc.nextLine(); 
		
		System.out.println("Saisie de l'operateur : 1=+, 2=-,3=/,4=* "); // saisie uniquement numerique 
		int operateur = sc.nextInt(); // recup de l'operateur choisie
		
		
		if((Nb1 >= -1000) && (Nb1 <= 1000) && (Nb2 >= -1000) && (Nb2 <= 1000)) {  // si Nb1 et plus grand ou egal a -1000 et que Nb1 et plus petit ou egal a 1000 [idem pour Nb2] 
		/* on utilise switch et case pour des conditions à la carte en appelant l'operateur 
		 * et en le definissant avec le case "" */
		
	switch (operateur) 
	{
		
		case 1: System.out.println(Nb1 + Nb2); // cas numero 1 addition [pas de guillemet pour case "1" car entrée numerique]
			break; // stop
		
		case 2: System.out.println(Nb1 - Nb2); // cas numero 2 soustraction
			break; // stop
		
		case 3: 
			if ((Nb1 != 0)&&(Nb2 != 0)) // si Nb1 et strictement egal a 0 et que Nb2 et lui aussi strictement egal a 0 
			{
				System.out.println(Nb1 / Nb2); // cas numero 3 division
			} 
			else  // si zero et choisi comme operateur alors le message d'erreur suivant s'affichera.
			{		
				System.out.println(" erreur impossible de divisé par zéro "); 
			}
			break; // stop
		
		case 4: System.out.println(Nb1 * Nb2); // cas numero 4 multiplication
			break; // stop
		
		default : // message d'erreur par default si mauvais operateur numerique choisie
    	System.out.println(" Mauvais opérateur utilisé, nous allons donc additioné! "); // operateur inconnu 
    	System.out.println(Nb1 + Nb2); // finalement si operateur inconnu nous additionnerons la somme des deux entrer 
	}
	
	}
	
		else 
		{		
		System.out.println("Erreur, veuillez recommencer"); // réponse si le resultat ce situe en dessous de -1000 et au dessus de 1000
		}
		
		sc.close();
	}	

}

/*Exercice 06
Récupérer la saisie de 2 nombres entiers, puis la saisie d'un opérateur '+', '-', '*' ou '/'.
Si l'utilisateur entre un opérateur erroné, le programme affichera un message d'erreur.
Dans le cas contraire, le programme effectuera l'opération demandée (en prévoyant le
cas d'erreur "division par 0"), puis affichera le résultat.
hypothèses :
- les bornes -1000 et 1000 sont acceptées
- si l'opérateur n'est pas correct, on effectue une addition
V0 : pas de prise en compte de la conception du programme (séparation entre trt et affichage)*/