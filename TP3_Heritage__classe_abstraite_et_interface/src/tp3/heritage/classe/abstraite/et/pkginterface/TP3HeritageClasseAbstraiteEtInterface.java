/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.heritage.classe.abstraite.et.pkginterface;

import Armes.Baton;
import Armes.Armes;
import Armes.Epee;
import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
import java.util.ArrayList;

/**
 *
 * @author solal
 */
public class TP3HeritageClasseAbstraiteEtInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee ("Excalibur", 7, 5);
        Epee epee2 = new Epee ("Durandal", 4, 7);
        
        Baton baton1 = new Baton("Chêne",4,5);
        Baton baton2 = new Baton ("Charme", 5, 6);
        
        ArrayList<Armes> tabArme = new ArrayList<Armes>();
        tabArme.add(epee1);
        tabArme.add(epee2);
        tabArme.add(baton1);
        tabArme.add(baton2);
        
        for (int i=0; i<4;i++){
            System.out.print(tabArme.get(i));
        }
        System.out.println();
        
        Magicien mage1 = new Magicien ("Gandalf", 65, "confirme");
        Magicien mage2 = new Magicien ("Garcimore", 44, "novice");
        
        Guerrier guerr1 = new Guerrier("Conan",78,"a pied");
        Guerrier guerr2 = new Guerrier("Lannister",45,"cheval");
        
        ArrayList<Personnage> tabPerso = new ArrayList<Personnage>();
        tabPerso.add(mage1);
        tabPerso.add(mage2);
        tabPerso.add(guerr1);
        tabPerso.add(guerr2);
        
        for (int i=0; i<4;i++){
            System.out.print(tabPerso.get(i));
        }
        
        Magicien mage3 = new Magicien ("Abdellah Makhchan", 99, "confirme");
        Guerrier guerr3 = new Guerrier("Jerome Taillefer",90,"cheval");
        
        Epee epee3 = new Epee ("Bazouzou", 69, 96);
        Epee epee4 = new Epee ("Poutre de Bamako", 99, 2);
        Epee epee5 = new Epee ("Braquemar", 80, 60);
        
        Baton baton3 = new Baton("Boulot",34,9);
        Baton baton4 = new Baton ("Tige de l'infie", 78, 6);
        Baton baton5 = new Baton ("Le Nawfel", 1, 19);
        
       guerr3.ajouterArme(epee5);
       guerr3.ajouterArme(epee4);
       guerr3.ajouterArme(baton3);
       guerr3.EquipArme("Braquemar");
       
       mage3.ajouterArme(baton4);
       mage3.ajouterArme(baton5);
       mage3.ajouterArme(epee3);
       mage3.EquipArme("Le Nawfel");
       
      
    }
}
