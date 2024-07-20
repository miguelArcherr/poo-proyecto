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
public class tablero extends javax.swing.JFrame {

    /**
     * Creates new form tablero
     */
    int dado1 = (int) (Math.random() * 6) + 1;
    int dado2 = (int) (Math.random() * 6) + 1;
    int k = 0;
    int L = 0;
    int esca= 0;
    int esca2=0;
    int serp =0;
    int serp2=0;
    int desb=0;
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
    ImageIcon personaje2;
    numero_imagen modelo; 
    int num1;
    int num2;

    private tablero() {
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

    public void parabt1() {
        switch(num1){
            case 1 ->{ personaje1 = arch;}
            case 2 ->{personaje1=sab;}
            case 3 ->{ personaje1=sabr;}
        } 
        if (k != L) {
            {
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
                    }
                    case 4 -> {
                        if (k == 4) {
                            cases();
                            cas4.setIcon(personaje1);
                            if (k==4){esca= esca+1;}
                            k = k + 6;
                            JOptionPane.showMessageDialog(null, "avanzas 6 espacios");
                            cases();
                            cas10.setIcon(personaje1);
                        }
                    }
                    case 5 -> {
                        if (k == 5) {
                            cases();
                            cas5.setIcon(personaje1);
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
                            if (k==7){serp=serp+1;}
                            k = k - 2;
                            JOptionPane.showMessageDialog(null, "retrocedes 2 espacios");
                            cases();
                            cas5.setIcon(personaje1);
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
                            if (k==11){serp=serp+1;}
                            k = k - 8;
                            JOptionPane.showMessageDialog(null, "retrocedes 8 espacios");
                            cases();
                            cas3.setIcon(personaje1);

                        }
                    }
                    case 12 -> {
                        if (k == 12) {
                            cases();
                            cas12.setIcon(personaje1);
                            if (k==12){esca= esca+1;}
                            k = k + 2;
                            JOptionPane.showMessageDialog(null, "avanzas 2 espacios");
                            cases();
                            cas14.setIcon(personaje1);

                        }
                    }
                    case 13 -> {
                        if (k == 13) {
                            cases();
                            cas13.setIcon(personaje1);
                            if (k==13){esca= esca+1;}
                            k = k + 10;
                            JOptionPane.showMessageDialog(null, "avanzas 10 espacios");
                            cases();
                            cas23.setIcon(personaje1);
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
                            if (k==15){serp=serp+1;}
                            k = k - 6;
                            JOptionPane.showMessageDialog(null, "retrocedes 6 espacios");
                            cases();
                            cas9.setIcon(personaje1);

                        }
                    }
                    case 16 -> {
                        if (k == 16) {
                            cases();
                            cas16.setIcon(personaje1);
                            if (k==16){esca= esca+1;}
                            k = k + 6;
                            JOptionPane.showMessageDialog(null, "avanzas 6 espacios");
                            cases();
                            cas22.setIcon(personaje1);

                        }
                    }
                    case 17 -> {
                        if (k == 17) {
                            cases();
                            cas17.setIcon(personaje1);

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
                            k = k - 1;
                            JOptionPane.showMessageDialog(null, "retrocedes 1 espacios");
                            cases();
                            cas18.setIcon(personaje1);

                        }
                    }

                    case 20 -> {
                        if (k == 20) {
                            cases();
                            cas20.setIcon(personaje1);
                            if (k==20){esca= esca+1;}
                            k = k + 10;
                            JOptionPane.showMessageDialog(null, "avanzas 10 espacios");
                            cases();
                            cas30.setIcon(personaje1);

                            JOptionPane.showMessageDialog(null, "felicidades usted ha ganado ");
                            resett2 rt2 = new resett2();
                            rt2.setVisible(true);
                            dispose();

                        }
                    }
                    case 21 -> {
                        if (k == 21) {
                            cases();
                            cas21.setIcon(personaje1);

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
                            if (k==26){serp=serp+1;}
                            k = k - 2;
                            JOptionPane.showMessageDialog(null, "retrocedes 2 espacios");
                            cases();
                            cas24.setIcon(personaje1);

                        }
                    }
                    case 27 -> {
                        if (k == 27) {
                            cases();
                            cas27.setIcon(personaje1);
                            if (k==27){serp=serp+1;}
                            k = k - 6;
                            JOptionPane.showMessageDialog(null, "retrocedes 6 espacios");
                            cases();
                            cas21.setIcon(personaje1);

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

                            k = k - 8;
                            JOptionPane.showMessageDialog(null, "retrocedes 8 espacios");
                            cases();
                            cas21.setIcon(personaje1);

                        }
                    }
                    case 30 -> {
                        if (k == 30) {
                            cases();
                            cas30.setIcon(personaje1);

                            JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");
                            resett2 rt2 = new resett2();
                            rt2.setVisible(true);
                            dispose();
                        }
                    }
                    default -> {
                        if (k > 30) {
                            cas30.setIcon(personaje1);
                            cases();
                            JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");

                            resett2 rt2 = new resett2();
                            rt2.setVisible(true);
                            dispose();
                        }
                    }
                }
            }
        }
    }

    public void parabt2() {
        switch(num2){
            case 1 ->{ personaje2 = arch;}
            case 2 ->{personaje2=sab;}
            case 3 ->{ personaje2=sabr;}
        } 
        if (L != k) {

            switch (L) {
                case 1 -> {
                    if (L == 1) {
                        cases();
                        cas1.setIcon(personaje2);
                    }
                }

                case 2 -> {
                    if (L == 2) {
                        cases();
                        cas2.setIcon(personaje2);
                    }
                }
                case 3 -> {
                    if (L == 3) {
                        cases();
                        cas3.setIcon(personaje2);

                    }
                }
                case 4 -> {
                    if (L == 4) {
                        cases();

                        L = L + 6;
                        JOptionPane.showMessageDialog(null, "avanzas 6 espacios");
                        cases();
                        cas10.setIcon(personaje2);

                    }
                }
                case 5 -> {
                    if (L == 5) {
                        cases();
                        cas5.setIcon(personaje2);

                    }
                }
                case 6 -> {
                    if (L == 6) {
                        cases();
                        cas6.setIcon(personaje2);

                    }
                }

                case 7 -> {
                    if (L == 7) {
                        cases();
                        cas7.setIcon(personaje2);

                        L = L - 2;
                        JOptionPane.showMessageDialog(null, "retrocedes 2 espacios");
                        cases();
                        cas5.setIcon(personaje2);

                    }
                }

                case 8 -> {
                    if (L == 8) {
                        cases();
                        cas8.setIcon(personaje2);

                    }
                }
                case 9 -> {
                    if (L == 9) {
                        cases();
                        cas9.setIcon(personaje2);

                    }
                }
                case 10 -> {
                    if (L == 10) {
                        cases();
                        cas10.setIcon(personaje2);

                    }
                }
                case 11 -> {
                    if (L == 11) {
                        cases();
                        cas11.setIcon(personaje2);
                        if (L==11){serp2=serp2+1;}
                        L = L - 8;
                        JOptionPane.showMessageDialog(null, "retrocedes 8 espacios");
                        cases();
                        cas3.setIcon(personaje2);
                    }
                }
                case 12 -> {
                    if (L == 12) {
                        cases();
                        cas12.setIcon(personaje2);

                        L = L + 2;
                        JOptionPane.showMessageDialog(null, "avanzas 2 espacios");
                        cases();
                        cas14.setIcon(personaje2);

                    }
                }
                case 13 -> {
                    if (L == 13) {
                        cases();
                        cas13.setIcon(personaje2);

                        L = L + 10;
                        JOptionPane.showMessageDialog(null, "avanzas 10 espacios");
                        cases();
                        cas23.setIcon(personaje2);

                    }
                }

                case 14 -> {
                    if (L == 14) {
                        cases();
                        cas14.setIcon(personaje2);
                    }
                }
                case 15 -> {
                    if (L == 15) {
                        cases();
                        cas15.setIcon(personaje2);
                        if (L==15){serp2=serp2+1;}
                        L = L - 6;
                        JOptionPane.showMessageDialog(null, "retrocedes 6 espacios");
                        cases();
                        cas9.setIcon(personaje2);

                    }
                }
                case 16 -> {
                    if (L == 16) {
                        cases();
                        cas16.setIcon(personaje2);

                        L = L + 6;
                        JOptionPane.showMessageDialog(null, "avanzas 6 espacios");
                        cases();
                        cas22.setIcon(personaje2);

                    }
                }
                case 17 -> {
                    if (L == 17) {
                        cases();
                        cas17.setIcon(personaje2);

                    }
                }
                case 18 -> {
                    if (L == 18) {
                        cases();
                        cas18.setIcon(personaje2);

                    }
                }
                case 19 -> {
                    if (L == 19) {
                        cases();
                        cas19.setIcon(personaje2);
                        if (L==19){serp2=serp2+1;}
                        L = L - 1;
                        JOptionPane.showMessageDialog(null, "retrocedes 1 espacios");
                        cases();
                        cas18.setIcon(personaje2);

                    }
                }

                case 20 -> {
                    if (L == 20) {
                        cases();
                        cas20.setIcon(personaje2);

                        L = L + 10;
                        JOptionPane.showMessageDialog(null, "avanzas 10 espacios");
                        cases();
                        cas30.setIcon(personaje2);

                        JOptionPane.showMessageDialog(null, "felicidades usted ha ganado ");
                        resett2 rt2 = new resett2();
                        rt2.setVisible(true);
                        dispose();

                    }
                }
                case 21 -> {
                    if (L == 21) {
                        cases();
                        cas21.setIcon(personaje2);

                    }
                }
                case 22 -> {
                    if (L == 22) {
                        cases();
                        cas22.setIcon(personaje2);

                    }
                }
                case 23 -> {
                    if (L == 23) {
                        cases();
                        cas23.setIcon(personaje2);

                    }
                }
                case 24 -> {
                    if (L == 24) {
                        cases();
                        cas24.setIcon(personaje2);

                    }
                }
                case 25 -> {
                    if (L == 25) {
                        cases();
                        cas25.setIcon(personaje2);

                    }
                }

                case 26 -> {
                    if (L == 26) {
                        cases();
                        cas26.setIcon(personaje2);
                    if (L==26){serp2=serp2+1;}
                        L = L - 2;
                        JOptionPane.showMessageDialog(null, "retrocedes 2 espacios");
                        cases();
                        cas24.setIcon(personaje2);

                    }
                }
                case 27 -> {
                    if (L == 27) {
                        cases();
                        cas27.setIcon(personaje2);
                        if (L==27){serp2=serp2+1;}
                        L = L - 6;
                        JOptionPane.showMessageDialog(null, "retrocedes 6 espacios");
                        cases();
                        cas21.setIcon(personaje2);
                        cases();
                    }
                }
                case 28 -> {
                    if (L == 28) {
                        cases();
                        cas28.setIcon(personaje2);

                    }
                }
                case 29 -> {
                    if (L == 29) {
                        cases();
                        cas29.setIcon(personaje2);

                        L = L - 8;
                        JOptionPane.showMessageDialog(null, "retrocedes 8 espacios");
                        cases();
                        cas21.setIcon(personaje2);

                    }
                }
                case 30 -> {
                    if (L == 30) {
                        cases();
                        cas30.setIcon(personaje2);

                        JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");
                        resett2 rt2 = new resett2();
                        rt2.setVisible(true);
                        dispose();

                    }
                }
                default -> {
                    if (L > 30) {
                        cases();
                        cas30.setIcon(personaje2);

                        JOptionPane.showMessageDialog(null, "felicidades usted ha ganado");

                        resett2 rt2 = new resett2();
                        rt2.setVisible(true);
                        dispose();

                    }
                }
            }
        }

    }

    public void pieza2bt1() {
        switch (L) {
            case 1 -> {
                if (L == 1) {
                    cas1.setIcon(personaje2);
                }
            }

            case 2 -> {
                if (L == 2) {
                    cas2.setIcon(personaje2);
                }
            }
            case 3 -> {
                if (L == 3) {
                    cas3.setIcon(personaje2);

                }
            }

            case 5 -> {
                if (L == 5) {
                    cas5.setIcon(personaje2);

                }
            }
            case 6 -> {
                if (L == 6) {
                    cas6.setIcon(personaje2);

                }
            }
            case 8 -> {
                if (L == 8) {
                    cas8.setIcon(personaje2);

                }
            }
            case 9 -> {
                if (L == 9) {
                    cas9.setIcon(personaje2);

                }
            }
            case 10 -> {
                if (L == 10) {
                    cas10.setIcon(personaje2);

                }
            }

            case 14 -> {
                if (L == 14) {
                    cases();
                    cas14.setIcon(personaje2);

                }
            }

            case 17 -> {
                if (L == 17) {
                    cas17.setIcon(personaje2);

                }
            }
            case 18 -> {
                if (L == 18) {
                    cas18.setIcon(personaje2);

                }
            }

            case 21 -> {
                if (L == 21) {
                    cas21.setIcon(personaje2);

                }
            }
            case 22 -> {
                if (L == 22) {
                    cas22.setIcon(personaje2);

                }
            }
            case 23 -> {
                if (L == 23) {
                    cas23.setIcon(personaje2);

                }
            }
            case 24 -> {
                if (L == 24) {
                    cas24.setIcon(personaje2);

                }
            }
            case 25 -> {
                if (L == 25) {
                    cas25.setIcon(personaje2);

                }
            }

            case 28 -> {
                if (L == 28) {
                    cas28.setIcon(personaje2);

                }
            }

        }
    }

    public void pieza1bt2() {
        switch (k) {
            case 1 -> {
                if (k == 1) {
                    cas1.setIcon(personaje1);
                }
            }

            case 2 -> {
                if (k == 2) {
                    cas2.setIcon(personaje1);
                }
            }
            case 3 -> {
                if (k == 3) {
                    cas3.setIcon(personaje1);
                }
            }

            case 5 -> {
                if (k == 5) {
                    cas5.setIcon(personaje1);
                }
            }
            case 6 -> {
                if (k == 6) {
                    cas6.setIcon(personaje1);
                }
            }
            case 8 -> {
                if (k == 8) {
                    cas8.setIcon(personaje1);

                }
            }
            case 9 -> {
                if (k == 9) {
                    cas9.setIcon(personaje1);
                }
            }
            case 10 -> {
                if (k == 10) {
                    cas10.setIcon(personaje1);
                }
            }

            case 14 -> {
                if (k == 14) {
                    cas14.setIcon(personaje1);

                }
            }

            case 17 -> {
                if (k == 17) {
                    cas17.setIcon(personaje1);

                }
            }
            case 18 -> {
                if (k == 18) {
                    cas18.setIcon(personaje1);

                }
            }

            case 21 -> {
                if (k == 21) {
                    cas21.setIcon(personaje1);

                }
            }
            case 22 -> {
                if (k == 22) {
                    cas22.setIcon(personaje1);

                }
            }
            case 23 -> {
                if (k == 23) {
                    cas23.setIcon(personaje1);
                }
            }
            case 24 -> {
                if (k == 24) {
                    cas24.setIcon(personaje1);

                }
            }
            case 25 -> {
                if (k == 25) {
                    cas25.setIcon(personaje1);

                }
            }

            case 28 -> {
                if (k == 28) {
                    cas28.setIcon(personaje1);

                }
            }

            case 30 -> {
                if (k == 30) {
                    cas30.setIcon(personaje1);
                }
            }
            default -> {
                if (k > 30) {
                    cas30.setIcon(personaje1);
                }
            }
        }
    }
    
    
    
    public tablero(numero_imagen modelo) {
        this.modelo = modelo;
          num2 = modelo.getNum2();
         num1 = modelo.getNum1();
        initComponents();
        
        tablerofond.setIcon(new ImageIcon("src/main/java/fondo/escalerasyserpientes.png"));
        botonesfond.setIcon(new ImageIcon("src/main/java/fondo/fondo-tiradas.png"));
        setLocationRelativeTo(null);

        bttirar.setVisible(true);
        bttirar2.setVisible(false);

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
        cas29 = new javax.swing.JLabel();
        cas30 = new javax.swing.JLabel();
        cas28 = new javax.swing.JLabel();
        cas27 = new javax.swing.JLabel();
        cas26 = new javax.swing.JLabel();
        cas25 = new javax.swing.JLabel();
        cas2 = new javax.swing.JLabel();
        cas3 = new javax.swing.JLabel();
        cas4 = new javax.swing.JLabel();
        cas5 = new javax.swing.JLabel();
        cas6 = new javax.swing.JLabel();
        cas12 = new javax.swing.JLabel();
        cas11 = new javax.swing.JLabel();
        cas10 = new javax.swing.JLabel();
        cas9 = new javax.swing.JLabel();
        cas8 = new javax.swing.JLabel();
        cas7 = new javax.swing.JLabel();
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
        tablerofond = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bttirar = new javax.swing.JButton();
        bttirar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        dadop1 = new javax.swing.JLabel();
        dadop2 = new javax.swing.JLabel();
        botonesfond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 120));
        jPanel1.add(cas29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 120));
        jPanel1.add(cas30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 100, 120));
        jPanel1.add(cas28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 120));
        jPanel1.add(cas27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 120));
        jPanel1.add(cas26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 120));
        jPanel1.add(cas25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 120));
        jPanel1.add(cas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 90, 120));
        jPanel1.add(cas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 90, 120));
        jPanel1.add(cas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 90, 120));
        jPanel1.add(cas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 90, 120));
        jPanel1.add(cas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 90, 120));
        jPanel1.add(cas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 90, 120));
        jPanel1.add(cas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, 120));
        jPanel1.add(cas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 90, 120));
        jPanel1.add(cas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, 120));
        jPanel1.add(cas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 120));
        jPanel1.add(cas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 90, 120));
        jPanel1.add(cas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 120));
        jPanel1.add(cas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 120));
        jPanel1.add(cas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 120));
        jPanel1.add(cas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 90, 120));
        jPanel1.add(cas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 90, 120));
        jPanel1.add(cas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 90, 120));
        jPanel1.add(cas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 90, 120));
        jPanel1.add(cas20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, 120));
        jPanel1.add(cas21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, 120));
        jPanel1.add(cas22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, 120));
        jPanel1.add(cas23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 90, 120));
        jPanel1.add(cas24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 120));
        jPanel1.add(tablerofond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 640));

        bttirar.setText("Tirar");
        bttirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttirarActionPerformed(evt);
            }
        });

        bttirar2.setText("Tirar");
        bttirar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttirar2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("jugador 1");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("jugador 2 ");

        reset.setText("resetear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        regresar.setText("regresar al menu");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        dadop1.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        dadop1.setForeground(new java.awt.Color(0, 255, 255));
        dadop1.setText("     0");
        dadop1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dadop2.setBackground(new java.awt.Color(255, 255, 255));
        dadop2.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        dadop2.setForeground(new java.awt.Color(255, 255, 0));
        dadop2.setText("     0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(regresar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(bttirar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(dadop1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(bttirar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(dadop2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(reset)
                            .addGap(15, 15, 15)
                            .addComponent(salir))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonesfond, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(regresar)
                .addContainerGap(596, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(bttirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(dadop1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2)
                            .addGap(9, 9, 9)
                            .addComponent(bttirar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(dadop2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonesfond, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttirarActionPerformed
        dado1 = (int) (Math.random() * 6) + 1;
        dadop1.setText("     ");
        switch (dado1) {
            case 1 ->dadop1.setIcon(c1);
            case 2 ->dadop1.setIcon(c2);
            case 3 ->dadop1.setIcon(c3);
            case 4 ->dadop1.setIcon(c4);
            case 5 ->dadop1.setIcon(c5);
            case 6 ->dadop1.setIcon(c6);
        }

        k = k + dado1;
        if (k == L) {
            L = 0;
        } else {
            parabt1();
            pieza2bt1();
        }
        if (k == L) {
            L = 0;
            JOptionPane.showMessageDialog(null, "has desbancado a jugador 2");
        desb= desb+1;
            parabt1();
        }

       bttirar.setVisible(false);
             bttirar2.setVisible(true);


    }//GEN-LAST:event_bttirarActionPerformed

    private void bttirar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttirar2ActionPerformed
        dado2 = (int) (Math.random() * 6) + 1;
          
        switch (dado2) {
            case 1 ->dadop2.setIcon(c1);
            case 2 ->dadop2.setIcon(c2);
            case 3 ->dadop2.setIcon(c3);
            case 4 ->dadop2.setIcon(c5);
            case 5 ->dadop2.setIcon(c5);
            case 6 ->dadop2.setIcon(c6);
            
        }
        L = L + dado2;
        if (L == k) {
            k = 0;
        } else {
            parabt2();
            pieza1bt2();
        }
        if (L == k) {
            k = 0;
            JOptionPane.showMessageDialog(null, "has desbancado a jugador 1");
            desb= desb+1;
            parabt2();
        }
            bttirar.setVisible(true);
             bttirar2.setVisible(false);
    }//GEN-LAST:event_bttirar2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        L = 0;
        k = 0;
        cases();
        dadop1.setIcon(new ImageIcon());
        dadop2.setIcon(new ImageIcon());
        dadop1.setText("     0");
        dadop2.setText("     0");
    }//GEN-LAST:event_resetActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(WIDTH);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:   menu men = new menu();
        menu men = new menu();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonesfond;
    private javax.swing.JButton bttirar;
    private javax.swing.JButton bttirar2;
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
    private javax.swing.JLabel dadop2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reset;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tablerofond;
    // End of variables declaration//GEN-END:variables
}
