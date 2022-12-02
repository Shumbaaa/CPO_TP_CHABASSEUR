/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

/**
 *
 * @author solal
 */
public class SP4_console_CHABASSEUR_POMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        joueur J1 = new joueur("Solal");
        joueur J2 = new joueur("Kenzo");
        Partie game= new Partie(J1,J2);
        game.initialiserPartie();
        game.lancerPartie();
    }
    
}
