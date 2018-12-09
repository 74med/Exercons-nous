package MonPremierProjet;

import java.util.Scanner;

public class Exo8 

{

		    private static int jeunes, personnes = 0;  //déclaration et initialisation des variables (interger à 0)

		    public static void main(String[] args) 
		    
		    {
			// tape ton code ici
		        Scanner sc = new Scanner(System.in);

		        do{
		            System.out.println("Veuillez saisir votre âge : ");
		            int age = sc.nextInt();  //variable temporaire, inutile de la faire sortir du scope de la boucle, raison pour laquelle elle est déclarée ici. On ne la libère pas, le garbage collector s'en chargera.
		            System.out.println("Vous avez saisi : " + age);
		            personnes++;  /* Astuce :
		                personnes++ est en fait un raccourci pour le code
		                personnes = personnes + 1;
		                qui serait trop long à écrire finalement. On peut également écrire :
		                personnes--
		                qui équivaut à
		                personnes = personnes - 1;
		            */

		            if(age <= 20) { // si l'age donné est 20 ans ou moins, zou on tag !
		                jeunes++;
		            }

		            System.out.println("Il y a actuellement " + jeunes + " jeune(s) personne(s) dans la population recensée (" + personnes + ")\n"); // utile pour faire beau ET valider que ça fonctionne à chaque saisie...

		        }while(personnes < 20);

		        System.out.println("Le recensement est terminé.\n" +
		                "Il y a " + jeunes + " jeune(s) personne(s) dans la population recensée (" + personnes +")"); //on se la pète, on fait un ptit bilan, on pourrait même donner la proportion de jeunes mais pas demandé.

		        sc.close();
		    }
}
/*
Ex 08
 Calculer le nombre de jeunes.
 Il s’agit de dénombrer toutes les personnes d'âge inférieur strictement à vingt ans
 parmi un échantillon donné de vingt personnes. Les personnes saisissent leur âge sur
 le clavier.*/