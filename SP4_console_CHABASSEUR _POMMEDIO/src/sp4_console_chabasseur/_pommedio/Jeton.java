/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

/**
 *
 * @author solal
 */
public class Jeton {
    
    private String couleur; //Private permet de fixer la couleur du jeton

    public Jeton(String couleur) {  //Constructeur
        this.couleur = couleur;
    }

    public String lireCouleur() {  // Getter
        return couleur;
    }

    @Override
    public String toString() {  //Affichage toString
        if ("rouge".equals(couleur)){
            return "R";
        }else{
            return "J";
        }    
    }

    
    
    
}
