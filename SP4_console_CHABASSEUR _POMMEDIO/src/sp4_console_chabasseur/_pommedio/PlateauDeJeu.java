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
    
    public boolean colonneGagnantePourCouleur(String uneCouleur){
        for(int col=0;col<7;col++){
            for(int ligne=0;ligne<3;ligne++){
                if (grille[ligne][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+1][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+2][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+3][col].lireCouleurDuJeton().equals(uneCouleur));
                return true;
            }
        }
        return false;
    }
    
    public boolean diagonaleMontanteGagnantePourCouleur(String uneCouleur){
        for(int ligne=0; ligne<3;ligne++){
            for(int col=0; col<4;col++){
                if (grille[ligne][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+1][col+1].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+2][col+2].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne+3][col+3].lireCouleurDuJeton().equals(uneCouleur));
                return true;
            }
        }
        return false;
    }
    
    public boolean diagonaleDescendanteGagnantePourCouleur(String uneCouleur){
        for(int ligne=3;ligne<6;ligne++){
            for(int col=0;col<4;col++){
                if (grille[ligne][col].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne-1][col+1].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne-2][col+2].lireCouleurDuJeton().equals(uneCouleur)&&grille[ligne-3][col+3].lireCouleurDuJeton().equals(uneCouleur));
                return true;
            }
        }
        return false;
    }
    
    public boolean etreGagnantePourCouleur(String uneCouleur) {
        if (ligneGagnantePourCouleur(uneCouleur) == true || colonneGagnantePourCouleur(uneCouleur) == true || diagonaleMontanteGagnantePourCouleur(uneCouleur) == true || diagonaleDescendanteGagnantePourCouleur(uneCouleur) == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public void tasserColonne(int uneColonne){
        for(int ligne=0;ligne<7;ligne++){
            if (grille[ligne][uneColonne].presenceJeton()==false){
                if(grille[ligne+1][uneColonne].presenceJeton()==true){
                    grille[ligne][uneColonne].affecterJeton(grille[ligne+1][uneColonne].recupererJeton());
                }
            }
        }
    }
    
    public boolean colonneRemplie(int uneColonne){
        if (grille[5][uneColonne].presenceJeton() == true){
            return true;
        }
        return false;
    }
    
    public void placerTrouNoir(int x, int y){
        grille[x][y].placerTrouNoir();
    }
    
    public void supprimerTrouNoir(int x, int y){
        grille[x][y].supprimerTrouNoir();
    }
    
    public boolean presenceTrouNoir(int x, int y){
        if (grille[x][y].presenceTrouNoir()==true){
            return true;
        }else{
            return false;
        }
    }
    
    public void placerDesintegrateur(int x, int y){
        grille[x][y].placerDesintegrateur();
    }
    
    public void supprimerJeton(int x, int y){
        grille[x][y].supprimerJeton();
    }
    
    public boolean presenceDesintegrateur(int x, int y){
        if (grille[x][y].presenceDesintegrateur()==true){
            return true;
        }else{
            return false;
        }
    }
    
    public Jeton recupererJeton(int x, int y){
        return grille[x][y].recupererJeton();
    }
   
}