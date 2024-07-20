/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento11;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author miguel
 */
public class tablero2_1 extends javax.swing.JFrame {

   int dado1 = (int)(Math.random()*6)+1;
    int k=0;
     ImageIcon arch = new ImageIcon("src/main/java/fondo/archrerm.png");
    ImageIcon sab = new ImageIcon("src/main/java/fondo/saber3.png");
    ImageIcon sabr = new ImageIcon("src/main/java/fondo/saberrojam.png");
    ImageIcon c1 = new ImageIcon("src/main/java/fondo/cara1.png");
    ImageIcon c2 = new ImageIcon("src/main/java/fondo/cara2.png");
    ImageIcon c3 = new ImageIcon("src/main/java/fondo/cara3.png");
    ImageIcon c4 = new ImageIcon("src/main/java/fondo/cara4.png");
    ImageIcon c5 = new ImageIcon("src/main/java/fondo/cara5.png");
    ImageIcon c6 = new ImageIcon("src/main/java/fondo/cara6.png");
    
    ImageIcon personaje1;
    numero_imagen1 modelo1; 
    int num1;
    int esca= 0;
    int serp =0;
   
    private tablero2_1(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void cases() {
        cas1.setIcon(new ImageIcon());
        cas2.setIcon(new ImageIcon());
        cas3.setIcon(new ImageIcon());
        cas4.setIcon(new ImageIcon());
        cas5.setIcon(new ImageIcon());
        cas6.setIcon(new ImageIcon());
        cas7.setIcon(new ImageIcon());
        cas8.setIcon(new ImageIcon());
        cas9.setIcon(new ImageIcon());
        cas10.setIcon(new ImageIcon());
        cas11.setIcon(new ImageIcon());
        cas12.setIcon(new ImageIcon());
        cas13.setIcon(new ImageIcon());
        cas14.setIcon(new ImageIcon());
        cas15.setIcon(new ImageIcon());
        cas16.setIcon(new ImageIcon());
        cas17.setIcon(new ImageIcon());
        cas18.setIcon(new ImageIcon());
        cas19.setIcon(new ImageIcon());
        cas20.setIcon(new ImageIcon());
        cas21.setIcon(new ImageIcon());
        cas22.setIcon(new ImageIcon());
        cas23.setIcon(new ImageIcon());
        cas24.setIcon(new ImageIcon());
        cas25.setIcon(new ImageIcon());
        cas26.setIcon(new ImageIcon());
        cas27.setIcon(new ImageIcon());
        cas28.setIcon(new ImageIcon());
        cas29.setIcon(new ImageIcon());
        cas30.setIcon(new ImageIcon());
    }
    
     public void parabt1(){
         switch(num1){
            case 1 ->{ personaje1 = arch;}
            case 2 ->{personaje1=sab;}
            case 3 ->{ personaje1=sabr;}
        } 
         switch (k) {
                    case 1 -> {
                        if (k == 1) {
                            cas1.setIcon(personaje1);
                        }
                    }

                    case 2 -> {
                        if (k == 2) {
                            cases();
                            cas2.setIcon(personaje1);}
                    }
                    case 3 -> {
                        if (k == 3) {
                            cases();
                            cas3.setIcon(personaje1);}
                        if (k==3){esca= esca+1;}
      
                         k = k + 19;
                            JOptionPane.showMessageDialog(null, "avanzas 19 espacios");
                            cases();
                            cas22.setIcon(personaje1);
                    }
                    case 4 -> {
                        if (k == 4) {
                            cases();
                            cas4.setIcon(personaje1);

                            
                        }
                    }
                    case 5 -> {
                        if (k == 5) {
                            cases();
                            cas5.setIcon(personaje1);
                            if (k==5){esca= esca+1;}
                            k = k + 3;
                            JOptionPane.showMessageDialog(null, "avanzas 3 espacios");
                            cases();
                            cas8.setIcon(personaje1);
                        }
                    }
                    case 6 -> {
                        if (k == 6) {
                            cases();
                            cas6.setIcon(personaje1);
                        }
                    }

                    case 7 -> {
                        if (k == 7) {
                            cases();
                            cas7.setIcon(personaje1);
                        }
                    }

                    case 8 -> {
                        if (k == 8) {
                            cases();
                            cas8.setIcon(personaje1);

                        }
                    }
                    case 9 -> {
                        if (k == 9) {
                            cases();
                            cas9.setIcon(personaje1);
                        }
                    }
                    case 10 -> {
                        if (k == 10) {
                            cases();
                            cas10.setIcon(personaje1);
                        }
                    }
                    case 11 -> {
                        if (k == 11) {
                            cases();
                            cas11.setIcon(personaje1);
                            
                        if (k==11){esca= esca+1;}
     

                            k = k + 15;
                            JOptionPane.showMessageDialog(null, "avanzas 15 espacios");
                            cases();
                            cas22.setIcon(personaje1);

                        }
                    }
                    case 12 -> {
                        if (k == 12) {
                            cases();
                            cas12.setIcon(personaje1);
                            
                        }
                    }
                    case 13 -> {
                        if (k == 13) {
                            cases();
                            cas13.setIcon(personaje1);

                        }
                    }

                    case 14 -> {
                        if (k == 14) {
                            cases();
                            cas14.setIcon(personaje1);

                        }
                    }
                    case 15 -> {
                        if (k == 15) {
                            cases();
                            cas15.setIcon(personaje1);


                        }
                    }
                    case 16 -> {
                        if (k == 16) {
                            cases();
                            cas16.setIcon(personaje1);


                        }
                    }
                    case 17 -> {
                        if (k == 17) {
                            cases();
                            cas17.setIcon(personaje1);
                            if (k==17){serp=serp+1;}
                            
                            k = k - 13;
                            JOptionPane.showMessageDialog(null, "retrocedes 13 espacios");
                            cases();
                            cas4.setIcon(personaje1);

                        }
                    }
                    case 18 -> {
                        if (k == 18) {
                            cases();
                            cas18.setIcon(personaje1);

                        }
                    }
                    case 19 -> {
                        if (k == 19) {
                            cases();
                            cas19.setIcon(personaje1);
                         if (k==19){serp=serp+1;}
        

                            k = k - 12;
                            JOptionPane.showMessageDialog(null, "retrocedes 12 espacios");
                            cases();
                            cas7.setIcon(personaje1);

                        }
                    }

                    case 20 -> {
                        if (k == 20) {
                            cases();
                            cas20.setIcon(personaje1);
                         if (k==20){esca= esca+1;}

                            k = k + 9;
                            JOptionPane.showMessageDialog(null, "avanzas 19 espacios");
                            cases();
                            cas29.setIcon(personaje1);
                        }
                    }
                    case 21 -> {
                        if (k == 21) {
                            cases();
                            cas21.setIcon(personaje1);
                           if (k==21){serp=serp+1;}
       
                            k = k - 12;
                            JOptionPane.showMessageDialog(null, "retrocedes 12 espacios");
                            cases();
                            cas9.setIcon(personaje1);

                        }
                    }
                    case 22 -> {
                        if (k == 22) {
                            cases();
                            cas22.setIcon(personaje1);

                        }
                    }
                    case 23 -> {
                        if (k == 23) {
                            cases();
                            cas23.setIcon(personaje1);

                        }
                    }
                    case 24 -> {
                        if (k == 24) {
                            cases();
                            cas24.setIcon(personaje1);

                        }
                    }
                    case 25 -> {
                        if (k == 25) {
                            cases();
                            cas25.setIcon(personaje1);

                        }
                    }

                    case 26 -> {
                        if (k == 26) {
                            cases();
                            cas26.setIcon(personaje1);


                        }
                    }
                    case 27 -> {
                        if (k == 27) {
                            cases();
                            cas27.setIcon(personaje1);
                            if (k==27){serp=serp+1;}

                            k = k - 26;
                            JOptionPane.showMessageDialog(null, "retrocedes 26 espacios");
                            cases();
                            cas1.setIcon(personaje1);

                        }
                    }
                    case 28 -> {
                        if (k == 28) {
                            cases();
                            cas28.setIcon(personaje1);

                        }
                    }
                    case 29 -> {
                        if (k == 29) {
                            cases();
                            cas29.setIcon(personaje1);


                        }
                    }
                    case 30 -> {
                        if (k == 30) {
                            cases();
                            cas30.setIcon(personaje1);

                            JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");
                            resett21 rt21 = new resett21();
                            rt21.setVisible(true);
                            dispose();
                        }
                    }
                    default -> {
                        if (k > 30) {
                            cas30.setIcon(personaje1);
                            cases();
                            JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");

                            resett21 rt21 = new resett21();
                            rt21.setVisible(true);
                            dispose();
                        }
                    }
                }}
    

      public tablero2_1(numero_imagen1 modelo1) {
        this.modelo1 = modelo1;
       
         num1=modelo1.getNumb1();
        initComponents();
        
        botonesfond.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        tablerofond.setIcon(new ImageIcon("src/main/java/fondo/escalerasyserpientes2.png"));
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
        cas1 = new javax.swing.JLabel();
        cas2 = new javax.swing.JLabel();
        cas3 = new javax.swing.JLabel();
        cas4 = new javax.swing.JLabel();
        cas5 = new javax.swing.JLabel();
        cas6 = new javax.swing.JLabel();
        cas7 = new javax.swing.JLabel();
        cas8 = new javax.swing.JLabel();
        cas9 = new javax.swing.JLabel();
        cas10 = new javax.swing.JLabel();
        cas11 = new javax.swing.JLabel();
        cas12 = new javax.swing.JLabel();
        cas13 = new javax.swing.JLabel();
        cas14 = new javax.swing.JLabel();
        cas15 = new javax.swing.JLabel();
        cas16 = new javax.swing.JLabel();
        cas17 = new javax.swing.JLabel();
        cas18 = new javax.swing.JLabel();
        cas19 = new javax.swing.JLabel();
        cas20 = new javax.swing.JLabel();
        cas21 = new javax.swing.JLabel();
        cas22 = new javax.swing.JLabel();
        cas23 = new javax.swing.JLabel();
        cas24 = new javax.swing.JLabel();
        cas25 = new javax.swing.JLabel();
        cas26 = new javax.swing.JLabel();
        cas27 = new javax.swing.JLabel();
        cas28 = new javax.swing.JLabel();
        cas29 = new javax.swing.JLabel();
        cas30 = new javax.swing.JLabel();
        tablerofond = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        tirar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dadop1 = new javax.swing.JLabel();
        botonesfond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 100));
        jPanel1.add(cas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 90, 90));
        jPanel1.add(cas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 90, 90));
        jPanel1.add(cas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 90, 90));
        jPanel1.add(cas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 80, 90));
        jPanel1.add(cas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 90, 90));
        jPanel1.add(cas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 90, 100));
        jPanel1.add(cas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 90, 100));
        jPanel1.add(cas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 90, 90));
        jPanel1.add(cas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 90, 90));
        jPanel1.add(cas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, 90));
        jPanel1.add(cas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 90));
        jPanel1.add(cas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 90));
        jPanel1.add(cas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, 90));
        cas14.getAccessibleContext().setAccessibleName("cas14");

        jPanel1.add(cas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 90, 90));
        jPanel1.add(cas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 90, 90));
        jPanel1.add(cas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 90, 90));
        jPanel1.add(cas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 90, 90));
        jPanel1.add(cas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 90, 90));
        jPanel1.add(cas20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, 90));
        jPanel1.add(cas21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 90, 90));
        jPanel1.add(cas22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 90, 90));
        jPanel1.add(cas23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 90));
        jPanel1.add(cas24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 90));
        jPanel1.add(cas25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));
        jPanel1.add(cas26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 90));
        jPanel1.add(cas27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 90, 90));
        jPanel1.add(cas28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, 90));
        jPanel1.add(cas29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 90));
        jPanel1.add(cas30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 90, 90));
        jPanel1.add(tablerofond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 530));

        regresar.setText("regresar al menu");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, -1));

        reset.setText("resetear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        tirar1.setText("tirar");
        tirar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirar1ActionPerformed(evt);
            }
        });
        jPanel1.add(tirar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("jugador 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 140, 30));

        dadop1.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        dadop1.setForeground(new java.awt.Color(0, 255, 255));
        dadop1.setText("   0");
        jPanel1.add(dadop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 100, 100));

        botonesfond.setText("jLabel2");
        jPanel1.add(botonesfond, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 210, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tirar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirar1ActionPerformed
    {                                        
       dado1 = (int)(Math.random()*6)+1;
      
        
         
        switch(dado1){
            case 1 ->dadop1.setIcon(c1);
            case 2 ->dadop1.setIcon(c2);
            case 3 ->dadop1.setIcon(c3);
            case 4 ->dadop1.setIcon(c4);
            case 5 ->dadop1.setIcon(c5);
            case 6 ->dadop1.setIcon(c6);
        }
        k=k+dado1;
        parabt1();
        
        // TODO add your handling code here:
    }  
    }//GEN-LAST:event_tirar1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
      menu men = new menu();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         k = 0;
        cases();
        dadop1.setIcon(new ImageIcon());
        dadop1.setText("   0");
        
    }//GEN-LAST:event_resetActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(tablero2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonesfond;
    private javax.swing.JLabel cas1;
    private javax.swing.JLabel cas10;
    private javax.swing.JLabel cas11;
    private javax.swing.JLabel cas12;
    private javax.swing.JLabel cas13;
    private javax.swing.JLabel cas14;
    private javax.swing.JLabel cas15;
    private javax.swing.JLabel cas16;
    private javax.swing.JLabel cas17;
    private javax.swing.JLabel cas18;
    private javax.swing.JLabel cas19;
    private javax.swing.JLabel cas2;
    private javax.swing.JLabel cas20;
    private javax.swing.JLabel cas21;
    private javax.swing.JLabel cas22;
    private javax.swing.JLabel cas23;
    private javax.swing.JLabel cas24;
    private javax.swing.JLabel cas25;
    private javax.swing.JLabel cas26;
    private javax.swing.JLabel cas27;
    private javax.swing.JLabel cas28;
    private javax.swing.JLabel cas29;
    private javax.swing.JLabel cas3;
    private javax.swing.JLabel cas30;
    private javax.swing.JLabel cas4;
    private javax.swing.JLabel cas5;
    private javax.swing.JLabel cas6;
    private javax.swing.JLabel cas7;
    private javax.swing.JLabel cas8;
    private javax.swing.JLabel cas9;
    private javax.swing.JLabel dadop1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reset;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tablerofond;
    private javax.swing.JButton tirar1;
    // End of variables declaration//GEN-END:variables
}
