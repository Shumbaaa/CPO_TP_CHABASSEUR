/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.Armes;
import java.util.ArrayList;
/**
 *
 * @author solal
 */
public class Personnage {
    String NomPerso;
    int Vie;
    ArrayList<Armes> inventaire = new ArrayList<Armes>();
    Armes arme_en_main;
    
    public Personnage(String unNomPerso, int uneVie){
        NomPerso=unNomPerso;
        Vie=uneVie;
        arme_en_main = null;
    }
    
    public void ajouterArme (Armes arme_a_ajouter){
        if (inventaire.size()<5){
            inventaire.add(arme_a_ajouter);           
        }
    }
    
    public Armes getArme_en_main(){
        return arme_en_main;
    }
    
    public String EquipArme(String uneArme){
        for (int i=0; i<5;i++){
            if (inventaire.(i)==uneArme){
                arme_en_main=uneArme;
                System.out.println("L'arme a bien ete affecte");
            }
        }
    }
    
    @Override
    public String toString(){
        String chaine;
        chaine = "{Personnage: "+NomPerso+" Niveau de vie: "+Vie+"}";
        return chaine;
    }
    
}
