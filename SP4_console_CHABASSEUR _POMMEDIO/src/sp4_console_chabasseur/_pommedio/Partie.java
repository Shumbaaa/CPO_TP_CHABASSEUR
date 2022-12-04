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
            if (plateau.presenceTrouNoir(ligne,col)==false||plateau.presenceDesintegrateur(ligne, col)==false){
                plateau.placerTrouNoir(ligne,col);
                j+=1;
            }
        }
        
        while(z!=2){
            int ligne = r.nextInt(6);
            int col= r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,col)==false||plateau.presenceDesintegrateur(ligne, col)==false){
                plateau.placerDesintegrateur(ligne,col);
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
            System.out.println("{Avancee de la partie}");
            System.out.println("["+listeJoueurs[0].getNom()+": Nombre de jetons "+ listeJoueurs[0].getCouleur() +" utilisable = "+listeJoueurs[0].getReserveJetons().size()+" | Nombre de desintegrateurs utilisables = "+listeJoueurs[0].getNombreDesintegrateurs()+"]");
            System.out.println("["+listeJoueurs[1].getNom()+": Nombre de jetons "+ listeJoueurs[1].getCouleur() +" utilisable = "+listeJoueurs[1].getReserveJetons().size()+" | Nombre de desintegrateurs utilisables = "+listeJoueurs[1].getNombreDesintegrateurs()+"]");
            
            System.out.println("C'est au tour de "+ joueurCourant.getNom()+ " de jouer.");
            System.out.println("[Jouer : tapez 1] [Recuperer un jeton : tapez 2] [Utiliser un desintegrateur : tapez 3");
            repJoueur = sc.nextInt();
            // on aura donc trois cas
            if (repJoueur==1){
                System.out.println("Saisissez le numero de la colonne de 1 à 7 dans laquelle vous souhaitez placer un jeton.");
                plateau.afficherGrilleSurConsole();
                NumColJouer= sc.nextInt()-1;
                NumLigneJouer = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), NumColJouer);
                
                if (plateau.grilleRemplie()==true){
                    System.out.println("Fin de partie, la grille est remplie");
                    FinDePartie = true;
                }

                if (NumLigneJouer == -1){
                    System.out.println("La colonne " +NumColJouer+" est pleine");
                    joueurCourant.ajouterJetons(new Jeton(joueurCourant.getCouleur()));                
                }
                else{                
                    if (plateau.presenceTrouNoir(NumLigneJouer, NumColJouer)==true){
                        plateau.supprimerJeton(NumLigneJouer, NumColJouer);
                        plateau.supprimerTrouNoir(NumLigneJouer, NumColJouer);
                    }
                    if (plateau.presenceDesintegrateur(NumLigneJouer, NumColJouer)==true){ 
                        joueurCourant.obtenirDesintegrateur();
                        plateau.supprimerDesintegrateur(NumLigneJouer, NumColJouer);
                    } 
                }
                if (plateau.etreGagnantePourCouleur(joueurCourant.getCouleur()) == true) {
                    System.out.println("Bravo " + joueurCourant.getNom() + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinDePartie = true;
                }

                if (joueurCourant == listeJoueurs[0]) {
                    joueurCourant = listeJoueurs[1];
                }                                                  //permet de changer le tour
                else if (joueurCourant == listeJoueurs[1]) {
                    joueurCourant = listeJoueurs[0];
                }
            
            }
            else if (repJoueur==2){  
                
                System.out.println("Saisissez le numero de colonne de 1 a 7 du jeton");
                plateau.afficherGrilleSurConsole();
                NumColJouer = sc.nextInt()-1;
                System.out.println("Saisissez le numero de ligne de 1 a 6 du jeton");
                NumLigneJouer = sc.nextInt()-1;                

               
                if (plateau.presenceJeton(NumColJouer, NumLigneJouer)== true ){   //
                    if (plateau.lireCouleurDuJeton(NumColJouer,NumLigneJouer)==joueurCourant.getCouleur()){
                        plateau.supprimerJeton(NumColJouer, NumLigneJouer);           //
                        joueurCourant.ajouterJetons(new Jeton(joueurCourant.getCouleur()));    
                        plateau.tasserColonne(NumColJouer); 
                    }
                }

                    
                if (joueurCourant==listeJoueurs[0]){
                    if (plateau.etreGagnantePourCouleur(listeJoueurs[0].getCouleur())&&plateau.etreGagnantePourCouleur(listeJoueurs[1].getCouleur())) {
                        System.out.println("Bravo " + listeJoueurs[1].getNom() + " a gagne par faute de jeu de la part de "+ joueurCourant.getNom());
                        plateau.afficherGrilleSurConsole();
                        FinDePartie = true;
                    }else if (plateau.etreGagnantePourCouleur(listeJoueurs[0].getCouleur())) {
                    System.out.println("Bravo " + listeJoueurs[0].getNom() + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinDePartie = true;
                    }
                }
                if (joueurCourant==listeJoueurs[1]){
                    if (plateau.etreGagnantePourCouleur(listeJoueurs[0].getCouleur())&&plateau.etreGagnantePourCouleur(listeJoueurs[1].getCouleur())) {
                        System.out.println("Bravo " + listeJoueurs[0].getNom() + " a gagne par faute de jeu de la part de "+ joueurCourant.getNom());
                        plateau.afficherGrilleSurConsole();
                        FinDePartie = true;
                    }else if (plateau.etreGagnantePourCouleur(listeJoueurs[1].getCouleur())) {
                    System.out.println("Bravo " + listeJoueurs[1].getNom() + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinDePartie = true;
                    }
                }
                

                if (joueurCourant == listeJoueurs[0]) {
                    joueurCourant = listeJoueurs[1];
                }
                else if (joueurCourant == listeJoueurs[1]) {
                    joueurCourant = listeJoueurs[0];
                }
            }
            
            else if(repJoueur==3){
                if(joueurCourant.utiliserDesintegrateur()==false){
                    System.out.println("Vous n'avez pas de desintegrateur!");
                    continue;
                }else{
                    System.out.println("Choisissez la colonne de 1 à 7 du jeton à desintegrer");
                    NumColJouer = sc.nextInt()-1;
                    System.out.println("Choisissez la ligne de 1 à 6 du jeton à desintegrer");
                    NumLigneJouer= sc.nextInt()-1;
                    
                    if (plateau.presenceJeton(NumColJouer, NumLigneJouer)== true){
                        plateau.supprimerJeton(NumColJouer, NumLigneJouer); 
                        if (joueurCourant == listeJoueurs[0]) {
                            joueurCourant = listeJoueurs[1];
                        }else if (joueurCourant == listeJoueurs[1]) {
                            joueurCourant = listeJoueurs[0];
                        }
                    }else{
                        System.out.println("Choississez une cellule contenant un jeton!");
                        continue;
                    }
                    
                    
                }
                
            }
            
        }
        
    }
        
}
