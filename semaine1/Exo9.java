package MonPremierProjet;

import java.util.Scanner;

public class Exo9 

{		
	static int jeune, moyen, vieux, age = 0; //on déclare les variables qui vont nous êtres utiles


    public static void main(String[] args) {
    // tape ton code
        Scanner sc = new Scanner(System.in); // import scanner

        do{

            System.out.println("Veuillez saisir votre âge : ");

    //        int jeune = sc.nextInt(); // recup l'age des utilisteurs >20
    //        int moyen = sc.nextInt(); // recup l'age des utilisteurs <40
    //        int vieux = sc.nextInt(); // recup l'age des utilisteurs >=40
    //
    //        System.out.println("Vous avez saisi : " + jeune + moyen + vieux);

            age = sc.nextInt();
            System.out.println("Vous avez saisi : " + age);

            sc.nextLine();


            //if((jeune < 20) | (moyen < 40) | (vieux >= 40)) {
                /* on utilise switch et case pour des conditions à la carte en appelant l'operateur
                 * et en le definissant avec le case "" */

            if(age < 20){
                jeune++;
                System.out.println("Il y a désormais " + jeune + " jeune(s) personne(s)");
            }else if(age < 40) {
                moyen++;
                System.out.println("Il y a désormais " + moyen + " personne(s) d'age moyen");
            }else if(age < 100){
                vieux++;
                System.out.println("Il y a désormais " + vieux + " personne(s) agée(s)");
        }}while(age < 100);

        vieux++;
        System.out.println("Il y a désormais " + vieux + " personne(s) agée(s) mais aussi " + jeune + " jeunes et pour finir " + moyen + " personnes d'âge moyen, 1nous avons enfin trouvé un centenaire, fin du programme...");

        sc.close();
    }
	
	}
