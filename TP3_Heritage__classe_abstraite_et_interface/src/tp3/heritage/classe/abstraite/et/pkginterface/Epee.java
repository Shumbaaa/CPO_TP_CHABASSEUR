/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.heritage.classe.abstraite.et.pkginterface;

/**
 *
 * @author solal
 */
public class Epee extends Armes{
    int finesse;
    
    public Epee (String unNom, int unNiveauAttaque, int uneFinesse){
        super(unNom, unNiveauAttaque);
   
        finesse=uneFinesse;
        if (uneFinesse>100){
            finesse=100;
        }else if(uneFinesse<0){
            finesse=0;
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "{Epee: "+nom+ ", Niveau d'attaque: "+ nvAttaque+ ", Finesse: "+ finesse+"}";
        return chaine_a_retourner ;     
    }
}
