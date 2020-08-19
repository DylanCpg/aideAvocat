/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aideavocat;

/**
 *
 * @author Dylan
 */

import java.util.Scanner; 
import java.util.*;
import jdk.nashorn.internal.ir.RuntimeNode;

public class AideAvocat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       int cpt=0;
       int cptModif=0;
       int test=0;
       Float rem2=0F;
       Float rem=0F;
       
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Pour ajouter un dossier entrez a,pour modifier un dossier tapez s, pour quitter tapez Q");
       String reponse = sc.nextLine();
       
       String choice=reponse;
       informations Informations = new informations();
       
       while(!"Q".equals(reponse) && ! "q".equals(reponse)){
           if(cpt>0){
             System.out.println("\nPour ajouter un dossier entrez a,pour modifier un dossier tapez s, pour quitter tapez Q");
             reponse = sc.nextLine();
             reponse = sc.nextLine();
          
             choice=reponse;
           }
      
            switch (choice) {
                 case "a": System.out.println("Veuillez saisir le nom de l'avocat svp :");
                         String nomAvocat = sc.nextLine();

                         System.out.println("Veuillez saisir le nom du client svp :");
                         String nomClient = sc.nextLine();

                         System.out.println("Veuillez saisir le prenom du client svp :");
                         String prenomClient = sc.nextLine();

                         System.out.println("Veuillez saisir le descriptif du dossier svp :");
                         String desc = sc.nextLine();
                        
                            try{
                           
                               System.out.println("Veuillez saisir la rémunération du dossier en euro svp :");
                               rem = sc.nextFloat();
                              
                            }catch(Exception e){
                                System.out.println("valeur non valide remunération mise à 0€");    
                            }
                           
                         
                        
                         
                         Informations = new informations(nomAvocat,nomClient,prenomClient,desc,rem);

                         System.out.println("\nnom de l'avocat sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");
                         break;

                 case "s":
                       
                            System.out.println("\nEntrez le champs à modifier\n1:nom de l'avocat,\n2:nom du Client,\n3:prenom du client,\n4:descriptif du dossier,\n5:la rémunération,\n6:quitter le mode édition");
                            int reponseModif = sc.nextInt();
                            int choiceModif=reponseModif;
                            cptModif=0;
                            while((choiceModif<=6 && choiceModif>=1)){
                                if(cptModif>0){
                                 System.out.println("\nEntrez le champs à modifier\n1: nom de l'avocat,\n2:nom du Client,\n3:prenom du client,\n4:descriptif du dossier,\n5:la rémunération\n6:quitter le mode édition");
                                 reponseModif = sc.nextInt();
                                 choiceModif=reponseModif;
                                }
                                switch (choiceModif) {
                                    
                                    case 1:
                                        String nomA = sc.nextLine();
                                        System.out.println("Veuillez saisir le nom de l'avocat svp :");
                                        String nomAvocat2 = sc.nextLine();
                                        Informations.setNameAvocat(nomAvocat2);
                                        System.out.println("\nnom de l'avocate sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");                
                                        cptModif++;
                                        break;

                                    case 2 :
                                        String nomC = sc.nextLine();
                                        System.out.println("Veuillez saisir le nom du client svp :");
                                        String nomClient2 = sc.nextLine();
                                        Informations.setNameClient(nomClient2);
                                        System.out.println("\nnom de l'avocate sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");                
                                        cptModif++;
                                        break;

                                    case 3 :
                                        String prenom = sc.nextLine();
                                        System.out.println("Veuillez saisir le prenom du client svp :");
                                        String prenomClient2 = sc.nextLine();
                                        Informations.setPrenom(prenomClient2);
                                        System.out.println("\nnom de l'avocate sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");                
                                        cptModif++;
                                        break;

                                    case 4 :
                                        String des = sc.nextLine();
                                        System.out.println("Veuillez saisir le descriptif du dossier svp :");
                                        String desc2 = sc.nextLine();
                                        Informations.setDesc(desc2);
                                        System.out.println("\nnom de l'avocate sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");                
                                        cptModif++;
                                        break;

                                    case 5 :
                                        String remu = sc.nextLine();
                                        System.out.println("Veuillez saisir la rémunération du dossier en euro svp :");
                                       
                                        try{
                                            rem2 = sc.nextFloat();
                                            Informations.setRem(rem2);
                                            System.out.println("\nnom de l'avocate sur le dossier: " +Informations.getNameAvocat()+"\nnom du client: "+Informations.getNameClient()+"\nprénom du client: "+Informations.getPrenomClient()+"\ndescriptif de l'affaire: "+Informations.getDesc()+"\nrémunération: "+Informations.getRemuneration()+"€");                
                                            cptModif++;
                                            
                                        }catch(Exception e){
                                            System.out.println("pas la bonne valeur");
                                        }
                                        break;
                                    
                                    case 6:System.out.println("quitter mode edition\n");
                                            cptModif++;
                                            choiceModif=8;
                                            break;
                                        
                                    default: System.out.println("veuillez saisir un argument valide svp");
                                             break;
                                }
                               
                            } 
                           break;
                 case "q": 
                        System.exit(0);
                      
                        
                 case "Q": 
                     System.exit(0);
                     
                 default: System.out.println("veuillez saisir un argument valide svp");
                          break;
                
           } 
           if(cpt==0){
               cpt++;
           }
        }
       
     
    }
     
}
