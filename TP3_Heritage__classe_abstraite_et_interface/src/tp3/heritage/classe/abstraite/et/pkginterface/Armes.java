/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.heritage.classe.abstraite.et.pkginterface;

/**
 *
 * @author solal
 */
public class Armes {
    String nom;
    int nvAttaque;
    
    public Armes (String unNom, int unNiveauAttaque){
        nom = unNom;
        nvAttaque=unNiveauAttaque;
        if (unNiveauAttaque>100){
            nvAttaque=100;
        }
        else if (unNiveauAttaque<0){
            nvAttaque=0;
        }  
    }    
        
        
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom+ " : "+ nvAttaque ;
        return chaine_a_retourner ;     
    }
}
