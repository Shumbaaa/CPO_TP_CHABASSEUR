/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_chabasseur;

/**
 *
 * @author solal
 */
public class TP2_relation_1_CHABASSEUR {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " +
        bob.liste_voitures[0] ) ;
        
        bob.liste_voitures[1] = uneAutreClio ;
        uneAutreClio.Proprietaire = bob ;
        System.out.println("la deuxieme voiture de Bob est " +
        bob.liste_voitures[1] ) ; 
        
        reno.liste_voitures[0] = uneMicra ;
        uneMicra.Proprietaire = reno ;
        System.out.println("la premiere voiture de Reno est " +
        reno.liste_voitures[0] ) ; 
        
        reno.liste_voitures[1] = une2008 ;
        une2008.Proprietaire = reno ;
        System.out.println("la deuxieme voiture de Reno est " +
        reno.liste_voitures[1] ) ; 
        
        bob.nbVoitures = 2 ;
        reno.nbVoitures= 2;
        
        reno.ajouter_voiture(uneClio);
        
        
    }   
    
}
