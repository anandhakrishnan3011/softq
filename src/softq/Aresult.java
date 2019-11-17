/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anandhu
 */
public class Aresult extends javax.swing.JFrame {
    String url ="jdbc:mysql://localhost/softq?autoReconnect=true&serverTimezone=UTC&useSSL=False&allowPublicKeyRetrieval=true";

   
    public Aresult() {
        initComponents();
        this.setLocationRelativeTo(null);
        table();
        questioncount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void questioncount(){
        try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "C");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               cc.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "Java");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               cjava.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

                        try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "HTML");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               chtml.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

                                try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "CSS");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               ccss.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

                                        try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "JavaScript");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               cjavascript.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

                                                try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "Python");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               cpython.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

                                                        try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT count(*) FROM question WHERE course=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, "SQL");
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               csql.setText(rs.getString(1));
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void table(){
        try(Connection con=DriverManager.getConnection(url,"root","")){
            String sql="SELECT * FROM result";
            PreparedStatement pst=con.prepareStatement(sql);

             ResultSet rs = pst.executeQuery();
               table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cjava = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chtml = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ccss = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cpython = new javax.swing.JLabel();
        cjavascript = new javax.swing.JLabel();
        cjava4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        csql = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GO BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Question count");

        jLabel2.setText("C");

        cc.setText("jLabel3");

        jLabel3.setText("Java");

        cjava.setText("Java");

        jLabel4.setText("Html");

        chtml.setText("html");

        jLabel5.setText("Css");

        ccss.setText("css");

        jLabel6.setText("Python");

        cpython.setText("python");

        cjavascript.setText("script");

        cjava4.setText("JavaScript");

        jLabel8.setText("Sql");

        csql.setText("sql");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cjava)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(chtml)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(ccss))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cpython)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(csql)
                        .addGap(35, 35, 35)
                        .addComponent(cjava4)
                        .addGap(18, 18, 18)
                        .addComponent(cjavascript)
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cjava)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(chtml)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ccss)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cpython)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(csql)
                                    .addComponent(cjava4)
                                    .addComponent(cjavascript))))))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admins s=new Admins();
        s.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cc;
    private javax.swing.JLabel ccss;
    private javax.swing.JLabel chtml;
    private javax.swing.JLabel cjava;
    private javax.swing.JLabel cjava4;
    private javax.swing.JLabel cjavascript;
    private javax.swing.JLabel cpython;
    private javax.swing.JLabel csql;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
