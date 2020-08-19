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
public class informations {

    
    private String nomAvocat;
    private String nomClient;
    private String prenomClient;
    private String descriptifAffaire;
    private Float remnerationAffaire;
    private int numeroDossier;
    
    public informations(){
        nomAvocat="inconnu";
        nomClient="inconnu";
        prenomClient="inconnu";
        descriptifAffaire="aucun";
        remnerationAffaire=0F;
        numeroDossier=0;
    }
    
    public informations(String nA,String nC, String pC, String desc,Float remA){
        nomAvocat=nA;
        nomClient=nC;
        prenomClient=pC;
        descriptifAffaire=desc;
        remnerationAffaire=remA;
        numeroDossier+=1;
    }
    //getter
    public String getNameAvocat() {
        return nomAvocat;
    }
    
    public String getNameClient() {
        return nomClient;
    }
    
    public String getPrenomClient() {
        return prenomClient;
    }
    
    public String getDesc() {
        return descriptifAffaire;
    }
    
    public Float getRemuneration() {
        return this.remnerationAffaire;
    }
    
     public int getNum() {
        return this.numeroDossier;
    }
  // Setter
    public void setNameAvocat(String newNameAvocat) {
        this.nomAvocat = newNameAvocat;
    }
    
    public void setNameClient(String newNameClient) {
        this.nomClient = newNameClient;
    }
    
    public void setPrenom(String newPrenom) {
        this.prenomClient = newPrenom;
    }
    
    public void setDesc(String newDesc) {
        this.descriptifAffaire = newDesc;
    }
    
    public void setRem(Float newRem) {
        this.remnerationAffaire = newRem;
    }
    
}
