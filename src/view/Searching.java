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
public class Searching extends javax.swing.JFrame {

    /**
     * Creates new form Searching
     */
    public Searching() {
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
        kotaComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(338, 470));

        jPanel1.setPreferredSize(new java.awt.Dimension(338, 450));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PILIH KOTA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 90, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("JASMINE WO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 214, 90, 10);

        jLabel4.setBackground(new java.awt.Color(199, 140, 140));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ROSEANA WO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 280, 110, 17);

        jLabel5.setBackground(new java.awt.Color(199, 140, 140));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EMERALD WO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 350, 100, 17);

        jLabel6.setFont(new java.awt.Font("Freestyle Script", 3, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-wedding-50.png"))); // NOI18N
        jLabel6.setText("THINGKER");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 390, 160, 60);

        kotaComboBox.setBackground(new java.awt.Color(148, 113, 147));
        kotaComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        kotaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAKARTA", "SURABAYA", "YOGYAKARTA", "PURWOKERTO", "BANDUNG", "SEMARANG", " ", " ", " " }));
        kotaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(kotaComboBox);
        kotaComboBox.setBounds(110, 80, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("REKOMENDASI");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 150, 110, 19);

        min.setFont(new java.awt.Font("Thames", 1, 35)); // NOI18N
        min.setText("-");
        min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel1.add(min);
        min.setBounds(232, 10, 30, 30);

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-geometric-flowers-64.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 190, 70, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-greenhouse-64.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 260, 60, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-wilted-flower-48.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 330, 50, 50);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-search-30.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(250, 80, 40, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-back-to-30.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 20, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background/menu (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        MenuPaket pkt = new MenuPaket();
        pkt.setVisible(true);
        pkt.pack();
        pkt.setLocationRelativeTo(null);
        pkt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        MenuPaket pkt = new MenuPaket();
        pkt.setVisible(true);
        pkt.pack();
        pkt.setLocationRelativeTo(null);
        pkt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        MenuPaket pkt = new MenuPaket();
        pkt.setVisible(true);
        pkt.pack();
        pkt.setLocationRelativeTo(null);
        pkt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void kotaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kotaComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if(kotaComboBox.getSelectedItem() == "BANDUNG"){
            Bandung bdg = new Bandung();
            bdg.setVisible(true);
            bdg.pack();
            bdg.setLocationRelativeTo(null);
            bdg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(kotaComboBox.getSelectedItem() == "YOGYAKARTA"){
            diy ygy = new diy();
            ygy.setVisible(true);
            ygy.pack();
            ygy.setLocationRelativeTo(null);
            ygy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(kotaComboBox.getSelectedItem() == "PURWOKERTO"){
            pwt p =  new pwt();
            p.setVisible(true);
            p.pack();
            p.setLocationRelativeTo(null);
            p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(kotaComboBox.getSelectedItem() == "SURABAYA"){
            sby s =  new sby();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(kotaComboBox.getSelectedItem() == "JAKARTA"){
            jkt jkt = new jkt();
            jkt.setVisible(true);
            jkt.pack();
            jkt.setLocationRelativeTo(null);
            jkt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(kotaComboBox.getSelectedItem() == "SEMARANG"){
            Semarang smg = new Semarang();
            smg.setVisible(true);
            smg.pack();
            smg.setLocationRelativeTo(null);
            smg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.pack();
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

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
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searching().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> kotaComboBox;
    private javax.swing.JLabel min;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
