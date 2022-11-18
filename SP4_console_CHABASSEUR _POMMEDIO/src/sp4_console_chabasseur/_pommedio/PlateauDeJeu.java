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
    
    public int ajouterJetonDansColonne(String unJeton, int uneColonne){
        for(int ligne=0;ligne<6;ligne++){ //balaye les lignes
            if (grille[ligne][uneColonne].lireCouleurDuJeton()=="vide"){ //si la cellules est vide
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
    
}