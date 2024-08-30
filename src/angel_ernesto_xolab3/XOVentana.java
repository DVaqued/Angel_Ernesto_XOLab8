/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package angel_ernesto_xolab3;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class XOVentana extends javax.swing.JFrame {

    JLabel arrayXO[][] = new JLabel[3][3];
    boolean turno = true;
    String jugador1 = Inicio.devolverJugador1();
    String jugador2 = Inicio.devolverJugador2();
    String jugadorActual;
    int contador = 0;
    String ganador = "";

    /**
     * Creates new form XOVentana
     */
    public XOVentana() {
        initComponents();
        arrayXO[0][0] = c00;
        arrayXO[0][1] = c01;
        arrayXO[0][2] = c02;
        //-----
        arrayXO[1][0] = c10;
        arrayXO[1][1] = c11;
        arrayXO[1][2] = c12;
        //-----
        arrayXO[2][0] = c20;
        arrayXO[2][1] = c21;
        arrayXO[2][2] = c22;

    }

    public boolean verificacionGanador() {
        if (contador > 4) {
            if (arrayXO[0][0].getText().equals("x") && arrayXO[0][1].getText().equals("x") && arrayXO[0][2].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][0].getText().equals("o") && arrayXO[0][1].getText().equals("x") && arrayXO[0][2].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[0][0].getText().equals("x") && arrayXO[1][0].getText().equals("x") && arrayXO[2][0].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][0].getText().equals("o") && arrayXO[1][0].getText().equals("o") && arrayXO[2][0].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[0][1].getText().equals("x") && arrayXO[1][1].getText().equals("x") && arrayXO[2][1].getText().equals("o")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][1].getText().equals("o") && arrayXO[1][1].getText().equals("o") && arrayXO[2][1].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[0][2].getText().equals("x") && arrayXO[1][2].getText().equals("x") && arrayXO[2][2].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][2].getText().equals("o") && arrayXO[1][2].getText().equals("o") && arrayXO[2][2].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[1][0].getText().equals("x") && arrayXO[1][1].getText().equals("x") && arrayXO[1][2].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[1][0].getText().equals("o") && arrayXO[1][1].getText().equals("o") && arrayXO[1][2].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[2][0].getText().equals("x") && arrayXO[2][1].getText().equals("x") && arrayXO[2][2].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[2][0].getText().equals("o") && arrayXO[2][1].getText().equals("o") && arrayXO[2][2].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[0][0].getText().equals("x") && arrayXO[1][1].getText().equals("x") && arrayXO[2][2].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][0].getText().equals("o") && arrayXO[1][1].getText().equals("o") && arrayXO[2][2].getText().equals("o")) {
                ganador = "O";
                return true;
            } else if (arrayXO[0][2].getText().equals("x") && arrayXO[1][1].getText().equals("x") && arrayXO[2][0].getText().equals("x")) {
                ganador = "X";
                return true;
            } else if (arrayXO[0][2].getText().equals("o") && arrayXO[1][1].getText().equals("o") && arrayXO[2][0].getText().equals("o")) {
                ganador = "O";
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campofila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campocolumna = new javax.swing.JTextField();
        c00 = new javax.swing.JLabel();
        c01 = new javax.swing.JLabel();
        c02 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c20 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        ingresarOP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setText("XO da Dinero");

        jLabel2.setText(Inicio.devolverJugador1()+" vs "+Inicio.devolverJugador2());

        jLabel3.setText("Fila:");

        jLabel4.setText("Columna:");

        campocolumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocolumnaActionPerformed(evt);
            }
        });

        c00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ingresarOP.setText("Ingresar");
        ingresarOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarOPActionPerformed(evt);
            }
        });

        jLabel6.setText("0");

        jLabel7.setText("1");

        jLabel8.setText("2");

        jLabel9.setText("0");

        jLabel10.setText("1");

        jLabel11.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingresarOP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campofila)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(campocolumna))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(74, 74, 74))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(17, 17, 17)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campofila, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(campocolumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ingresarOP))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c22, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(c21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campocolumna, campofila});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campocolumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocolumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocolumnaActionPerformed

    private void ingresarOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarOPActionPerformed
        // TODO add your handling code here:
        String filatemp = campofila.getText();
        String columnatemp = campocolumna.getText();
        int fila = Integer.parseInt(filatemp);
        int columna = Integer.parseInt(columnatemp);
        if (fila < 0 || columna < 0 || fila >= 3 || columna >= 3) {
            JOptionPane.showMessageDialog(null, "No es valida esta posicion");
        } else {
            boolean verificar = validacion(fila, columna);
            if (verificar == true) {
                contador++;
                cambioturno();
                campofila.setText("");
                campocolumna.setText("");
                if (contador == 9) {
                    JOptionPane.showMessageDialog(null, "EMPATE");
                    this.dispose();
                }
                String nombre = (ganador.equals("X")) ? jugador1 : jugador2;
                if (verificacionGanador()) {
                    JOptionPane.showMessageDialog(null, "Gano " + nombre + "!", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_ingresarOPActionPerformed

    public boolean cambioturno() {
        if (turno == true) {
            turno = false;
        } else if (turno == false) {
            turno = true;
        }
        return true;
    }

    public String turno(String jugador) {
        if (turno == true) {
            jugadorActual = Inicio.devolverJugador1();
        } else if (turno == false) {
            jugadorActual = Inicio.devolverJugador2();
        }
        return jugadorActual;
    }

    public boolean validacion(int fila, int columna) {
        if (!arrayXO[fila][columna].getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Este espacio está ocupado!");
            return false;
        }

        if (turno) {
            arrayXO[fila][columna].setText("x");
        } else {
            arrayXO[fila][columna].setText("o");
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(XOVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XOVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel c00;
    private javax.swing.JLabel c01;
    private javax.swing.JLabel c02;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c20;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JTextField campocolumna;
    private javax.swing.JTextField campofila;
    private javax.swing.JButton ingresarOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
