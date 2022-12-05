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

    public String lireCouleur() {
        return couleur;
    }

    public String getCouleur() {  
        if (couleur=="rouge"){
            return "R";
        }else 
             return "J";        
    }
    
    
    
    @Override    
    public String toString() {
        if (couleur == "Rouge" ){
            return "R" ;
    }
        else{
            return "J";
        }
    }

    
    
    
}
