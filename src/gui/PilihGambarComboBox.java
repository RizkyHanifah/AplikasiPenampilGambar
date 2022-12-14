
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;

/**
 *
 * @author UNKNOWN'PC
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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

        pilihan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ImagePanel = new javax.swing.JPanel();
        glassfishLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        postgreesqlLB = new javax.swing.JLabel();
        rizkyhanifahLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penampil Gambar ComboBox");
        setBackground(new java.awt.Color(102, 255, 255));

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glassfish", "JavaEE", "PostgreeSQL", "rizkyhanifah" }));
        pilihan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanItemStateChanged(evt);
            }
        });
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        jLabel1.setText("Pilih Gambar");

        ImagePanel.setLayout(new java.awt.CardLayout());

        glassfishLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glassfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/glassfish.jpg"))); // NOI18N
        glassfishLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImagePanel.add(glassfishLB, "Glassfish");

        javaeeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/javaee.jpg"))); // NOI18N
        javaeeLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImagePanel.add(javaeeLB, "JavaEE");

        postgreesqlLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgreesqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/postgreesql.jpg"))); // NOI18N
        postgreesqlLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImagePanel.add(postgreesqlLB, "PostgreeSQL");
        postgreesqlLB.getAccessibleContext().setAccessibleName("Penampil Gambar ComboBox");

        rizkyhanifahLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rizkyhanifahLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/rizkyhanifah.jpg"))); // NOI18N
        rizkyhanifahLB.setMaximumSize(new java.awt.Dimension(1080, 400));
        rizkyhanifahLB.setMinimumSize(new java.awt.Dimension(316, 400));
        rizkyhanifahLB.setName("null"); // NOI18N
        rizkyhanifahLB.setPreferredSize(new java.awt.Dimension(1080, 720));
        ImagePanel.add(rizkyhanifahLB, "rizkyhanifah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanItemStateChanged
        // TODO add your handling code here:
        
        CardLayout cl = (CardLayout)(ImagePanel.getLayout());
        cl.show(ImagePanel, String.valueOf(pilihan.getSelectedItem()));
    }//GEN-LAST:event_pilihanItemStateChanged

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel glassfishLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JLabel postgreesqlLB;
    private javax.swing.JLabel rizkyhanifahLB;
    // End of variables declaration//GEN-END:variables
}
