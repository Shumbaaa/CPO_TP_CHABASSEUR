/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

import java.util.ArrayList;

/**
 *
 * @author solal
 */
public class joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons = new ArrayList<Jeton>();
    private int nombreDesintegrateurs;
    
    public joueur(String nomJoueur){
        this.nom=nomJoueur;
        this.nombreDesintegrateurs=0;
    }
    
    public void affecterCouleur(String uneCouleur){
        this.couleur=uneCouleur;
    }
    
    public int nombreDeJetons(){
        return reserveJetons.size();
    }
    
    public void ajouterJetons(Jeton unJeton){
        reserveJetons.add(unJeton);
    }

    public String getCouleur() {
        return couleur;
    }
     
    public Jeton jouerJeton(){
        Jeton jetonJoue;
        jetonJoue=reserveJetons.get(0); //on recupere le jeton qui sera joue pour le renvoyer a la fin
        reserveJetons.remove(0);
        return jetonJoue; 
    }
       
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs += 1;
    }
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs -= 1;
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Jeton> getReserveJetons() {
        return reserveJetons;
    }

    public int getNombreDesintegrateurs() {
        return nombreDesintegrateurs;
    }

    public String getNom() {
        return nom;
    }
    
    
    
    
    
}
