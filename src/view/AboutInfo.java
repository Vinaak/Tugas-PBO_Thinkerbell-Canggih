/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author Chandra
 */
public class AboutInfo extends javax.swing.JFrame {

    /**
     * Creates new form AboutInfo
     */
    public AboutInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel2.setText("ABOUT INFO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 80, 100, 14);

        jLabel3.setText("Thingker adalah aplikasi yang disusun sebagai");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 320, 14);

        jLabel4.setText("perwujudan penyelesaian tugas besar mata");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 140, 260, 14);

        jLabel5.setText("kuliah Pemrograman Berorientasi Object");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 160, 260, 14);

        jLabel6.setText("Contact Us");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 210, 70, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-email-30.png"))); // NOI18N
        jLabel7.setText("Thingker@gmail.com");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 230, 180, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-instagram-30.png"))); // NOI18N
        jLabel8.setText("@Thingker__");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 260, 150, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-telephone-30.png"))); // NOI18N
        jLabel9.setText("0351-9237-9233");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 290, 170, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-address-30.png"))); // NOI18N
        jLabel10.setText("Purwoketo, Jawa Tengah");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 320, 220, 30);

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 40, 40, 40);

        min.setFont(new java.awt.Font("Thames", 1, 35)); // NOI18N
        min.setText("-");
        min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel1.add(min);
        min.setBounds(230, 10, 30, 30);

        exit.setFont(new java.awt.Font("Thames", 1, 35)); // NOI18N
        exit.setText("x");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(260, 10, 30, 30);

        jLabel18.setFont(new java.awt.Font("Freestyle Script", 3, 24)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-wedding-50.png"))); // NOI18N
        jLabel18.setText("THINGKER");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(140, 390, 160, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-back-to-30.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 40, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background/login (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.pack();
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(AboutInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    // End of variables declaration//GEN-END:variables
}
