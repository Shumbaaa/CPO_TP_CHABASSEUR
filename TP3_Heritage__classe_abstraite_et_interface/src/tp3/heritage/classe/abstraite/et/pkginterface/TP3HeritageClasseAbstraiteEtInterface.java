/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.heritage.classe.abstraite.et.pkginterface;

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
        
        System.out.println(epee1);
        System.out.println(baton1);
        
        
        ArrayList<Armes> tab = new ArrayList<Armes>();
        tab.add(epee1);
        tab.add(epee2);
        tab.add(baton1);
        tab.add(baton2);
        
        System.out.print(tab.get(0));
        System.out.print(tab.get(1));
        System.out.print(tab.get(2));
        System.out.print(tab.get(3));
        
    }
}
