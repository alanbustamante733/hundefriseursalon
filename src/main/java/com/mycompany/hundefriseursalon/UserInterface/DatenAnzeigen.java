
package com.mycompany.hundefriseursalon.UserInterface;

import com.mycompany.hundefriseursalon.BusinessLogik.Controller;
import com.mycompany.hundefriseursalon.BusinessLogik.Haustier;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatenAnzeigen extends javax.swing.JFrame {

    Controller control = null;
    
    public DatenAnzeigen() {
        control = new Controller();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDatenAnzeigen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelleHaustieren = new javax.swing.JTable();
        jLabelDatenHaustieren = new javax.swing.JLabel();
        btnBearbeiten = new javax.swing.JButton();
        btnLoeschen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelDatenAnzeigen.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabelDatenAnzeigen.setText("Daten Anzeigen");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabelleHaustieren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabelleHaustieren);

        jLabelDatenHaustieren.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelDatenHaustieren.setText("Daten von Haustieren:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDatenHaustieren, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDatenHaustieren)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBearbeiten.setText("Bearbeiten");
        btnBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBearbeitenActionPerformed(evt);
            }
        });

        btnLoeschen.setText("Löschen");
        btnLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoeschenActionPerformed(evt);
            }
        });

        jButton1.setText("zurück");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDatenAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelDatenAnzeigen)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnLoeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBearbeiten, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        tabelleLaden();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoeschenActionPerformed
        //Cotrole, dass die Tabelle nicht leer ist
        if (jTabelleHaustieren.getRowCount() > 0) {
            //Controle, ob mindestens ein Items ausgewält ist
            if (jTabelleHaustieren.getSelectedRow()!=-1) {
                //id bekommen von dem Haustier zum Löschen
                int num_cliente = Integer.parseInt (String.valueOf(jTabelleHaustieren.getValueAt (jTabelleHaustieren.getSelectedRow(), 0)));
                //Löschen aufrufen
                control.haustierLoeschen(num_cliente);
                //User nachrichten, dass der Eintrag erfolgreich gelöscht ist
                nachrichtAnzeigen("Haustier erfolgreich gelöscht", "Info", "Löschen vom Haustier");
                tabelleLaden();
                
            }
            else {
                nachrichtAnzeigen("Kein Haustier wurde ausgewählt", "Error", "Fehler am Löschen");
            }
        }
        else {
            nachrichtAnzeigen("Es gibt nichts zum Löschen in der Tabelle", "Error", "Fehler am Löschen");
        }
        
    }//GEN-LAST:event_btnLoeschenActionPerformed

    private void btnBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBearbeitenActionPerformed
        if (jTabelleHaustieren.getRowCount() > 0) {
            if (jTabelleHaustieren.getSelectedRow()!=-1) {
                int num_cliente = Integer.parseInt (String.valueOf(jTabelleHaustieren.getValueAt (jTabelleHaustieren.getSelectedRow(), 0)));
                
                DatenModifizieren fensterModif = new DatenModifizieren(num_cliente);
                fensterModif.setVisible(true);
                fensterModif.setLocationRelativeTo(null);
                
                this.dispose();
            }
                
            else {
                nachrichtAnzeigen("Kein Haustier wurde ausgewählt", "Error", "Fehler am Löschen");
            }
        }
        else {
            nachrichtAnzeigen("Es gibt nichts zum Löschen in der Tabelle", "Error", "Fehler am Löschen");
        }
    }//GEN-LAST:event_btnBearbeitenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Hauptfenster hauptfenster = new Hauptfenster();
        hauptfenster.setVisible(true);
        hauptfenster.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void nachrichtAnzeigen (String nachricht, String art, String titel) {
                JOptionPane optionPane = new JOptionPane (nachricht);
                if (art.equals("Info")) {
                    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                }
                else if(art.equals("Error")) {
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
                JDialog dialog = optionPane.createDialog(titel);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBearbeiten;
    private javax.swing.JButton btnLoeschen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDatenAnzeigen;
    private javax.swing.JLabel jLabelDatenHaustieren;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelleHaustieren;
    // End of variables declaration//GEN-END:variables

    public void tabelleLaden() {
        //Das Model der Tabelle ist definiert
        DefaultTableModel modelTabelle = new DefaultTableModel() {
            
            //Spalten und Zeile nicht änderbar
            @Override
            public boolean isCellEditable (int row, int column) {
                return false;
            }
            
        };
        
        
        //Name der Spalten etablieren 
        String titeln[] = {"Nummer", "Name", "Farbe", "Rasse", "Allergien", "Besonderheiten", "Name des Besitzer", "Handynummer"};
        modelTabelle.setColumnIdentifiers(titeln);
        
        //Daten aus der Datenbank hochladen
        List <Haustier> listeHaustieren = control.haustierenHolen();
        
        //Daten aus der Liste zeigen in die Tabelle
        if (listeHaustieren!=null) {
           for (Haustier hausti : listeHaustieren) {
               Object[] objekt = {hausti.getNum_cliente(), hausti.getName(), hausti.getFarbe(), hausti.getRasse(),
               hausti.getAllergien(), hausti.getBesondernheiten(), hausti.getEinBesitzer().getName(),
               hausti.getEinBesitzer().getHandynummer()};
               
               modelTabelle.addRow(objekt);
           } 
        }
        
        jTabelleHaustieren.setModel(modelTabelle);
        
        }
}
