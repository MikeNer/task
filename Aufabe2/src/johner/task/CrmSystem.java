package johner.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrmSystem {

	public static void main(String[] args) {
		
	System.out.println("---------------------------");
	System.out.println("Johner Institut Crm");
	System.out.println("---------------------------");
	System.out.println("Bitte wählen Sie eine der folgenden Optionen");
	System.out.println("");
	System.out.println("[Press 1]Kunde erfassen");
	System.out.println("[Press 2]Liste aller Kunden ausgeben");	
			
	//Erzeugt Scanner, für die Eingabe des Users	
	Scanner scann = new Scanner(System.in);
	
	//Liste zur lokalen Speicherung der Nutzernamen
    List<String> userList = new ArrayList();
    
    //Speichert Eingabe 
    int menueInput = scann.nextInt();
    String userName;
	
    /*boolean ermöglicht
     *mehrmalige Eingabe des Users
     */
    boolean start = true;
	
	do {
	if(menueInput == 1){
    	 System.out.println("Geben Sie ihren Namen ein");
    	 userName=scann.next();
    	 userList.add(userName);
    	 System.out.println("[Press 1]Weitere Kunde erfassen");
    	 System.out.println("[Press 2]Liste aller Kunden ausgeben");	
    	 menueInput= scann.nextInt();
     }
	if(menueInput == 2 && !userList.isEmpty()){
		for(String name : userList){
    		 System.out.println("Kundenname:"+name +"\n");
    	 }
		System.out.println("[Press 1]Weitere Kunden erfassen");
    	System.out.println("[Press 2]Liste aller Kunden ausgeben");
    	menueInput= scann.nextInt();

      }
	if(menueInput == 2 && userList.isEmpty()){
		System.out.println("Userlist ist noch leer");
		System.out.println("[Press 1]Weitere Kunden erfassen");
    	System.out.println("[Press 2]Liste aller Kunden ausgeben");
    	menueInput= scann.nextInt();
      }
	else if(menueInput != 1 && menueInput != 2){
		System.out.println("Gebe eine valide Eingabe ein!");
		System.out.println("[Press 1]Kunde erfassen");
    	System.out.println("[Press 2]Liste aller Kunden ausgeben");
    	menueInput= scann.nextInt();
	  }
     }while(start);
    }
   }



















