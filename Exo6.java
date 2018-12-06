package exo6;

import java.util.Scanner;

import org.graalvm.compiler.nodes.NodeView.Default;


public class Exo6 
{

	public static void main(String[] args) 
	{
	
		
		Scanner sc = new Scanner(System.in); // import scanner
		boolean verif = true;
		/* ici j'utilise un boolean pour prendre tous mon code dans la boucle, 
		 * je specifie plus bas que verif est falsetant qu'il est false la boucle ne ce run pas si il est true (de base il est en true)
		 * la boucle ce run et réexecute le code */
		
		System.out.println("Veuillez saisir un nombre entre -1000 et 1000 :");
		int Nb1 = sc.nextInt(); // recup du premier nombre
		System.out.println("Vous avez saisi : " + Nb1);
		
		System.out.println("Veuillez saisir un deuxieme nombre entre -1000 et 1000 :");
		int Nb2 = sc.nextInt(); // recup du deuxieme nombre
		System.out.println("Vous avez saisi : " + Nb2);
		
		sc.nextLine();
		
		System.out.println("Saisie operateur : 1=+, 2=-,3=/,4=* ");
		int operateur = sc.nextInt(); // recup de l'operateur NB
		
		
		if((Nb1 >= -1000) && (Nb1 <= 1000) && (Nb2 >= -1000) && (Nb2 <= 1000)) {
		/* on utilise switch et case pour des conditions à la carte en appelant l'operateur 
		 * et en le definissant avec le case "" */
		
	switch (operateur) 
	{
		
		case 1: System.out.println(Nb1 + Nb2);
			break; // stop
		
		case 2: System.out.println(Nb1 - Nb2);
			break; // stop
		
		case 3: 
			if ((Nb1 != 0)&&(Nb2 != 0)) 
			{
				System.out.println(Nb1 / Nb2);
			} 
			else 
			{		
				System.out.println(" erreur impossible de divisé par zéro ");
			}
			break; // stop
		
		case 4: System.out.println(Nb1 * Nb2);
			break; // stop
		
		default :
    	System.out.println(" Mauvais opérateur utilisé, nous allons donc additioné! "); // operateur inconnu 
    	System.out.println(Nb1 + Nb2);
	}
	
	}
	
		else 
		{		
		System.out.println("Erreur, veuillez recommencer"); // réponse si le resultat ce situe en dessous de -1000 et au dessus de 1000
		}
	}	

}
