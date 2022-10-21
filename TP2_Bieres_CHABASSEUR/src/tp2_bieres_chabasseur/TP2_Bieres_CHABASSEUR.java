/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_chabasseur;

/**
 *
 * @author solal
 */
public class TP2_Bieres_CHABASSEUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
    7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    
    
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",
    6.6 ,"Abbaye de Leffe") ;
    deuxBiere.lireEtiquette();
    
    BouteilleBiere troisBiere = new BouteilleBiere("Alfa",
    5.0 ,"ATHENIAN BREWERY") ;
    troisBiere.lireEtiquette();
    
    BouteilleBiere quatreBiere = new BouteilleBiere("Mythos",
    5.5 ,"Mythos Breweries") ;
    quatreBiere.lireEtiquette();
    
    BouteilleBiere cinqBiere = new BouteilleBiere("Fix",
    25.0 ,"Fix Breweries") ;
    cinqBiere.lireEtiquette();
    
    cinqBiere.Décapsuler();
    cinqBiere.Décapsuler();
    
    troisBiere.Décapsuler();
    deuxBiere.Décapsuler();
   
    System.out.println(cinqBiere);
    
    System.out.println();
    
    
    }
    

    
    
}

