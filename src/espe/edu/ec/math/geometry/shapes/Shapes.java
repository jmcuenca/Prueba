/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.math.geometry.shapes;
import espe.edu.ec.math.Constants;
import static espe.edu.ec.math.Constants.CIRCUNFERENCES;

import static espe.edu.ec.math.Constants.QUADRILATERALS;
import static espe.edu.ec.math.Constants.TRIANGLES;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
/**
 *
 * @author CASA
 */
public class Shapes extends javax.swing.JFrame {
    
    /**
     * Creates new form Circle
     */
    public Shapes() {
        initComponents();
        String[] ini ={"Circunferences","Quadrilaterals","Triangles"};
        
        cboShapes.addItem("Circunferences");
        cboShapes.addItem("Quadrilaterals");
        cboShapes.addItem("Triangles");
        cboShapes.setSelectedIndex(0);


    }
    public void changeSubShapes(int x){
        cboSubShapes.removeAllItems();
       
        if(x==0){
            for(String s:CIRCUNFERENCES){
            cboSubShapes.addItem(s);
                        }
            
        }else if(x==1){
            for(String s:QUADRILATERALS){
            cboSubShapes.addItem(s);
                        }
            
        }
        else
    
    for(String s:TRIANGLES){
            cboSubShapes.addItem(s);
                        }
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cboShapes = new javax.swing.JComboBox();
        cboSubShapes = new javax.swing.JComboBox();
        btnCircunferences = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Shapes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 28, 54, 25);

        cboShapes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cboShapes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboShapesItemStateChanged(evt);
            }
        });
        cboShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboShapesActionPerformed(evt);
            }
        });
        getContentPane().add(cboShapes);
        cboShapes.setBounds(40, 80, 180, 26);

        cboSubShapes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cboSubShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubShapesActionPerformed(evt);
            }
        });
        getContentPane().add(cboSubShapes);
        cboSubShapes.setBounds(40, 120, 180, 26);

        btnCircunferences.setText("Calcular");
        getContentPane().add(btnCircunferences);
        btnCircunferences.setBounds(50, 180, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSubShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubShapesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSubShapesActionPerformed

    private void cboShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboShapesActionPerformed
changeSubShapes(cboShapes.getSelectedIndex());
        // TODO add your handling code here:
    }//GEN-LAST:event_cboShapesActionPerformed

    private void cboShapesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboShapesItemStateChanged
 changeSubShapes(cboShapes.getSelectedIndex());
        // TODO add your handling code here:
    }//GEN-LAST:event_cboShapesItemStateChanged

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
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shapes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCircunferences;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboShapes;
    private javax.swing.JComboBox cboSubShapes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
