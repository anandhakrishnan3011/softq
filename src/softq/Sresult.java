/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Anandhu
 */
public class Sresult extends javax.swing.JFrame {
    String name;
String dep;
String div;
int rollno;
int admnno;
int rset = 0;
String sanswer;
String choice;
int eflag;
String course;
String url ="jdbc:mysql://localhost/softq?autoReconnect=true&serverTimezone=UTC&useSSL=False&allowPublicKeyRetrieval=true";

    /**
     * Creates new form Sresult
     */
    public Sresult(String ename, String edep,String ediv,int erollno,int eadmnno,int erset,String answer,String schoice,int flag,String scourse) {
        name=ename;
        dep=edep;
        div=ediv;
        rollno=erollno;
        admnno= eadmnno;
        rset=erset;
        sanswer=answer;
        choice=schoice;
        eflag=flag;
        course=scourse;
        
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        if(flag==0){
        if(sanswer.equals(choice)){
           
            resmsg.setText("Your answer is Right");
            if(course.equalsIgnoreCase("C")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET c=c+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
             if(course.equalsIgnoreCase("Java")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET java=java+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            if(course.equalsIgnoreCase("HTML")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET html=html+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
             if(course.equalsIgnoreCase("CSS")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET css=css+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
           if(course.equalsIgnoreCase("Python")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET python=python+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            if(course.equalsIgnoreCase("Javascript")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET Javascript=Javascript+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
             if(course.equalsIgnoreCase("SQL")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET msql=msql+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            
        }
        else{
            resmsg.setText("The the Right answer was "+sanswer);
        }
       
        }
         if(flag==1){
             if(sanswer.equals(choice)){
           
            resmsg.setText("Your answer is Right");
            if(course.equalsIgnoreCase("SQL")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET msql=msql+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            if(course.equalsIgnoreCase("HTML")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET html=html+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
             if(course.equalsIgnoreCase("CSS")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET css=css+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
           if(course.equalsIgnoreCase("Python")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET python=python+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            if(course.equalsIgnoreCase("Javascript")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET Javascript=Javascript+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            if(course.equalsIgnoreCase("Java")){
                try (Connection con = DriverManager.getConnection(url, "root", "")) {
                     String sql="UPDATE result SET java=java+1 WHERE admnno=?";     
               PreparedStatement pst=con.prepareStatement(sql);
               pst.setInt(1, admnno);
               pst.executeUpdate();
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
                
            }
            
             }
             else{
            resmsg.setText(" The the Right answer was "+sanswer);
        }
            
            

            
            
            
        }
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
        resmsg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resmsg.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        resmsg.setForeground(new java.awt.Color(0, 153, 255));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(resmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(resmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(eflag==0){
                   Exam eobj=new Exam(name,dep,div,rollno,admnno,rset);
                   eobj.setVisible(true);
                   this.setVisible(false);
        }
        else{
            Pexam wel=new Pexam();
            wel.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(Sresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
//                new Sresult(ename,edep,ediv,erollno,eadmnno).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel resmsg;
    // End of variables declaration//GEN-END:variables
}
