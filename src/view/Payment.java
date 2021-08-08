/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandra
 */
public class Payment extends javax.swing.JFrame {
        String paket, Cetak, idPaket;
    /**
     * Creates new form Payment
     */
    public Payment() {
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

        cashKreditbuttonGroup = new javax.swing.ButtonGroup();
        kreditbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        dp = new javax.swing.JLabel();
        dpField = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        metode = new javax.swing.JLabel();
        cashRadioButton = new javax.swing.JRadioButton();
        kreditRadioButton = new javax.swing.JRadioButton();
        duaRadioButton = new javax.swing.JRadioButton();
        tigaRadioButton = new javax.swing.JRadioButton();
        duaAngsuranField = new javax.swing.JTextField();
        tigaAngsuranField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cetakNotaButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        namaWOField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        paketComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        idPaketField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menu.setText("MENU PEMBAYARAN");
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        nama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nama.setText("Nama WO :");
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        dp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dp.setText("DP :");
        jPanel1.add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        dpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dpField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        total.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        total.setText("Total :");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, -1));

        metode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        metode.setText("Metode Pembayaran :");
        jPanel1.add(metode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cashKreditbuttonGroup.add(cashRadioButton);
        cashRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cashRadioButton.setText("Cash");
        cashRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cashRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        cashKreditbuttonGroup.add(kreditRadioButton);
        kreditRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        kreditRadioButton.setText("Kredit :");
        kreditRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreditRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(kreditRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        kreditbuttonGroup.add(duaRadioButton);
        duaRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        duaRadioButton.setText("2x Angsuran");
        jPanel1.add(duaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        kreditbuttonGroup.add(tigaRadioButton);
        tigaRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tigaRadioButton.setText("3x Angsuran");
        jPanel1.add(tigaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        duaAngsuranField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaAngsuranFieldActionPerformed(evt);
            }
        });
        jPanel1.add(duaAngsuranField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, -1));
        jPanel1.add(tigaAngsuranField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 140, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("/bln");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("/bln");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        cetakNotaButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cetakNotaButton.setText("Cetak Nota");
        cetakNotaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakNotaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cetakNotaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Freestyle Script", 3, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-wedding-50.png"))); // NOI18N
        jLabel8.setText("THINGKER");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 160, 50));

        min.setFont(new java.awt.Font("Thames", 1, 35)); // NOI18N
        min.setText("-");
        min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel1.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 30));

        exit.setFont(new java.awt.Font("Thames", 1, 35)); // NOI18N
        exit.setText("x");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));

        namaWOField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaWOFieldActionPerformed(evt);
            }
        });
        jPanel1.add(namaWOField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, -1));

        jLabel2.setText("Paket dipilih :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/ICON/icons8-back-to-30.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        paketComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Paket", "Paket A", "Paket B", "Paket C", "Paket D" }));
        paketComboBox.setToolTipText("");
        paketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(paketComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        jLabel3.setText("ID Paket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        idPaketField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPaketFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idPaketField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background/menu (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpFieldActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void cashRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashRadioButtonActionPerformed

    private void kreditRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreditRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kreditRadioButtonActionPerformed

    private void duaAngsuranFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaAngsuranFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duaAngsuranFieldActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void namaWOFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaWOFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaWOFieldActionPerformed

    private void cetakNotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakNotaButtonActionPerformed
        // TODO add your handling code here:
        //aket = paketComboBox.getSelectedItem();
        
                        
                   
        String idPaket = idPaketField.getText();
        String namaWO = namaWOField.getText();
        String DP = dpField.getText();
        String Total = totalField.getText();
        String metode = "";
        if(cashRadioButton.isSelected()){
            metode="cash";
        }else if(kreditRadioButton.isSelected()){
            metode = "kredit";
        }
        String angsuran = "";
        if(duaRadioButton.isSelected()){
            angsuran = duaAngsuranField.getText();
        }else if(tigaRadioButton.isSelected()){
            angsuran = tigaAngsuranField.getText();
        }
        
         try {
                openDB();
                s.executeUpdate(
                    "INSERT INTO payment VALUE ('" + idPaket + "','" + namaWO + "','" + DP + "','"+Total+"','"+metode+"','"+angsuran+"')"
                      
                );
                
                JOptionPane.showMessageDialog(null, "Data added!");

            }catch(SQLException | ClassNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());

            }finally {
                closeDB();
            }
         
    int h ;
        h=JOptionPane.showConfirmDialog(null, "Cetak Nota?", "Cetak", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (h==JOptionPane.YES_OPTION){
                  if (paketComboBox.getSelectedItem().equals("Pilih Paket")){
                        paket="";
                    }else if (paketComboBox.getSelectedItem().equals("Paket A")){
                        paket="Paket A";
         
                    }else if (paketComboBox.getSelectedItem().equals("Paket B")){
                        paket="Paket B";
                    }else if (paketComboBox.getSelectedItem().equals("Paket C")){
                        paket="Paket C";
                    }else if (paketComboBox.getSelectedItem().equals("Paket D")){
                         paket="Paket D";
                    }
                    
                     
                    
           Cetak= "Nota Pemesanan "+
           "\n Paket yang dipilih                       : "+paketComboBox.getSelectedItem()+
           "\n id Paket                                         : "+idPaketField.getText()+
           "\n Nama Wedding Organizer       : "+ namaWOField.getText()+
           "\n DP                                               : "+dpField.getText()+
           "\n Total                                            : "+totalField.getText()+
           "\n Metode Pembayaran                : "+ metode;
           
       
        JOptionPane.showMessageDialog(null, Cetak ,"Data Pemesanan Wedding Organizer" ,JOptionPane.INFORMATION_MESSAGE);
                

 }
        
    }//GEN-LAST:event_cetakNotaButtonActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.pack();
        mn.setLocationRelativeTo(null);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void paketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketComboBoxActionPerformed
        // TODO add your handling code here:
        if(paketComboBox.getSelectedItem() == "Paket A"){
            dpField.setText("Rp. 4.500.000");
            idPaketField.setText("00TA");
            totalField.setText("Rp. 9.000.000");
    
        }else if(paketComboBox.getSelectedItem() == "Paket B"){
            dpField.setText("Rp. 7.500.000");
            idPaketField.setText("00TB");
            totalField.setText("Rp. 15.000.000");
      
        }else if(paketComboBox.getSelectedItem() == "Paket C"){
            dpField.setText("Rp. 10.500.000");
             idPaketField.setText("00TC");
             totalField.setText("Rp. 20.000.000");
        
        }else if(paketComboBox.getSelectedItem() == "Paket D"){
            dpField.setText("Rp. 15.000.000");
             idPaketField.setText("00TD");
             totalField.setText("Rp. 30.000.000");
            
            
        }
    }//GEN-LAST:event_paketComboBoxActionPerformed

    private void idPaketFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPaketFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPaketFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    private static Connection c;
    private static Statement s;
 
    private static void openDB()throws ClassNotFoundException,SQLException{
        String URL = "jdbc:mysql://localhost:3306/dbwo";
        String USERNAME = "root";
        String PASSWORD = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        s = c.createStatement();
        
        
    }
    private static void closeDB(){
        try{
            s.close();
            c.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup cashKreditbuttonGroup;
    private javax.swing.JRadioButton cashRadioButton;
    private javax.swing.JButton cetakNotaButton;
    private javax.swing.JLabel dp;
    private javax.swing.JTextField dpField;
    private javax.swing.JTextField duaAngsuranField;
    private javax.swing.JRadioButton duaRadioButton;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField idPaketField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kreditRadioButton;
    private javax.swing.ButtonGroup kreditbuttonGroup;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel metode;
    private javax.swing.JLabel min;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField namaWOField;
    private javax.swing.JComboBox<String> paketComboBox;
    private javax.swing.JTextField tigaAngsuranField;
    private javax.swing.JRadioButton tigaRadioButton;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
