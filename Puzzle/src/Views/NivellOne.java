package Views;

import java.sql.Time;

public class NivellOne extends javax.swing.JDialog {
    String horas, segundos, minutos;

    public NivellOne(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(400, 400);
        this.setLocationRelativeTo(null);
        nueve.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        uno.setBackground(new java.awt.Color(255, 255, 51));
        uno.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uno.setText("1");
        uno.setFocusable(false);
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel1.add(uno);

        dos.setBackground(new java.awt.Color(255, 255, 51));
        dos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dos.setText("2");
        dos.setFocusable(false);
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel1.add(dos);

        tres.setBackground(new java.awt.Color(255, 255, 51));
        tres.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tres.setText("3");
        tres.setFocusable(false);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel1.add(tres);

        cuatro.setBackground(new java.awt.Color(255, 255, 51));
        cuatro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cuatro.setText("4");
        cuatro.setFocusable(false);
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel1.add(cuatro);

        cinco.setBackground(new java.awt.Color(255, 255, 51));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cinco.setText("5");
        cinco.setFocusable(false);
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel1.add(cinco);

        seis.setBackground(new java.awt.Color(255, 255, 51));
        seis.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        seis.setText("6");
        seis.setFocusable(false);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel1.add(seis);

        siete.setBackground(new java.awt.Color(255, 255, 51));
        siete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        siete.setText("7");
        siete.setFocusable(false);
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel1.add(siete);

        ocho.setBackground(new java.awt.Color(255, 255, 51));
        ocho.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ocho.setText("8");
        ocho.setFocusable(false);
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel1.add(ocho);

        nueve.setBackground(new java.awt.Color(255, 255, 51));
        nueve.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nueve.setText("9");
        nueve.setFocusable(false);
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel1.add(nueve);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        if (nueve.isVisible() == false) {
            nueve.setText(ocho.getText());
            ocho.setVisible(false);
            nueve.setVisible(true);

        } else if (cinco.isVisible() == false) {
            cinco.setText(ocho.getText());
            ocho.setVisible(false);
            cinco.setVisible(true);

        } else if (siete.isVisible() == false) {
            siete.setText(ocho.getText());
            ocho.setVisible(false);
            siete.setVisible(true);
        }
    }//GEN-LAST:event_ochoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        if (nueve.isVisible() == false) {
            nueve.setText(seis.getText());
            seis.setVisible(false);
            nueve.setVisible(true);

        } else if (tres.isVisible() == false) {
            tres.setText(seis.getText());
            seis.setVisible(false);
            tres.setVisible(true);

        } else if (cinco.isVisible() == false) {
            cinco.setText(seis.getText());
            seis.setVisible(false);
            cinco.setVisible(true);

        }
    }//GEN-LAST:event_seisActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        if (seis.isVisible() == false) {
            seis.setText(nueve.getText());
            nueve.setVisible(false);
            seis.setVisible(true);

        } else if (ocho.isVisible() == false) {
            ocho.setText(nueve.getText());
            nueve.setVisible(false);
            ocho.setVisible(true);

        }
    }//GEN-LAST:event_nueveActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        if (seis.isVisible() == false) {
            seis.setText(tres.getText());
            tres.setVisible(false);
            seis.setVisible(true);

        } else if (dos.isVisible() == false) {
            dos.setText(tres.getText());
            tres.setVisible(false);
            dos.setVisible(true);

        }
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        if (seis.isVisible() == false) {
            seis.setText(cinco.getText());
            cinco.setVisible(false);
            seis.setVisible(true);

        } else if (dos.isVisible() == false) {
            dos.setText(cinco.getText());
            cinco.setVisible(false);
            dos.setVisible(true);

        } else if (cuatro.isVisible() == false) {
            cuatro.setText(cinco.getText());
            cinco.setVisible(false);
            cuatro.setVisible(true);
        } else if (ocho.isVisible() == false) {
            ocho.setText(cinco.getText());
            cinco.setVisible(false);
            ocho.setVisible(true);
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        if (cinco.isVisible() == false) {
            cinco.setText(dos.getText());
            dos.setVisible(false);
            cinco.setVisible(true);

        } else if (tres.isVisible() == false) {
            tres.setText(dos.getText());
            dos.setVisible(false);
            tres.setVisible(true);

        } else if (uno.isVisible() == false) {
            uno.setText(dos.getText());
            dos.setVisible(false);
            uno.setVisible(true);
        }
    }//GEN-LAST:event_dosActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        if (cinco.isVisible() == false) {
            cinco.setText(cuatro.getText());
            cuatro.setVisible(false);
            cinco.setVisible(true);

        } else if (uno.isVisible() == false) {
            uno.setText(cuatro.getText());
            cuatro.setVisible(false);
            uno.setVisible(true);

        } else if (siete.isVisible() == false) {
            siete.setText(cuatro.getText());
            cuatro.setVisible(false);
            siete.setVisible(true);
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        if (dos.isVisible() == false) {
            dos.setText(uno.getText());
            uno.setVisible(false);
            dos.setVisible(true);
        } else if (cuatro.isVisible() == false) {
            cuatro.setText(uno.getText());
            uno.setVisible(false);
            cuatro.setVisible(true);
        }
    }//GEN-LAST:event_unoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        if (ocho.isVisible() == false) {
            ocho.setText(siete.getText());
            siete.setVisible(false);
            ocho.setVisible(true);

        } else if (cuatro.isVisible() == false) {
            cuatro.setText(siete.getText());
            siete.setVisible(false);
            cuatro.setVisible(true);
        }
    }//GEN-LAST:event_sieteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btn1
     */
    public javax.swing.JButton getBtn1() {
        return uno;
    }

    /**
     * @param btn1 the btn1 to set
     */
    public void setBtn1(javax.swing.JButton btn1) {
        this.uno = btn1;
    }

    /**
     * @return the btn2
     */
    public javax.swing.JButton getBtn2() {
        return seis;
    }

    /**
     * @param btn2 the btn2 to set
     */
    public void setBtn2(javax.swing.JButton btn2) {
        this.seis = btn2;
    }

    /**
     * @return the btn3
     */
    public javax.swing.JButton getBtn3() {
        return siete;
    }

    /**
     * @param btn3 the btn3 to set
     */
    public void setBtn3(javax.swing.JButton btn3) {
        this.siete = btn3;
    }

    /**
     * @return the btn4
     */
    public javax.swing.JButton getBtn4() {
        return dos;
    }

    /**
     * @param btn4 the btn4 to set
     */
    public void setBtn4(javax.swing.JButton btn4) {
        this.dos = btn4;
    }

    /**
     * @return the btn5
     */
    public javax.swing.JButton getBtn5() {
        return cinco;
    }

    /**
     * @param btn5 the btn5 to set
     */
    public void setBtn5(javax.swing.JButton btn5) {
        this.cinco = btn5;
    }

    /**
     * @return the btn6
     */
    public javax.swing.JButton getBtn6() {
        return ocho;
    }

    /**
     * @param btn6 the btn6 to set
     */
    public void setBtn6(javax.swing.JButton btn6) {
        this.ocho = btn6;
    }

    /**
     * @return the btn7
     */
    public javax.swing.JButton getBtn7() {
        return tres;
    }

    /**
     * @param btn7 the btn7 to set
     */
    public void setBtn7(javax.swing.JButton btn7) {
        this.tres = btn7;
    }

    /**
     * @return the btn8
     */
    public javax.swing.JButton getBtn8() {
        return cuatro;
    }

    /**
     * @param btn8 the btn8 to set
     */
    public void setBtn8(javax.swing.JButton btn8) {
        this.cuatro = btn8;
    }

    /**
     * @return the btn9
     */
    public javax.swing.JButton getBtn9() {
        return nueve;
    }

    /**
     * @param btn9 the btn9 to set
     */
    public void setBtn9(javax.swing.JButton btn9) {
        this.nueve = btn9;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
}
