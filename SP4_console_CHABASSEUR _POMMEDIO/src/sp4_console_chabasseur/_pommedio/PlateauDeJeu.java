/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

/**
 *
 * @author solal
 */
public class PlateauDeJeu {
    CelluleDeGrille grille[][]= new CelluleDeGrille[6][7];
    
    public PlateauDeJeu(){
        for(int ligne=0; ligne<6;ligne++){ //balaye les lignes
            for(int col=0; col<7;col++){ //balaye les colonnes
                grille[ligne][col]=new CelluleDeGrille(); //affecte un nouvel objet CelluleDeGrille à chaque cellule du tableau
            }
        }
    }
    
    public int ajouterJetonDansColonne(Jeton unJeton, int uneColonne){
        for(int ligne=0;ligne<6;ligne++){ //balaye les lignes
            if ("vide".equals(grille[ligne][uneColonne].lireCouleurDuJeton())){ //si la cellules est vide
                grille[ligne][uneColonne].affecterJeton(unJeton); // affecte la valeur du Jeton à la cellules vide
                return ligne;  //retourne l'indice de ligne du jeton afin de connaitre ses coordonnées
            }
        }   
        return -1;
    }
    
    public boolean grilleRemplie(){
            for(int col=0; col<7;col++){ //balaye les colonnes de la grille
                if (grille[5][col].presenceJeton()==false){ //verifie la présence d'un jeton dans les colonnes de la ligne la plus haute de la grille
                    return false;  //retourne false si une cellule de la premiere ligne est vide
                }
            } 
        return true; // sinon retourne vrai
    }
    
    public void afficherGrilleSurConsole(){
        for(int ligne=5; ligne>=0;ligne--){ //balaye les lignes
            for(int col=0; col<7;col++){ //balaye les colonnes
                System.out.print(grille[ligne][col]); //affecte un nouvel objet CelluleDeGrille à chaque cellule du tableau
            }
            System.out.println(); //retour à la ligne lorqu'on a fini d'afficher une ligne
        }
    }
    
    public boolean presenceJeton(int x, int y){
        return grille[x][y].presenceJeton();
    }
    
    public String lireCouleurDuJeton(int x, int y){
        return grille[x][y].lireCouleurDuJeton();
    }
    
    public boolean ligneGagnantePourCouleur(String uneCouleur){
        for(int ligne=0;ligne<6;ligne++){
            for(int col=0; col<4;col++){
                if (grille[ligne][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne][col+1].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne][col+2].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne][col+3].lireCouleurDuJeton().equals(uneCouleur));
                return true;
            }
        }
        return false;
    }
}