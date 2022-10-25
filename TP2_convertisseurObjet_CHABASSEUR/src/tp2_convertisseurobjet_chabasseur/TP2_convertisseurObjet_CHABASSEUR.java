/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chabasseur;

import java.util.Scanner;

/**
 *
 * @author solal
 */
public class TP2_convertisseurObjet_CHABASSEUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Convertisseur Conv1 = new Convertisseur();
        Conv1.CelciusVersFarenheit(Conv1.KelvinVersCelcius(134));
        Conv1.FarenheitVersKelvin(30);
        Conv1.KelvinVersCelcius(Conv1.FarenheitVersKelvin(322));
        Conv1.CelciusVersKelvin(99);
        
        Convertisseur Conv2 = new Convertisseur();
        Conv2.KelvinVersCelcius(22);
        Conv2.CelciusVersFarenheit(Conv2.KelvinVersCelcius(300));
        Conv2.KelvinVersCelcius(67);
        
        // création du menu
        Scanner sc = new Scanner(System.in);
        Convertisseur troisiemesConversions = new Convertisseur();
        System.out.println("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();
             
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
       
        int convUtilisateur = sc.nextInt();
        double answer;
       
        if (convUtilisateur == 1) {
            answer = troisiemesConversions.CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
        }
       
        if (convUtilisateur == 2) {
            answer = troisiemesConversions.KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
        }
       
        if (convUtilisateur == 3) {
            answer = troisiemesConversions.FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
        }
       
        if (convUtilisateur == 4) {
            answer = troisiemesConversions.CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
        }
       
        if (convUtilisateur == 5) {
            answer = troisiemesConversions.KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
        }
       
        if (convUtilisateur == 6) {
            answer = troisiemesConversions.FarenheitVersKelvin(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");
        }
    }  
}
