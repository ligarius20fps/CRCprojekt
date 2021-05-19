/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crcprojekt;

import java.util.Random;

/**
 *
 * @author admin
 */
public class OknoGlowne extends javax.swing.JFrame {

    /**
     * Creates new form OknoGlowne
     */
    public OknoGlowne() {
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

        wyborAlgorytmu = new javax.swing.ButtonGroup();
        opcjaCRC = new javax.swing.JRadioButton();
        opcjaCRCr = new javax.swing.JRadioButton();
        opcjaSDLC = new javax.swing.JRadioButton();
        opcjaSDLCr = new javax.swing.JRadioButton();
        opcjaHamming = new javax.swing.JRadioButton();
        opcjaPar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sygnalWe = new javax.swing.JTextArea();
        generujSygnal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sygnalWyPop = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        generujZakl = new javax.swing.JButton();
        wspZakl = new javax.swing.JTextField();
        informacje = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SygnalZakl = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        SygnalNad = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        sygnalWy = new javax.swing.JTextArea();
        guzikOblicz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wyborAlgorytmu.add(opcjaCRC);
        opcjaCRC.setSelected(true);
        opcjaCRC.setText("CRC 16");
		opcjaCRC.setActionCommand("CRC");

        wyborAlgorytmu.add(opcjaCRCr);
        opcjaCRCr.setText("CRC 16 REVERSE");
		opcjaCRCr.setActionCommand("CRC-R");
		
        wyborAlgorytmu.add(opcjaSDLC);
        opcjaSDLC.setText("SDLC");
		opcjaSDLC.setActionCommand("SDLC");

        wyborAlgorytmu.add(opcjaSDLCr);
        opcjaSDLCr.setText("SDLC REVERSE");
		opcjaSDLCr.setActionCommand("SDLC-R");

        wyborAlgorytmu.add(opcjaHamming);
        opcjaHamming.setText("kodowanie Hamminga");
		opcjaHamming.setActionCommand("Hamming");

        wyborAlgorytmu.add(opcjaPar);
        opcjaPar.setText("kontrola parzystości");
		opcjaPar.setActionCommand("Par");

        jLabel1.setText("Sygnał wejściowy [0/1]");

        sygnalWe.setColumns(20);
        sygnalWe.setLineWrap(true);
        sygnalWe.setRows(5);
        sygnalWe.setText("000001011100101011100101");
        jScrollPane1.setViewportView(sygnalWe);

        generujSygnal.setText("Generuj losowy sygnał");
        generujSygnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generujSygnalActionPerformed(evt);
            }
        });

        jLabel3.setText("Sygnał wyjściowy z poprawkami");

        sygnalWyPop.setEditable(false);
        sygnalWyPop.setColumns(20);
        sygnalWyPop.setLineWrap(true);
        sygnalWyPop.setRows(5);
        jScrollPane4.setViewportView(sygnalWyPop);

        jLabel6.setText("Współczynnik zakłóceń");

        jLabel2.setText("Sygnał nadmiarowy");

        jLabel4.setText("Sygnał wyjściowy bez poprawek");

        jLabel5.setText("Sygnał zakłócający [XOR]");

        generujZakl.setText("Generuj zakłócenie");
        generujZakl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generujZaklActionPerformed(evt);
            }
        });

        wspZakl.setText("0,01");

        informacje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        informacje.setText("INFORMACJE O BŁĘDACH");

        SygnalZakl.setColumns(20);
        SygnalZakl.setLineWrap(true);
        SygnalZakl.setRows(5);
        jScrollPane2.setViewportView(SygnalZakl);

        SygnalNad.setEditable(false);
        SygnalNad.setColumns(20);
        SygnalNad.setLineWrap(true);
        SygnalNad.setRows(5);
        jScrollPane3.setViewportView(SygnalNad);

        sygnalWy.setEditable(false);
        sygnalWy.setColumns(20);
        sygnalWy.setLineWrap(true);
        sygnalWy.setRows(5);
        jScrollPane5.setViewportView(sygnalWy);

        guzikOblicz.setText("Oblicz");
        guzikOblicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guzikObliczActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcjaCRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcjaCRCr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcjaSDLC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcjaSDLCr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcjaHamming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcjaPar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generujSygnal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(generujZakl)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wspZakl, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(guzikOblicz)
                            .addComponent(informacje))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcjaCRC)
                    .addComponent(opcjaCRCr)
                    .addComponent(opcjaSDLC)
                    .addComponent(opcjaSDLCr)
                    .addComponent(opcjaHamming)
                    .addComponent(opcjaPar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(wspZakl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generujZakl)
                            .addComponent(generujSygnal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(informacje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(guzikOblicz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void generujSygnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generujSygnalActionPerformed
        int dlugosc=24;
        Random rng=new Random();
        int liczba=rng.nextInt(1<<dlugosc);
        String prawy = Integer.toBinaryString(liczba);
        //problem jest taki
        //że nie mamy zer z lewej strony
        //np. 0010 1100 -> 10 1100
        int ileZer=Integer.numberOfLeadingZeros(liczba)-32+dlugosc;
        //generujemy lewy ciąg
        String lewy="";
        for(int i=0;i<ileZer;i++)
        {
            lewy+="0";
        }
        //nanieść stringa do pola tekstowego
        sygnalWe.setText(lewy+prawy);
    }//GEN-LAST:event_generujSygnalActionPerformed

    private void generujZaklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generujZaklActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generujZaklActionPerformed

    private void guzikObliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guzikObliczActionPerformed
        ControlSum crc= new ControlSum();
        String signal=sygnalWe.getText();
        int liczba_bajtow=(int) Math.ceil((double)signal.length()/8);
        Byte[] bajty=new Byte[liczba_bajtow];
        for(int i=0;i<bajty.length;i++)
        {
            //bit po prawej stronie jest najmłodszy
            int beginIndex=signal.length()-8*(i+1);
            if(beginIndex<0)beginIndex=0;
            String temp=signal.substring(beginIndex,signal.length()-8*i);
            int bajt=Integer.parseInt(temp, 2);
            if(bajt>127)bajt-=256;
            bajty[i]=(byte)bajt;
        }
        crc.reset();
        if(wyborAlgorytmu.getSelection().getActionCommand()=="CRC")
        {
            crc.CRC_16(bajty); //do zrobienia - zweryfikować poprawność działania metody
            informacje.setText(Integer.toString(crc.value));
        }
		else if(wyborAlgorytmu.getSelection().getActionCommand()=="CRC-R")
		{
                    crc.CRC_16_rev(bajty);
		}
		else if(wyborAlgorytmu.getSelection().getActionCommand()=="SDLC")
		{
			crc.SDLC(bajty);
                        informacje.setText(Integer.toString(crc.value));
		}
		else if(wyborAlgorytmu.getSelection().getActionCommand()=="SDLC-R")
		{
			crc.SDLC_rev(bajty);
                        informacje.setText(Integer.toString(crc.value));
		}
		else if(wyborAlgorytmu.getSelection().getActionCommand()=="Par")
		{
			informacje.setText("Parole Parole");
		}
		else
		{
			informacje.setText("42");
		}
    }//GEN-LAST:event_guzikObliczActionPerformed

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
            java.util.logging.Logger.getLogger(OknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OknoGlowne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OknoGlowne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea SygnalNad;
    private javax.swing.JTextArea SygnalZakl;
    private javax.swing.JButton generujSygnal;
    private javax.swing.JButton generujZakl;
    private javax.swing.JButton guzikOblicz;
    private javax.swing.JLabel informacje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton opcjaCRC;
    private javax.swing.JRadioButton opcjaCRCr;
    private javax.swing.JRadioButton opcjaHamming;
    private javax.swing.JRadioButton opcjaPar;
    private javax.swing.JRadioButton opcjaSDLC;
    private javax.swing.JRadioButton opcjaSDLCr;
    private javax.swing.JTextArea sygnalWe;
    private javax.swing.JTextArea sygnalWy;
    private javax.swing.JTextArea sygnalWyPop;
    private javax.swing.JTextField wspZakl;
    private javax.swing.ButtonGroup wyborAlgorytmu;
    // End of variables declaration//GEN-END:variables
}

class ControlSum
{
    public int value;
    public ControlSum()
    {
        value = 0;
    }
    
    public void CRC_16(Byte[] bytes)
    {
        int i;
        int crc_value = 0;
        for (int len = 0; len < bytes.length; len++) {
        for (i = 0x80; i != 0; i >>= 1) {
            if ((crc_value & 0x8000) != 0) {
                crc_value = (crc_value << 1) ^ 0x8005;
            } else {
                crc_value = crc_value << 1;
            }
            if ((bytes[len] & i) != 0) {
                crc_value ^= 0x8005;
            }
        }
    }
    this.value=crc_value;
    }
    public void CRC_16_rev(Byte[] bytes)
    {
        int i;
        int crc_value = 0;
        for (int len = 0; len < bytes.length; len++) {
        for (i = 0x80; i != 0; i >>= 1) {
            if ((crc_value & 0x8000) != 0) {
                crc_value = (crc_value << 1) ^ 0x4005;
            } else {
                crc_value = crc_value << 1;
            }
            if ((bytes[len] & i) != 0) {
                crc_value ^= 0x4005;
            }
        }
    }
    this.value=crc_value;
    }
    public void SDLC(Byte[] bytes)
    {
        int i;
        int crc_value = 0;
        for (int len = 0; len < bytes.length; len++) {
        for (i = 0x80; i != 0; i >>= 1) {
            if ((crc_value & 0x8000) != 0) {
                crc_value = (crc_value << 1) ^ 0x1021;
            } else {
                crc_value = crc_value << 1;
            }
            if ((bytes[len] & i) != 0) {
                crc_value ^= 0x1021;
            }
        }
    }
    this.value=crc_value;
    }
   public void SDLC_rev(Byte[] bytes)
    {
        int i;
        int crc_value = 0;
        for (int len = 0; len < bytes.length; len++) {
        for (i = 0x80; i != 0; i >>= 1) {
            if ((crc_value & 0x8000) != 0) {
                crc_value = (crc_value << 1) ^ 0x811;
            } else {
                crc_value = crc_value << 1;
            }
            if ((bytes[len] & i) != 0) {
                crc_value ^= 0x811;
            }
        }
    }
    this.value=crc_value;
    }
    public void reset()
    {
        this.value = 0;
    }
}