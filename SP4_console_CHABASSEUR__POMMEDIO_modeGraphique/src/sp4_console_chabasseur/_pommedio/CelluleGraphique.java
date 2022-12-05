/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_chabasseur._pommedio;

import javax.swing.JButton;

/**
 *
 * @author solal
 */
public class CelluleGraphique extends JButton {
    CelluleDeGrille celluleAssociee;
    
    public CelluleGraphique(CelluleDeGrille uneCellule){
        celluleAssociee=uneCellule;
    }
}
