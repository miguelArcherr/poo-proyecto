/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento11;

//import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author miguel
 */
public class elegir_personaje2tab2 extends javax.swing.JFrame {

   int ficha1=1;
   int ficha2=2;
   int ficha3=3;
   
   int n1;
   int n2;
    
    /**
     * Creates new form elegir_personaje2
     */
    public elegir_personaje2tab2() {
        
        initComponents();
        
        p1.setIcon(new ImageIcon("src/main/java/fondo/archrerm.png"));
        p2.setIcon(new ImageIcon("src/main/java/fondo/saber3.png"));
        p3.setIcon(new ImageIcon("src/main/java/fondo/saberrojam.png"));
        fondo.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        j1p2.setVisible(false);
        j2p2.setVisible(false);
        j3p2.setVisible(false);
        jfond.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        jugador.setText(String.valueOf("    jugador 1"));
        setLocationRelativeTo(null);
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        j1p1 = new javax.swing.JButton();
        j2p1 = new javax.swing.JButton();
        j3p1 = new javax.swing.JButton();
        j1p2 = new javax.swing.JButton();
        j2p2 = new javax.swing.JButton();
        j3p2 = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        select1 = new javax.swing.JLabel();
        select2 = new javax.swing.JLabel();
        select3 = new javax.swing.JLabel();
        font = new javax.swing.JLabel();
        font2 = new javax.swing.JLabel();
        font3 = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();
        jfond = new javax.swing.JLabel();
        prueva = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j1p1.setText("archer");
        j1p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1p1ActionPerformed(evt);
            }
        });
        jPanel1.add(j1p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, -1));

        j2p1.setText("saber");
        j2p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2p1ActionPerformed(evt);
            }
        });
        jPanel1.add(j2p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        j3p1.setText("mordred");
        j3p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3p1ActionPerformed(evt);
            }
        });
        jPanel1.add(j3p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        j1p2.setText("archer");
        j1p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1p2ActionPerformed(evt);
            }
        });
        jPanel1.add(j1p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, -1));

        j2p2.setText("saber");
        j2p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2p2ActionPerformed(evt);
            }
        });
        jPanel1.add(j2p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 70, -1));

        j3p2.setText("mordred");
        j3p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3p2ActionPerformed(evt);
            }
        });
        jPanel1.add(j3p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 90, 120));
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 90, 120));
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, 120));
        p3.getAccessibleContext().setAccessibleName("p3");

        select1.setFont(new java.awt.Font("Old English Text MT", 1, 20)); // NOI18N
        select1.setForeground(new java.awt.Color(0, 255, 51));
        select1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select1.setText(" ");
        jPanel1.add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 20));

        select2.setFont(new java.awt.Font("Old English Text MT", 1, 20)); // NOI18N
        select2.setForeground(new java.awt.Color(0, 255, 51));
        select2.setText(" ");
        jPanel1.add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, 20));

        select3.setFont(new java.awt.Font("Old English Text MT", 1, 20)); // NOI18N
        select3.setForeground(new java.awt.Color(0, 255, 51));
        select3.setText(" ");
        jPanel1.add(select3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 20));
        jPanel1.add(font, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 20));
        jPanel1.add(font2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, 20));
        jPanel1.add(font3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 20));

        jugador.setFont(new java.awt.Font("Old English Text MT", 1, 20)); // NOI18N
        jugador.setForeground(new java.awt.Color(0, 255, 51));
        jPanel1.add(jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 20));
        jPanel1.add(jfond, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 20));
        jfond.getAccessibleContext().setAccessibleName("jfond");

        jPanel1.add(prueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 120));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1p1ActionPerformed
        j1p1.setVisible(false);
        j2p1.setVisible(false);
        j3p1.setVisible(false);
        font.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        select1.setText(String.valueOf("seleccionado"));
        j1p2.setVisible(false);
        j2p2.setVisible(true);
        j3p2.setVisible(true);
        jugador.setText(String.valueOf("    jugador 2"));
        n1=ficha1;

    }//GEN-LAST:event_j1p1ActionPerformed

    private void j2p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2p1ActionPerformed
       j1p1.setVisible(false);
       j2p1.setVisible(false);
       j3p1.setVisible(false);
       select2.setText(String.valueOf("seleccionado"));
       font2.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
       j1p2.setVisible(true);
        j2p2.setVisible(false);
        j3p2.setVisible(true);
        jugador.setText(String.valueOf("    jugador 2"));
        n1=ficha2;
    }//GEN-LAST:event_j2p1ActionPerformed

    private void j3p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3p1ActionPerformed
       j1p1.setVisible(false);
       j2p1.setVisible(false);
       j3p1.setVisible(false);
       select3.setText(String.valueOf("seleccionado"));
       font3.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
       j1p2.setVisible(true);
        j2p2.setVisible(true);
        j3p2.setVisible(false);
        jugador.setText(String.valueOf("    jugador 2"));
        n1=ficha3;
    }//GEN-LAST:event_j3p1ActionPerformed

    private void j1p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1p2ActionPerformed
        select1.setText(String.valueOf("seleccionado"));
        font.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        j1p2.setVisible(false);
        j2p2.setVisible(false);
        j3p2.setVisible(false);
        
        n2=ficha1;
        numero_imagen modelo = new numero_imagen();
        modelo.setNum1(n1);
        modelo.setNum2(n2);
        
        tablero2 T22 = new tablero2(modelo);
        T22.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_j1p2ActionPerformed

    private void j2p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2p2ActionPerformed
        select2.setText(String.valueOf("seleccionado"));
        font2.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        j1p2.setVisible(false);
        j2p2.setVisible(false);
        j3p2.setVisible(false);
        n2=ficha2;
        numero_imagen modelo = new numero_imagen();
        modelo.setNum1(n1);
        modelo.setNum2(n2);
        
        tablero2 T22 = new tablero2(modelo);
        T22.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_j2p2ActionPerformed

    private void j3p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3p2ActionPerformed
        select3.setText(String.valueOf("seleccionado"));
        font3.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        j1p2.setVisible(false);
        j2p2.setVisible(false);
        j3p2.setVisible(false);
        n2=ficha3;
        numero_imagen modelo = new numero_imagen();
        modelo.setNum1(n1);
        modelo.setNum2(n2);
        
        tablero2 T22 = new tablero2(modelo);
        T22.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_j3p2ActionPerformed

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
            java.util.logging.Logger.getLogger(elegir_personaje2tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elegir_personaje2tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elegir_personaje2tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elegir_personaje2tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elegir_personaje2tab2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel font;
    private javax.swing.JLabel font2;
    private javax.swing.JLabel font3;
    private javax.swing.JButton j1p1;
    private javax.swing.JButton j1p2;
    private javax.swing.JButton j2p1;
    private javax.swing.JButton j2p2;
    private javax.swing.JButton j3p1;
    private javax.swing.JButton j3p2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jfond;
    private javax.swing.JLabel jugador;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel prueva;
    private javax.swing.JLabel select1;
    private javax.swing.JLabel select2;
    private javax.swing.JLabel select3;
    // End of variables declaration//GEN-END:variables
}
