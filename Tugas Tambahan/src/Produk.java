import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Produk extends javax.swing.JFrame {
private Connection con;
private Statement stat;
private PreparedStatement prep;
private ResultSet res;

    /**
     * Creates new form Produk
     */
    public Produk() {
        initComponents();
        koneksi();
        update_TabelProduk();
        Jenis();
        
    }
    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(""+"jdbc:mysql://localhost:3306/p3", "root","");
            stat = con.createStatement();
            }catch (Exception e)
            {  JOptionPane.showMessageDialog(null, e);
        }
    }
    private void bersihkan() {
        
        KodeProduk.setText("");
        NamaProduk.setText("");
        HargaProduk.setText("");
        KodeProduk.requestFocus();
    }
    public final void update_TabelProduk(){
        try {
            koneksi();
            String query = "Select * from produk order by kode_produk";
            prep = con.prepareStatement(query);
            res = prep.executeQuery();
            TabelProduk.setModel(DbUtils.resultSetToTableModel(res));
    }
    catch (Exception e)
        
        {
            JOptionPane.showMessageDialog(null, e);
        }finally 
        {
            try{ 
                res.close();
                prep.close();
               }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }       
}
        
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisProduk = new javax.swing.JButton();
        Produk = new javax.swing.JButton();
        TambahProduk = new javax.swing.JButton();
        EditProduk = new javax.swing.JButton();
        BatalProduk = new javax.swing.JButton();
        HapusProduk = new javax.swing.JButton();
        SimpanProduk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        KodeProduk = new javax.swing.JTextField();
        NamaProduk = new javax.swing.JTextField();
        HargaProduk = new javax.swing.JTextField();
        Kode_Jenis = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelProduk = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JenisProduk.setText("Jenis Produk");
        JenisProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisProdukActionPerformed(evt);
            }
        });

        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });

        TambahProduk.setText("Tambah");
        TambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahProdukActionPerformed(evt);
            }
        });

        EditProduk.setText("Edit");
        EditProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProdukActionPerformed(evt);
            }
        });

        BatalProduk.setText("Batal");
        BatalProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalProdukActionPerformed(evt);
            }
        });

        HapusProduk.setText("Hapus");
        HapusProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusProdukActionPerformed(evt);
            }
        });

        SimpanProduk.setText("Simpan");
        SimpanProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanProdukActionPerformed(evt);
            }
        });

        jLabel1.setText("From Produk");

        jLabel2.setText("Kode ");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis");

        jLabel5.setText("Harga");

        Kode_Jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kode_JenisActionPerformed(evt);
            }
        });

        jLabel6.setText("Tabel Produk");

        TabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Jenis", "Harga"
            }
        ));
        TabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelProduk);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Produk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JenisProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(237, 237, 237)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NamaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(HargaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(KodeProduk)
                                    .addComponent(Kode_Jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(109, 109, 109)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(133, 133, 133)
                        .addComponent(TambahProduk)
                        .addGap(18, 18, 18)
                        .addComponent(EditProduk)
                        .addGap(30, 30, 30)
                        .addComponent(HapusProduk)
                        .addGap(33, 33, 33)
                        .addComponent(SimpanProduk)
                        .addGap(37, 37, 37)
                        .addComponent(BatalProduk)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TambahProduk)
                        .addComponent(EditProduk)
                        .addComponent(HapusProduk)
                        .addComponent(SimpanProduk)
                        .addComponent(BatalProduk))
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JenisProduk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(KodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(NamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produk))))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Kode_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(HargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
     try { Produk d = new Produk();
            d.setLayar(true);
            this.dispose();}
            catch (Exception e)
            {JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_ProdukActionPerformed

    private void Kode_JenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kode_JenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kode_JenisActionPerformed
       private void Jenis()
       {
           try {
               String sql = "Select * from jenisproduk";
               prep = con.prepareStatement(sql);
               res = prep.executeQuery();
               
               while(res.next()){
                   Kode_Jenis.addItem(res.getString("Kode_jenis"));
                   
               }
           }
           catch (Exception e)
           {
               JOptionPane.showMessageDialog(null, e);
           }
       }
    private void JenisProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisProdukActionPerformed
        try { JenisProduk d = new JenisProduk();
            d.setLayar(true);
            this.dispose();}
            catch (Exception e)
            {JOptionPane.showMessageDialog(null, e);}
      
    }//GEN-LAST:event_JenisProdukActionPerformed

    private void TambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahProdukActionPerformed
     try {
                stat.executeUpdate("insert into produk values("
                                       +"'"+KodeProduk.getText()+"',"
                                       +"'"+NamaProduk.getText()+"',"
                                       +"'"+Kode_Jenis.getSelectedItem().toString()+"',"
                                       +"'"+HargaProduk.getText()+"')"
                                       );
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
      
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Keteraan error :"+e);
     }
     
     Produk sv = new Produk();
     sv.setLayar(true);
    }//GEN-LAST:event_TambahProdukActionPerformed

    private void EditProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProdukActionPerformed
    try {
        String isi1 = KodeProduk.getText();
        String isi2 = NamaProduk.getText();
        Object isi3 = Kode_Jenis.getSelectedItem().toString();
        String isi4 = HargaProduk.getText();
        
        String sql = "Update produk set Nama_produk='"+isi2+"',Kode_jenis='"+isi3+"',Harga_Produk='"+isi4+"' where Kode_produk='"+isi1+"'";
        prep = con.prepareStatement(sql);
        prep.execute();
        bersihkan();
        JOptionPane.showMessageDialog(null,  "Data sudah diupdate");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Keteraan error:"+e);
    }
    
    Produk sv = new Produk();
    sv.setLayar(true);
    }//GEN-LAST:event_EditProdukActionPerformed

    private void TabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelProdukMouseClicked
       String isi1 = KodeProduk.getText();
        String isi2 = NamaProduk.getText();
        Object isi3 = Kode_Jenis.getSelectedItem().toString();
        String isi4 = HargaProduk.getText();
        
        int baris = TabelProduk.getSelectedRow();
        KodeProduk.setText(TabelProduk.getModel().getValueAt(baris, 0).toString());
        NamaProduk.setText(TabelProduk.getModel().getValueAt(baris, 1).toString());
        HargaProduk.setText(TabelProduk.getModel().getValueAt(baris, 3).toString());
    }//GEN-LAST:event_TabelProdukMouseClicked

    private void HapusProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusProdukActionPerformed
        String sql = "delete from produk where Kode_produk=?";
        try {
            
            prep = con.prepareStatement(sql);
            prep.setString(1, KodeProduk.getText());
            prep.execute();
            JOptionPane.showMessageDialog(null, "Data Telah Dihapus");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Keteraan error:"+e);
        }
        Produk sv = new Produk();
        sv.setLayar(true);
        
    }//GEN-LAST:event_HapusProdukActionPerformed

    private void SimpanProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanProdukActionPerformed
        try {
                stat.executeUpdate("insert into produk values("
                                       +"'"+KodeProduk.getText()+"',"
                                       +"'"+NamaProduk.getText()+"',"
                                       +"'"+Kode_Jenis.getSelectedItem().toString()+"',"
                                       +"'"+HargaProduk.getText()+"')"
                                       );
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
      
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Keteraan error :"+e);
     }
     
     Produk sv = new Produk();
     sv.setLayar(true);
    }//GEN-LAST:event_SimpanProdukActionPerformed

    private void BatalProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalProdukActionPerformed
        bersihkan();
    }//GEN-LAST:event_BatalProdukActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Produk().setVisible(true);
            }
        });
    }
    
    public void setLayar(boolean a){
        new Produk().setVisible(a);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalProduk;
    private javax.swing.JButton EditProduk;
    private javax.swing.JButton HapusProduk;
    private javax.swing.JTextField HargaProduk;
    private javax.swing.JButton JenisProduk;
    private javax.swing.JTextField KodeProduk;
    private javax.swing.JComboBox Kode_Jenis;
    private javax.swing.JTextField NamaProduk;
    private javax.swing.JButton Produk;
    private javax.swing.JButton SimpanProduk;
    private javax.swing.JTable TabelProduk;
    private javax.swing.JButton TambahProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
