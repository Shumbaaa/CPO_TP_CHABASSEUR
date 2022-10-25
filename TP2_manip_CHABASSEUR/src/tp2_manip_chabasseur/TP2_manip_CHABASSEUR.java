/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_chabasseur;

/**
 *
 * @author solal
 */
public class TP2_manip_CHABASSEUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ;//assiette 3 et assiette 2 sont la meme tartiflette 
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
   
        assiette2=assiette1;
        assiette1=assiette3;//on intervertit les valeurs et comme asssiette3 = assiette 2 cela résoud le problème du fait que à la ligne précedente assiette 2 change de valeur.
        System.out.println("le nombre de calories de assiette 1 est : "+assiette1.nbCalories);
        System.out.println("le nombre de calories de assiette 2 est : "+assiette2.nbCalories);
       
        //Q6:assiette 1 est reliée a Tartiflette, elle ne peut donc pas etre relié a Moussaka ;
        //la deuxième ligne est fausse car  une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre type d'objet différent
        Moussaka [] ref =new Moussaka[10];//on va crée dix valeurs de moussaka
        for (int i=0; i<10;i++){
            ref[i]=new Moussaka((int) (Math.random()*1500));
        }
        System.out.println(ref[5].nbCalories);
        System.out.println(ref[6].nbCalories);
        System.out.println(ref[7].nbCalories);
        }
}
