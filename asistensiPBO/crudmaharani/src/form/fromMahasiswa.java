package form;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fromMahasiswa extends javax.swing.JFrame {

    private Connection conn;
            
    public fromMahasiswa() {
        initComponents();
        conn = koneksi.getConnection();
        getData();
        nonAktifButton();
        aktifButton();
    }
    
    private void getData(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * from mahasiswa";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String telepon = rs.getString("telepon");
                String alamat = rs.getString("alamat");
                
                Object[] rowData = {id,nama,telepon,alamat};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
             Logger.getLogger(fromMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_telepon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_pencarian = new javax.swing.JTextField();
        t_alamat = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tbl_data.setBackground(new java.awt.Color(255, 204, 204));
        tbl_data.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(102, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Telepon", "Alamat"
            }
        ));
        tbl_data.setToolTipText("");
        tbl_data.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_data);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nama");

        t_nama.setBackground(new java.awt.Color(255, 204, 204));
        t_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Telepon");

        t_telepon.setBackground(new java.awt.Color(255, 204, 204));
        t_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_teleponActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Alamat");

        t_pencarian.setBackground(new java.awt.Color(102, 102, 102));
        t_pencarian.setForeground(new java.awt.Color(255, 255, 255));
        t_pencarian.setText("Pencarian");
        t_pencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_pencarianMouseClicked(evt);
            }
        });
        t_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pencarianActionPerformed(evt);
            }
        });
        t_pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_pencarianKeyTyped(evt);
            }
        });

        t_alamat.setBackground(new java.awt.Color(255, 204, 204));
        t_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_alamatActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(204, 204, 204));
        btn_hapus.setForeground(new java.awt.Color(51, 51, 51));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(204, 204, 204));
        btn_batal.setForeground(new java.awt.Color(51, 51, 51));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_perbarui.setBackground(new java.awt.Color(204, 204, 204));
        btn_perbarui.setForeground(new java.awt.Color(51, 51, 51));
        btn_perbarui.setText("PERBARUI");
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        btn_tambah.setBackground(new java.awt.Color(204, 204, 204));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nama)
                    .addComponent(t_telepon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(t_alamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_perbarui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_pencarian)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(t_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_hapus)
                            .addComponent(btn_batal)
                            .addComponent(btn_tambah)
                            .addComponent(btn_perbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pencarianActionPerformed

    private void t_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_alamatActionPerformed

    private void t_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namaActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
       String nama = t_nama.getText(); 
       String telepon = t_telepon.getText();
       String alamat = t_alamat.getText();
        
       if(nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()){
           JOptionPane.showMessageDialog(this,"semua kolom harus di isi!", "validasi",JOptionPane.ERROR_MESSAGE);
           return;       
       }
       
       try {
           String sql = "INSERT INTO mahasiswa (nama,telepon,alamat) VALUES (?,?,?)";
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1,nama);
           st.setString(2,telepon);
           st.setString(3,alamat);
           
           int rowInserted = st.executeUpdate();
           if(rowInserted > 0) {
               JOptionPane.showMessageDialog(this,"Data Berhasil Di Tambahkan");
               resetFrom(); 
               getData();
           }
           
           st.close();
       } catch (Exception e){
            Logger.getLogger(fromMahasiswa.class.getName()).log(Level.SEVERE,null,e);
       }     
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
       int selectedRow = tbl_data.getSelectedRow();
       if(selectedRow == -1) {
           JOptionPane.showMessageDialog(this,"Pilih baris yang akan di perbarui");
           return; 
       }
        
       String id = tbl_data.getValueAt(selectedRow,0).toString();
       String nama = t_nama.getText();
       String telepon = t_telepon.getText();
       String alamat = t_alamat.getText();
       
       if(nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()){
           JOptionPane.showMessageDialog(this,"semua kolom harus di isi!", "validasi",JOptionPane.ERROR_MESSAGE);
           return;       
       }
       
       try {
            String sql = "UPDATE mahasiswa SET nama=?, telepon=?, alamat=? WHERE id=?";
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1,nama);
           st.setString(2,telepon);
           st.setString(3,alamat);
           st.setString(4,id);
           
           
           int rowUpdated = st.executeUpdate();
           if(rowUpdated > 0) {
               JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
               resetFrom(); 
               getData(); 
           }
           
           st.close();
       } catch (Exception e) {
           Logger.getLogger(fromMahasiswa.class.getName()).log(Level.SEVERE,null,e);
       }
    }//GEN-LAST:event_btn_perbaruiActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1) {
            String nama = tbl_data.getValueAt(selectedRow, 1).toString();
            String telepon = tbl_data.getValueAt(selectedRow, 2).toString();        
            String alamat = tbl_data.getValueAt(selectedRow, 3).toString();

            t_nama.setText(nama);
            t_telepon.setText(telepon);
            t_alamat.setText(alamat);
        }
       btn_perbarui.setEnabled(true);
       btn_tambah.setEnabled(false);
       btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetFrom();
        aktifButton();
        nonAktifButton();
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
       if(selectedRow == -1) {
           JOptionPane.showMessageDialog(this,"Pilih baris yang akan di perbarui");
           return; 
       }
        
       int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
       if(confirm == JOptionPane.YES_OPTION) {
           String id = tbl_data.getValueAt(selectedRow, 0).toString();
           
           
            try {
                String sql = "DELETE FROM mahasiswa WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString( 1,id);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data  Berhasil Di Hapus");
                    resetFrom();
                    getData();
                }
                
                st.close();
                
            } catch (Exception e) {
                Logger.getLogger(fromMahasiswa.class.getName()).log(Level.SEVERE,null,e);
            }
        }
       
        resetFrom();
        getData();
        aktifButton();
        nonAktifButton();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void t_pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_pencarianMouseClicked
        t_pencarian.setText("");
    }//GEN-LAST:event_t_pencarianMouseClicked

    private void t_pencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_pencarianKeyTyped
         DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        String pencarian = t_pencarian.getText();
        
        try {
            String sql = "Select * from mahasiswa WHERE telepon LIKE ? OR  alamat";
            PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, "%" + pencarian + "%");
                st.setString(2, "%" + pencarian + "%");
                st.setString(3, "%" + pencarian + "%");
            
                ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String telepon = rs.getString("telepon");
                String alamat = rs.getString("alamat");
                
                Object[] rowData = {id,nama,telepon,alamat};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
             Logger.getLogger(fromMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_t_pencarianKeyTyped

    private void t_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_teleponActionPerformed
   
    public static void main(String args[]) {
     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_pencarian;
    private javax.swing.JTextField t_telepon;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetFrom() {
        t_nama.setText("");
        t_telepon.setText("");
        t_alamat.setText("");
    }

    private void nonAktifButton() {
        btn_perbarui.setEnabled( false);
        btn_hapus.setEnabled( false);
    }

    private void aktifButton() {
       btn_tambah.setEnabled(true);
       btn_batal.setEnabled(true);
    }
}