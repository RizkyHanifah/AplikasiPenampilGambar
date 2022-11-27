/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author UNKNOWN'PC
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButtonFullScreen() {
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

        imagePanel = new javax.swing.JPanel();
        postgreesqlLB = new javax.swing.JLabel();
        glassfishLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        rizkyhanifah = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        glassfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgreesqlBT = new javax.swing.JButton();
        rizkyhanifahBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Penampil Gambar Button FullScreen");

        imagePanel.setAlignmentX(1.0F);
        imagePanel.setAlignmentY(1.0F);
        imagePanel.setLayout(new java.awt.CardLayout());

        postgreesqlLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgreesqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/postgreesql.jpg"))); // NOI18N
        postgreesqlLB.setToolTipText("null");
        postgreesqlLB.setMinimumSize(new java.awt.Dimension(316, 400));
        postgreesqlLB.setName("null"); // NOI18N
        postgreesqlLB.setPreferredSize(new java.awt.Dimension(316, 400));
        postgreesqlLB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagePanel.add(postgreesqlLB, "2");
        postgreesqlLB.getAccessibleContext().setAccessibleName("2");

        glassfishLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glassfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/glassfish.jpg"))); // NOI18N
        glassfishLB.setMaximumSize(new java.awt.Dimension(316, 400));
        glassfishLB.setMinimumSize(new java.awt.Dimension(316, 400));
        glassfishLB.setName("null"); // NOI18N
        glassfishLB.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(glassfishLB, "0");
        glassfishLB.getAccessibleContext().setAccessibleName("0");

        javaeeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/javaee.jpg"))); // NOI18N
        javaeeLB.setToolTipText("null");
        javaeeLB.setName("null"); // NOI18N
        imagePanel.add(javaeeLB, "1");
        javaeeLB.getAccessibleContext().setAccessibleName("1");

        rizkyhanifah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rizkyhanifah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/rizkyhanifah.jpg"))); // NOI18N
        rizkyhanifah.setMaximumSize(new java.awt.Dimension(1080, 400));
        rizkyhanifah.setMinimumSize(new java.awt.Dimension(316, 400));
        rizkyhanifah.setName("null"); // NOI18N
        rizkyhanifah.setPreferredSize(new java.awt.Dimension(1080, 720));
        imagePanel.add(rizkyhanifah, "3");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        glassfishBT.setText("GlassFish");
        glassfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishBTActionPerformed(evt);
            }
        });
        buttonPanel.add(glassfishBT);

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });
        buttonPanel.add(javaeeBT);

        postgreesqlBT.setText("PostgreeSQL");
        postgreesqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgreesqlBTActionPerformed(evt);
            }
        });
        buttonPanel.add(postgreesqlBT);

        rizkyhanifahBT.setText("rizkyhanifah");
        rizkyhanifahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rizkyhanifahBTActionPerformed(evt);
            }
        });
        buttonPanel.add(rizkyhanifahBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void glassfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_glassfishBTActionPerformed

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void postgreesqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgreesqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_postgreesqlBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void rizkyhanifahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rizkyhanifahBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "3");
    }//GEN-LAST:event_rizkyhanifahBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButtonFullScreen FullFrame = new PilihGambarButtonFullScreen();
            
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(FullFrame);
                
                FullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton glassfishBT;
    private javax.swing.JLabel glassfishLB;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JButton postgreesqlBT;
    private javax.swing.JLabel postgreesqlLB;
    private javax.swing.JLabel rizkyhanifah;
    private javax.swing.JButton rizkyhanifahBT;
    // End of variables declaration//GEN-END:variables
}
