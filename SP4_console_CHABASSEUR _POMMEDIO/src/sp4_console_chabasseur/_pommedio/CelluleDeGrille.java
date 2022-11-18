/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

/**
 *
 * @author solal
 */
public class CelluleDeGrille {
    private String jetonCourant=null;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
    public CelluleDeGrille(){
        jetonCourant=null;
        avoirTrouNoir=false;
        avoirDesintegrateur=false;
    }
    public boolean presenceJeton(){
        if (jetonCourant==null){
            return false;
        }else{
            return true;
        }
    }

    public void affecterJeton(String unJeton){
        jetonCourant=unJeton;
    }

    public String lireCouleurDuJeton() {
        if (jetonCourant==null){
            return "vide";
        }else{
            return jetonCourant;
        }
    }
    
    public void placerTrouNoir(){
        avoirTrouNoir=true;
    }
    public void supprimerTrouNoir(){  
        avoirTrouNoir=false;
    }
}
