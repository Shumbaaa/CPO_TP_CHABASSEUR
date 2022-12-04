/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author solal
 */
public class Partie {
    private joueur[] listeJoueurs = new joueur[2];
    private joueur joueurCourant = listeJoueurs[0];
    private PlateauDeJeu plateau = new PlateauDeJeu();

    public Partie(joueur Joueur1, joueur Joueur2) {
        listeJoueurs[0]=Joueur1;
        listeJoueurs[1]=Joueur2;
        this.plateau= new PlateauDeJeu();
    }
    
    public void attribuerCouleursAuxJoueurs() {
        double alea = Math.random(); //Math.random génére un double aléatoire entre 0 et 1   
        if (alea<0.51){       //une chance sur 2 d'etre inferieur a 0,5
            listeJoueurs[0].affecterCouleur("rouge");        
            listeJoueurs[1].affecterCouleur("jaune");    
        }else {     
            listeJoueurs[0].affecterCouleur("jaune");       
            listeJoueurs[1].affecterCouleur("rouge");   
        }
    }
    
    public void creerEtAffecterJeton(joueur Joueur){
        for(int i=0; i<30;i++){
            Joueur.ajouterJetons(new Jeton(Joueur.getCouleur()));
        }   
    }
    
    public void placerTrousNoirsEtDesintegrateurs(){
        Random r = new Random();
        int i=0;
        int j=0;
        int z=0;
        while(i!=3){
            int ligne = r.nextInt(6);
            int col= r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,col)==false&&plateau.presenceDesintegrateur(ligne,col)==false){
                plateau.placerTrouNoir(ligne,col);
                plateau.placerDesintegrateur(ligne,col); 
                i+=1;
            }
        }
        while(j!=2){
            int ligne = r.nextInt(6);
            int col= r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,col)==false||plateau.presenceDesintegrateur(ligne, col)){
                plateau.placerTrouNoir(ligne,col);
                j+=1;
            }
        }
        
        while(z!=2){
            int ligne = r.nextInt(6);
            int col= r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,col)==false||plateau.presenceDesintegrateur(ligne, col)){
                plateau.placerTrouNoir(ligne,col);
                z+=1;
            }
        }
    }
    
    public void initialiserPartie(){
        attribuerCouleursAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
    }
    
    public void lancerPartie(){
        boolean FinDePartie=false;
        joueurCourant=listeJoueurs[0];
        placerTrousNoirsEtDesintegrateurs();
        
        while(FinDePartie==false){
            Scanner sc;
            int NumColJouer;
            int NumLigneJouer;
            int repJoueur;
            sc = new Scanner (System.in);
            plateau.afficherGrilleSurConsole();
            System.out.println("{Avancée de la partie}");
            System.out.println("["+listeJoueurs[0]+": Nombre de jetons "+ listeJoueurs[0].getCouleur() +" utilisable = "+listeJoueurs[0].getReserveJetons().size()+" | Nombre de desintegrateurs utilisables = "+listeJoueurs[0].getNombreDesintegrateurs()+"]");
            System.out.println("["+listeJoueurs[1]+": Nombre de jetons "+ listeJoueurs[1].getCouleur() +" utilisable = "+listeJoueurs[1].getReserveJetons().size()+" | Nombre de desintegrateurs utilisables = "+listeJoueurs[1].getNombreDesintegrateurs()+"]");
            
            System.out.println("C'est au tour de "+ joueurCourant+ " de jouer.");
            System.out.println("[Jouer : tapez 1] [Récupérer un jeton : tapez 2] [Utiliser un désintégrateur : tapez 3");
            
        }
        
    }
        
}
