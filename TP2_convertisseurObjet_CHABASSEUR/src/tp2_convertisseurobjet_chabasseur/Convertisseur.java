/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_chabasseur;

/**
 *
 * @author solal
 */
public class Convertisseur {
    int nbConversions ;
       
    public Convertisseur(){
        int nbConversions = 0;
        
    }
    
    public double CelciusVersKelvin (double temp) {
        nbConversions++;
        return temp+273.15;
}
    
    public double KelvinVersCelcius (double temp) {
        nbConversions++;
        return temp-273.15;
    }
    
    public double FarenheitVersCelcius (double temp){
        nbConversions++;
        return (temp-32)*5/9;
    }
    
    public double CelciusVersFarenheit (double temp){
        nbConversions++;
        return(temp*9/5)+32;
    }
    
    public double FarenheitVersKelvin (double temp){
        nbConversions++;
        return (temp-32)*5/9 +273.15;
    }
    
    public double KelvinVersFarenheit (double temp){
        nbConversions++;
        return (temp-273.15)*9/5 + 32;
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
}

}
