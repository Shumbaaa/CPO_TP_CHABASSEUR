/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chabasseur;

/**
 *
 * @author solal
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture (String UnModele, String UneMarque, int UnePuissanceCV){
        Personne Proprietaire= new Personne("NULL", "NULL");
        Modele=UnModele;
        Marque=UneMarque;
        PuissanceCV=UnePuissanceCV;
        
    }
    
    
    
    
    
    @Override
    public String toString () {
        return "Le modele est :" +Modele+" de la marque : "+Marque+" Avec une puissance de : "+PuissanceCV;
}   

}
