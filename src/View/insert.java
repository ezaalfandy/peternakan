/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MR AL
 */
public class insert extends javax.swing.JFrame {

    /**
     * Creates new form main
     */

    public insert() {
        initComponents();
        setResizable(false);
        update.hide();
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
        harga = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        tanggal_lahir = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        berat = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        Jantan = new javax.swing.JRadioButton();
        Betina = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tanggal_vaksin = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cattle Ranch");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 219, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 20, 20));
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 260, 32));
        getContentPane().add(usia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 260, 32));
        getContentPane().add(tanggal_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Berat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, 30));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 90, 30));

        Insert.setBackground(new java.awt.Color(51, 153, 0));
        Insert.setForeground(new java.awt.Color(255, 255, 255));
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 90, 30));

        update.setBackground(new java.awt.Color(0, 153, 0));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 90, 30));

        reset.setText("Clear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 90, 30));
        getContentPane().add(berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 260, 32));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 260, 32));

        Jantan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jantan.setForeground(new java.awt.Color(255, 255, 255));
        Jantan.setText("Jantan");
        getContentPane().add(Jantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        Betina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Betina.setForeground(new java.awt.Color(255, 255, 255));
        Betina.setText("Betina");
        getContentPane().add(Betina, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Lahir");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal Vaksin");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 30));
        getContentPane().add(tanggal_vaksin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 260, 30));

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 260, 130));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jenis Kelamin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc_peternakan/image/sapi2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        setBounds(0, 0, 714, 685);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
       if ("".equals(id.getText()))
       {
           JOptionPane.showMessageDialog(this, "harap isi data", "Error", JOptionPane.WARNING_MESSAGE);
       }else {
          String jenkel;
          if (Jantan.isSelected()){
              jenkel = "Jantan";
          }else{
              jenkel = "Betina";
          }
            tanggal_lahir.setDateFormatString("dd/MM/yyy");
            tanggal_vaksin.setDateFormatString("dd/MM/yyy");
            String SQL = "INSERT INTO `tb_sapi`(`id`, `tanggal_lahir`, `usia`, `berat`, `jenis_kelamin`, `Tanggal_vaksin`, `Harga`, `keterangan`) VALUES "
                    + "('"+id.getText()+"','"+tanggal_lahir.getDate()+"','"+usia.getText()+"','"+berat.getText()+"','"+jenkel+"','"+tanggal_vaksin.getDate()+"','"+harga.getText()+"','"+keterangan.getText()+"')";
         
            int status = KoneksiDB.execute(SQL);
            if (status ==1){
                JOptionPane.showMessageDialog(this, "Data berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                //selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
               }
       }  
       
    }//GEN-LAST:event_InsertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
           new main().setVisible(true);
           dispose();
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        usia.setText("");
        id.setText("");
        berat.setText("");
        harga.setText("");
        keterangan.setText("");
    }//GEN-LAST:event_resetActionPerformed
    public void detail(String status, String id){
        Insert.setVisible(false);
        this.id.hide();
        update.setVisible(true);
        
          String SQL = "SELECT * FROM tb_sapi Where id ="+id;
          ResultSet rs = KoneksiDB.executeQuery(SQL);
             try{
                 if (rs.first()) {
                    String TANGGAL_LAHIR = rs.getString(2);
                    String USIA = rs.getString(3);
                    String BERAT = rs.getString(4);
                    String JENIS_KELAMIN= rs.getString(5);
                    String TANGGAL_VAKSIN= rs.getString(6);
                    String HARGA = rs.getString(7);
                    String KETERANGAN = rs.getString(8);
                    
                    //tanggal_lahir.setDate(TANGGAL_LAHIR);
                    usia.setText(USIA);
                    berat.setText(BERAT);
                    harga.setText(HARGA);
                    keterangan.setText(KETERANGAN);
                    this.id.setText(id);
                    //tanggal_vaksin.setDate(TANGGAL_VAKSIN);
                 }
              
          }catch (SQLException ex){
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
       if ("".equals(id.getText()))
            {
                JOptionPane.showMessageDialog(this, "harap isi data", "Error", JOptionPane.WARNING_MESSAGE);
        }else {
               String jenkel;
               if (Jantan.isSelected()){
                   jenkel = "Jantan";
               }else{
                   jenkel = "Betina";
               }
                    tanggal_lahir.setDateFormatString("dd/MM/yyy");
                    tanggal_vaksin.setDateFormatString("dd/MM/yyy");
                    String SQL = "UPDATE `tb_sapi` SET `tanggal_lahir`='"+tanggal_lahir.getDate()+"',`usia`='"+usia.getText()+
                             "',`berat`='"+berat.getText()+"',`jenis_kelamin`='"+jenkel+"',`Tanggal_vaksin`='"+tanggal_vaksin.getDate()
                            +"',`Harga`='"+harga.getText()+"',`keterangan`='"+keterangan.getText()+"' WHERE id ="+id.getText();
                    int status = KoneksiDB.execute(SQL);
                 if (status ==1){
                     JOptionPane.showMessageDialog(this, "Data berhasil Diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                     //selectData();
                 }else{
                     JOptionPane.showMessageDialog(this, "Data Gagal DIubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    }
            }  
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Betina;
    private javax.swing.JButton Insert;
    private javax.swing.JRadioButton Jantan;
    private javax.swing.JButton back;
    private javax.swing.JTextField berat;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JButton reset;
    private com.toedter.calendar.JDateChooser tanggal_lahir;
    private com.toedter.calendar.JDateChooser tanggal_vaksin;
    private javax.swing.JButton update;
    private javax.swing.JTextField usia;
    // End of variables declaration//GEN-END:variables

}
