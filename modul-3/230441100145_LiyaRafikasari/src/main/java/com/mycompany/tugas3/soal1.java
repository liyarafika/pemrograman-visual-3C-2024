/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tugas3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author LENOVO
 */
public class soal1 extends javax.swing.JFrame {

    /**
     * Creates new form soal1
     */
    public soal1() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ps1 = new javax.swing.JRadioButton();
        ps2 = new javax.swing.JRadioButton();
        ps3 = new javax.swing.JRadioButton();
        ps4 = new javax.swing.JRadioButton();
        pp5 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ps5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ps6 = new javax.swing.JRadioButton();
        ps7 = new javax.swing.JRadioButton();
        ps8 = new javax.swing.JRadioButton();
        ps9 = new javax.swing.JRadioButton();
        ps10 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dobat = new javax.swing.JComboBox<>();
        beli = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jRadioButton6.setText("jRadioButton6");

        jRadioButton10.setText("jRadioButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APOTEK MINI");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 42));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new java.awt.GridLayout(2, 5, 0, -60));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\alleron_1_11zon.jpeg")); // NOI18N
        jPanel3.add(jLabel4);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\bodrex_2_11zon.jpeg")); // NOI18N
        jPanel3.add(jLabel3);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\obat\\betadine_11zon.jpeg")); // NOI18N
        jPanel3.add(jLabel8);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\hotincream_4_11zon.jpeg")); // NOI18N
        jPanel3.add(jLabel2);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\kayu putih_5_11zon.jpeg")); // NOI18N
        jPanel3.add(jLabel5);

        buttonGroup1.add(ps1);
        ps1.setText("Alleron");
        ps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps1ActionPerformed(evt);
            }
        });
        jPanel3.add(ps1);

        buttonGroup1.add(ps2);
        ps2.setText("Bodrex");
        jPanel3.add(ps2);

        buttonGroup1.add(ps3);
        ps3.setText("Betadine");
        jPanel3.add(ps3);

        buttonGroup1.add(ps4);
        ps4.setText("HotinCream");
        jPanel3.add(ps4);

        buttonGroup1.add(pp5);
        pp5.setText("Kayu Putih");
        jPanel3.add(pp5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel3, gridBagConstraints);

        jButton2.setText("Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 712);
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setText("Detail");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 394);
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setText("Detail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 47, 0, 136);
        jPanel2.add(jButton4, gridBagConstraints);

        jButton5.setText("Detail");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 247, 0, 0);
        jPanel2.add(jButton5, gridBagConstraints);

        ps5.setText("Detail");
        ps5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 546, 0, 0);
        jPanel2.add(ps5, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 970, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new java.awt.GridLayout(2, 5, 0, -90));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\mixagrip_6_11zon.jpeg")); // NOI18N
        jPanel5.add(jLabel6);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\paracetamol_7_11zon.jpeg")); // NOI18N
        jPanel5.add(jLabel9);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\promag_8_11zon.jpeg")); // NOI18N
        jPanel5.add(jLabel7);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\sagobion_9_11zon.jpeg")); // NOI18N
        jPanel5.add(jLabel11);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\11zon_compressed\\11zon_compressed\\tolak angin_10_11zon.jpeg")); // NOI18N
        jPanel5.add(jLabel10);

        buttonGroup1.add(ps6);
        ps6.setText("Mixagrip");
        ps6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps6ActionPerformed(evt);
            }
        });
        jPanel5.add(ps6);

        buttonGroup1.add(ps7);
        ps7.setText("Paracetamol");
        jPanel5.add(ps7);

        buttonGroup1.add(ps8);
        ps8.setText("Promag");
        jPanel5.add(ps8);

        buttonGroup1.add(ps9);
        ps9.setText("Sagobion");
        jPanel5.add(ps9);

        buttonGroup1.add(ps10);
        ps10.setText("Tolak Angin");
        jPanel5.add(ps10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 265;
        gridBagConstraints.ipady = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jPanel5, gridBagConstraints);

        jButton7.setText("Detail");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 918);
        jPanel4.add(jButton7, gridBagConstraints);

        jButton8.setText("Detail");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 539);
        jPanel4.add(jButton8, gridBagConstraints);

        jButton9.setText("Detail");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 131);
        jPanel4.add(jButton9, gridBagConstraints);

        jButton10.setText("Detail");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 274, 0, 0);
        jPanel4.add(jButton10, gridBagConstraints);

        jButton11.setText("Detail");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 695, 0, 0);
        jPanel4.add(jButton11, gridBagConstraints);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 347, 970, -1));

        jLabel12.setText("Daftar Obat  :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 654, -1, -1));

        dobat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Obat", "Sakit Gatal", "Sakit Pusing", "Sakit Luka", "Sakit Nyeri", "Sakit Perut", "Sakit Batuk", "Sakit Demam", "Sakit Lambung", "Penambah Darah", "Masuk Angin" }));
        dobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobatActionPerformed(evt);
            }
        });
        getContentPane().add(dobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 651, -1, -1));

        beli.setText("Beli Obat");
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        getContentPane().add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 651, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Betadine().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new Mixagrip().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new Paracetamol().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new Sangobion().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ps6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps6ActionPerformed
        // TODO add your handling code here:
        new Mixagrip().setVisible(true);
    }//GEN-LAST:event_ps6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Alleron().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Bodrex().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         new HotinCream().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ps5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps5ActionPerformed
        // TODO add your handling code here:
        new KayuPutih().setVisible(true);
    }//GEN-LAST:event_ps5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new Promag().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new TolakAngin().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        // TODO add your handling code here:
         int jcoke = dobat.getSelectedIndex();
    
    // Check if no radio button is selected
    if (!ps1.isSelected() && !ps2.isSelected() && !ps3.isSelected() && !ps4.isSelected() && !pp5.isSelected() && 
        !ps6.isSelected() && !ps7.isSelected() && !ps8.isSelected() && !ps9.isSelected() && !ps10.isSelected()) {
        
        JOptionPane.showMessageDialog(this, "Pilih Salah Satunya, jangan dikosongin", "WARNING", JOptionPane.WARNING_MESSAGE);
    } else {
        // Switch based on selected index of the combo box
        switch (jcoke) {
            case 1:
                JOptionPane.showMessageDialog(this, "Pilihan obat Albumin tubuh sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Pilihan obat Demam Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Pilihan obat Batuk berdahak Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Pilihan obat Asam lambung Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "Pilihan obat Peradangan nyeri Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(this, "Pilihan obat Diare Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sariawan Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sakit tenggorokan Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(this, "Pilihan obat Sakit Luka Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            case 10:
                JOptionPane.showMessageDialog(this, "Pilihan obat Gatal-gatal Sukses", "Message", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Obat Yang Anda Pilih Salah", "Message", JOptionPane.WARNING_MESSAGE);
                break;
        }

        // Reset all selections, except bl1
        buttonGroup1.clearSelection();  // Reset all radio buttons  
        dobat.setSelectedIndex(0);      // Reset combo box to index 0
        
    }
    }//GEN-LAST:event_beliActionPerformed

    private void dobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobatActionPerformed
        // TODO add your handling code here:
         int jcoke = dobat.getSelectedIndex();
    
    // Reset semua radio button
    buttonGroup1.clearSelection();

    // Set radio button sesuai dengan pilihan combo box
    switch (jcoke) {
        case 0:
          
        break;
        case 1:
            ps1.setSelected(true);
            break;
        case 2:
            ps2.setSelected(true);
            break;
        case 3:
            ps3.setSelected(true);
            break;
        case 4:
            ps4.setSelected(true);
            break;
        case 5:
            pp5.setSelected(true);
            break;
        case 6:
            ps6.setSelected(true);
            break;
        case 7:
            ps7.setSelected(true);
            break;
        case 8:
            ps8.setSelected(true);
            break;
        case 9:
            ps9.setSelected(true);
            break;
        case 10:
            ps10.setSelected(true);
            break;    
        default:
        break;
}
    }//GEN-LAST:event_dobatActionPerformed

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
            java.util.logging.Logger.getLogger(soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beli;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dobat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton pp5;
    private javax.swing.JRadioButton ps1;
    private javax.swing.JRadioButton ps10;
    private javax.swing.JRadioButton ps2;
    private javax.swing.JRadioButton ps3;
    private javax.swing.JRadioButton ps4;
    private javax.swing.JButton ps5;
    private javax.swing.JRadioButton ps6;
    private javax.swing.JRadioButton ps7;
    private javax.swing.JRadioButton ps8;
    private javax.swing.JRadioButton ps9;
    // End of variables declaration//GEN-END:variables
}
