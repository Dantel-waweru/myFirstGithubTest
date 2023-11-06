/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author pc
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }

   int MyAccNum;
     public FastCash(int Number) {
         initComponents();
        MyAccNum = Number;
        GetBalance();
    }

   Connection Con = null;
   PreparedStatement pst = null;
   ResultSet Rs = null,Rs1=null;
   java.sql.Statement St = null,St1;
   int OldBalance;
private void GetBalance(){
  String Query = "'Select ' from Account where Name ='"+MyAccNum+"' ";
       try{
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
              OldBalance = Rs1.getInt(9);
              Bal2.setText("Ksh"+OldBalance);
                
            }else{
               // JOptionPane.showMessageDialog(this,"Wrong Account number or Pin");
            }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
       }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSTATEMENT = new javax.swing.JButton();
        jDEPOSIT1 = new javax.swing.JButton();
        jFASTCASH = new javax.swing.JButton();
        jWITHDRAW = new javax.swing.JButton();
        jCHANGEPIN = new javax.swing.JButton();
        jBALANCE = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bal2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("FAST CASH");

        jSTATEMENT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSTATEMENT.setText("KSH 1000");
        jSTATEMENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSTATEMENTMouseClicked(evt);
            }
        });

        jDEPOSIT1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDEPOSIT1.setText("KSH 100");
        jDEPOSIT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDEPOSIT1MouseClicked(evt);
            }
        });

        jFASTCASH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jFASTCASH.setText("KSH 500");
        jFASTCASH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFASTCASHMouseClicked(evt);
            }
        });

        jWITHDRAW.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jWITHDRAW.setText("KSH 200");
        jWITHDRAW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jWITHDRAWMouseClicked(evt);
            }
        });

        jCHANGEPIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCHANGEPIN.setText("KSH 5000");
        jCHANGEPIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCHANGEPINMouseClicked(evt);
            }
        });
        jCHANGEPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCHANGEPINActionPerformed(evt);
            }
        });

        jBALANCE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBALANCE.setText("KSH 10000");
        jBALANCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBALANCEMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("MY CODE SPACE BANK.");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("LOG OUT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("MY CODE SPACE BANK.");

        Bal2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Bal2.setForeground(new java.awt.Color(0, 0, 255));
        Bal2.setText("BALANCE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDEPOSIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCHANGEPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(198, 198, 198))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFASTCASH, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSTATEMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jWITHDRAW, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDEPOSIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWITHDRAW, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFASTCASH, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSTATEMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCHANGEPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCHANGEPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCHANGEPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCHANGEPINActionPerformed

    private void jDEPOSIT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDEPOSIT1MouseClicked
       if(OldBalance >100){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-100);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jDEPOSIT1MouseClicked

    private void jWITHDRAWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWITHDRAWMouseClicked
        if(OldBalance >200){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-200);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jWITHDRAWMouseClicked

    private void jFASTCASHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFASTCASHMouseClicked
        if(OldBalance >500){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-500);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jFASTCASHMouseClicked

    private void jSTATEMENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSTATEMENTMouseClicked
        if(OldBalance >1000){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-1000);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jSTATEMENTMouseClicked

    private void jCHANGEPINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCHANGEPINMouseClicked
         if(OldBalance >5000){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-5000);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jCHANGEPINMouseClicked

    private void jBALANCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBALANCEMouseClicked
         if(OldBalance >10000){
           JOptionPane.showMessageDialog(this,"No enough Balance");
       }
        else {
             try{
           String Query = "Update Account set Balance=? where Number=?";
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-10000);
             ps.setInt(2,MyAccNum);
             if(ps.executeUpdate() == 1){
                 JOptionPane.showMessageDialog(this,"Withdraw success!");
                     new MainMenu().setVisible(true);
       this.dispose();
             }else{
                  JOptionPane.showMessageDialog(this,"Missing Information!");
             }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
       }
       }
    }//GEN-LAST:event_jBALANCEMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
           new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bal2;
    private javax.swing.JButton jBALANCE;
    private javax.swing.JButton jCHANGEPIN;
    private javax.swing.JButton jDEPOSIT1;
    private javax.swing.JButton jFASTCASH;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSTATEMENT;
    private javax.swing.JButton jWITHDRAW;
    // End of variables declaration//GEN-END:variables

   
}
