package javatest;

import java.util.Scanner;

public class coucou {

private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
	System.out.println("Entrer votre nom");
	String str = sc.nextLine();
	System.out.println("votre nom: Salut " + str);
}
}