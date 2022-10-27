/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chabasseur;

/**
 *
 * @author solal
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures ;
    
    
    public Personne (String UnNom, String UnPrenom){ //constructeur
        nom=UnNom;
        prenom=UnPrenom;
        liste_voitures = new Voiture [3] ;
        nbVoitures=0;   
    }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) { 
    boolean reussit = true;   
        if (voiture_a_ajouter.Proprietaire != null ) {
            reussit = false;
        }       
        if ( nbVoitures>= 3) {
            reussit = false;
        }       
        else {
            liste_voitures[nbVoitures] = voiture_a_ajouter; 
            nbVoitures ++;
            voiture_a_ajouter.Proprietaire = this ; 
        }
      return reussit;
 
    }
    
    @Override
    public String toString () {
        return "Le nom de la personne est: "+nom+ "Et son prénom est:"+prenom;
}   
}
