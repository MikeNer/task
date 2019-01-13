package johner.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrmSystem {

	public static void main(String[] args) {
	
	//Erzeugt Scanner, für die Eingabe des Users	
	 Scanner scann = new Scanner(System.in);
		    
     System.out.println("---------------------------");
     System.out.println("Johner Institut Crm");
     System.out.println("---------------------------");
     System.out.println("Bitte wählen Sie eine der folgenden Optionen");
     System.out.println("");
     System.out.println("[1]Kunde erfassen");
     System.out.println("[2]Liste alle Kunden ausgeben");
	
     //Liste zur lokalen Speicherung der Nutzernamen
     List<String> kundenNamen = new ArrayList();
     //Speichert Eingabe 
     int eingabe = scann.nextInt();
     
     
     //Aufruf der Methoden:
     
     
	}
	
	/*
	 * Methode checkt die Eingabe im Menue
	 */
	 public static String checkMenue(int eingabe)
	  {
	    switch (eingabe) {
	    case 1: 
	      return "eingabe";
	    case 2: 
	      return "ausgabe";
	    case 3: 
	      return "esc";
	    }
	    return "Geben sie eine valide eingabe ein!";
	  }
	 
	 /*
	  * 
	  */

}



















