/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basisdatalanjuut;

/**
 *
 * @author Azzam Wildan
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Pelanggan extends javax.swing.JFrame {

    /**
     * Creates new form Pelanggan
     */
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Pelanggan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNIKPelanggan = new javax.swing.JTextField();
        txtNamaPelanggan = new javax.swing.JTextField();
        txtAlamatPelanggan = new javax.swing.JTextField();
        txtNoTelepon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSimpanPelanggan = new javax.swing.JButton();
        btnEditPelanggan = new javax.swing.JButton();
        btnHapusPelanggan = new javax.swing.JButton();
        btnClearPelanggan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PENYEWAAN BIS PARIWISATA");

        jLabel2.setText("Nama Pelanggan:");

        jLabel3.setText("Alamat:");

        jLabel4.setText("No Telepon:");

        jLabel6.setText("NIK Pelanggan:");

        jLabel7.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnSimpanPelanggan.setText("Simpan");
        btnSimpanPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPelangganActionPerformed(evt);
            }
        });

        btnEditPelanggan.setText("Edit");
        btnEditPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPelangganActionPerformed(evt);
            }
        });

        btnHapusPelanggan.setText("Hapus");
        btnHapusPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPelangganActionPerformed(evt);
            }
        });

        btnClearPelanggan.setText("Bersihkan");
        btnClearPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPelangganActionPerformed(evt);
            }
        });

        jButton1.setText("Selanjutnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtAlamatPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtNIKPelanggan)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKeluar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSimpanPelanggan)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditPelanggan)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHapusPelanggan)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClearPelanggan)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNIKPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpanPelanggan)
                            .addComponent(btnEditPelanggan)
                            .addComponent(btnHapusPelanggan)
                            .addComponent(btnClearPelanggan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnKeluar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPelangganActionPerformed
        // TODO add your handling code here:
        connectDatabase();
        String query = "INSERT INTO Pelanggan (NIK_pelanggan, nama, alamat, no_telepon, email) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, txtNIKPelanggan.getText());
            ps.setString(2, txtNamaPelanggan.getText());
            ps.setString(3, txtAlamatPelanggan.getText());
            ps.setString(4, txtNoTelepon.getText());
            ps.setString(5, txtEmail.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data pelanggan berhasil disimpan!");
            loadData(); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }//GEN-LAST:event_btnSimpanPelangganActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormBus formBus = new FormBus();

    // Menampilkan form bus
    formBus.setVisible(true);

    // Menyembunyikan form pelanggan saat ini
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEditPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPelangganActionPerformed
        // TODO add your handling code here:
        connectDatabase();
        String query = "UPDATE Pelanggan SET nama = ?, alamat = ?, no_telepon = ?, email = ? WHERE NIK_pelanggan = ?";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, txtNamaPelanggan.getText());
            ps.setString(2, txtAlamatPelanggan.getText());
            ps.setString(3, txtNoTelepon.getText());
            ps.setString(4, txtEmail.getText());
            ps.setString(5, txtNIKPelanggan.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data pelanggan berhasil diupdate!");
            loadData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mengedit data: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }//GEN-LAST:event_btnEditPelangganActionPerformed

    private void btnHapusPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPelangganActionPerformed
        // TODO add your handling code here:
        connectDatabase();
        String query = "DELETE FROM Pelanggan WHERE NIK_pelanggan = ?";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, txtNIKPelanggan.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data pelanggan berhasil dihapus!");
            loadData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }//GEN-LAST:event_btnHapusPelangganActionPerformed

    private void btnClearPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPelangganActionPerformed
        // TODO add your handling code here:
        txtNIKPelanggan.setText("");
        txtNamaPelanggan.setText("");
        txtAlamatPelanggan.setText("");
        txtNoTelepon.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnClearPelangganActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Tutup aplikasi
        System.exit(0);
    }
    }//GEN-LAST:event_btnKeluarActionPerformed
    
    private void connectDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PenjualanTiketBis", "postgres", "azzam2003");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Koneksi database gagal: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearPelanggan;
    private javax.swing.JButton btnEditPelanggan;
    private javax.swing.JButton btnHapusPelanggan;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpanPelanggan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAlamatPelanggan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIKPelanggan;
    private javax.swing.JTextField txtNamaPelanggan;
    private javax.swing.JTextField txtNoTelepon;
    // End of variables declaration//GEN-END:variables

    private void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
