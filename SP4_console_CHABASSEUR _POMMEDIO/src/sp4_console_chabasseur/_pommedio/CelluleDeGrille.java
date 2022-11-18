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
    
    public CelluleDeGrille(){ //initialise une cellule de grille
        jetonCourant=null;
        avoirTrouNoir=false;
        avoirDesintegrateur=false;
    }
    public boolean presenceJeton(){ //indique si une cellule possède un jeton ou non
        if (jetonCourant==null){
            return false;
        }else{
            return true;
        }
    }

    public void affecterJeton(String unJeton){ //affecte un jeton dans une cellule
        jetonCourant=unJeton;
    }

    public String lireCouleurDuJeton() { //permet de renvoyer la couleur du jeton d'une cellule ou "vide" si il n'y a pas de jeton
        if (jetonCourant==null){
            return "vide";
        }else{
            return jetonCourant;
        }
    }
    
    public void placerTrouNoir(){ //permet de placer un trou noir dans une cellule
        avoirTrouNoir=true;
    }
    public void supprimerTrouNoir(){  //permet de supprimer un trou noir dans une cellule
        avoirTrouNoir=false;
    }
    
    public boolean presenceTrouNoir(){ //permet de savoir si une cellule possède un trou noir ou non
        if(avoirTrouNoir==true){
            return true;
        }else{
            return false;
        }
    }
   
    public String recupererJeton(){ 
        String jetonRecuperer=jetonCourant; //on recupere le jeton de la cellule que l'on met dans une variable temoporaire
        jetonCourant=null; //on donne la valeur null au jeton que l'on vient de récuperer
        return jetonRecuperer; //on retourne la valeur du jeton que l'on a récuperer
    }
    public void supprimerJeton(){
        jetonCourant=null; //suppression du jeton, on ne le récupère pas
    }
    
    public boolean presenceDesintegrateur(){ 
        if (avoirDesintegrateur==true){ //renvoi true s'il y a un desintegrateur
            return true;
        }else{
            return false; //renvoi false s'il n'y a pas un desintegrateur
        }
    }
    
    public void placerDesintegrateur(){
        avoirDesintegrateur=true;  //place un desintegrateur dans la cellule
    }
    public void supprimerDesintegrateur(){
        avoirDesintegrateur=false;  //supprime le desintegrateur de la cellule
    }
    public void activerTrouNoir(){ //supprime le jeton et le trou noir
        supprimerJeton();
        supprimerTrouNoir();
    }
    
}
