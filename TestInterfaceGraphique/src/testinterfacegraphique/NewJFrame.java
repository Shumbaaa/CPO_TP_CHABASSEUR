/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testinterfacegraphique;

/**
 *
 * @author solal
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        premierTexte = new javax.swing.JLabel();
        ouiButton = new javax.swing.JButton();
        oui2Button = new javax.swing.JButton();
        deuxiemeTexte = new javax.swing.JLabel();
        tauxAppreciation = new javax.swing.JSlider();
        troisiemeTexe = new javax.swing.JLabel();
        kenzoButton = new javax.swing.JButton();
        arthurButton = new javax.swing.JButton();
        quatriemeTexte = new javax.swing.JLabel();
        nonButton = new javax.swing.JButton();
        non2Button = new javax.swing.JButton();
        racisteButton = new javax.swing.JButton();
        titreTexte = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        premierTexte.setText("Léo-Paul Mousally est-il le plus bel humain sur cette planète?");

        ouiButton.setText("Oui");
        ouiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouiButtonActionPerformed(evt);
            }
        });

        oui2Button.setText("Oui ");

        deuxiemeTexte.setText("Ton taux d'appréciation de Léo Paul et un petit commentaire:");

        troisiemeTexe.setText("Plutot team Kenzo ou team Arthur?");

        kenzoButton.setText("Big Kenzoo 😈 ");
        kenzoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenzoButtonActionPerformed(evt);
            }
        });

        arthurButton.setText("Arthur en brrr 🤑");
        arthurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arthurButtonActionPerformed(evt);
            }
        });

        quatriemeTexte.setText("Nawfel est il arrivé légalement en France?");

        nonButton.setText("Non");

        non2Button.setText("Surement pas");

        racisteButton.setText("Je suis raciste");
        racisteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racisteButtonActionPerformed(evt);
            }
        });

        titreTexte.setText("Le test de l'amitié: Connais-tu bien tes amis?");

        jTextField1.setText("Ecrivez ici");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(troisiemeTexe, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(premierTexte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ouiButton)
                            .addGap(18, 18, 18)
                            .addComponent(oui2Button))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quatriemeTexte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(kenzoButton)
                                .addGap(18, 18, 18)
                                .addComponent(arthurButton)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(titreTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(deuxiemeTexte, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nonButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(non2Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(racisteButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tauxAppreciation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titreTexte)
                .addGap(18, 18, 18)
                .addComponent(premierTexte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ouiButton)
                    .addComponent(oui2Button))
                .addGap(18, 18, 18)
                .addComponent(deuxiemeTexte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tauxAppreciation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(troisiemeTexe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kenzoButton)
                    .addComponent(arthurButton))
                .addGap(18, 18, 18)
                .addComponent(quatriemeTexte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonButton)
                    .addComponent(non2Button)
                    .addComponent(racisteButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ouiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ouiButtonActionPerformed

    private void arthurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arthurButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arthurButtonActionPerformed

    private void kenzoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenzoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kenzoButtonActionPerformed

    private void racisteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racisteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_racisteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arthurButton;
    private javax.swing.JLabel deuxiemeTexte;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kenzoButton;
    private javax.swing.JButton non2Button;
    private javax.swing.JButton nonButton;
    private javax.swing.JButton oui2Button;
    private javax.swing.JButton ouiButton;
    private javax.swing.JLabel premierTexte;
    private javax.swing.JLabel quatriemeTexte;
    private javax.swing.JButton racisteButton;
    private javax.swing.JSlider tauxAppreciation;
    private javax.swing.JLabel titreTexte;
    private javax.swing.JLabel troisiemeTexe;
    // End of variables declaration//GEN-END:variables
}
