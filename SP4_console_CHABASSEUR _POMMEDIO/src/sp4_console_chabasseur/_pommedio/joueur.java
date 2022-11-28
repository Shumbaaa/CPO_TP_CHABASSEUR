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
    
    public void Joueur(String nomJoueur){
        nom=nomJoueur;
        nombreDesintegrateurs=0;
    }
    
    public void affecterCouleur(String uneCouleur){
        couleur=uneCouleur;
    }
    
    public int nombreDeJetons(){
        return reserveJetons.size();
    }
    
    public void ajouterJetons(String unJeton){
        reserveJetons.add(unJeton);
    }
    
}
