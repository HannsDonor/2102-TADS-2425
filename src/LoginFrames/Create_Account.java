
package LoginFrames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Drivers.DriversResume;
import Drivers.DriversSessionManager;
public class Create_Account extends javax.swing.JFrame {

    public Create_Account() {
        initComponents();
         setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C_OR_D = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnShowPass2 = new javax.swing.JRadioButton();
        btnShowPass = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        edtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        edtConfirmPassword = new javax.swing.JPasswordField();
        btnCreate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbtnCustomer = new javax.swing.JRadioButton();
        rbtnDriver = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3), "Create Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N

        btnShowPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPass2ActionPerformed(evt);
            }
        });

        btnShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Password:");

        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Confirm Password:");

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME NEW USER");

        C_OR_D.add(rbtnCustomer);
        rbtnCustomer.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        rbtnCustomer.setForeground(new java.awt.Color(102, 102, 102));
        rbtnCustomer.setText("Customer");
        rbtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCustomerActionPerformed(evt);
            }
        });

        C_OR_D.add(rbtnDriver);
        rbtnDriver.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        rbtnDriver.setForeground(new java.awt.Color(102, 102, 102));
        rbtnDriver.setText("Driver");
        rbtnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDriverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(edtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edtConfirmPassword)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(rbtnDriver))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rbtnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnShowPass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowPass))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowPass2)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnReset))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCustomer)
                    .addComponent(rbtnDriver))
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPasswordActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        edtUsername.setText("");
        edtPassword.setText("");
        edtConfirmPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed
        //global
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
    public boolean username_checker(String Username){
        boolean isDupe = true;
        
        
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            String username_checker = "SELECT * FROM Users WHERE Username = ?";
            PreparedStatement pstmt = conn.prepareStatement(username_checker);
            pstmt.setString(1, Username);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                isDupe = false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isDupe;
    }
    
    Log_in_Frame LIF = new Log_in_Frame();
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String Username = edtUsername.getText();
        String Password = edtPassword.getText();
        String ConfirmPassword = edtConfirmPassword.getText();
        
        String UserType = null;
        if (rbtnDriver.isSelected()) {
        UserType = "Driver";
        } else if (rbtnCustomer.isSelected()) {
        UserType = "Customer";
        }
        
        if(UserType == null){
            JOptionPane.showMessageDialog(null, "Pick Customer Account or Driver Account");
            return;
        }
           
        if(!username_checker(Username)){
            JOptionPane.showMessageDialog(null, "Username already exist, Please try another Username");
        }else{
            if(!Password.equals(ConfirmPassword)){
            JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match!");
        }else{
                   
        if(UserType.equals("Driver")){
            DriversResume DR = new DriversResume();
            DriversSessionManager.getInstance().setUsername(Username);
            DriversSessionManager.getInstance().setPassword(Password);
            DR.setlblUsername();
            DR.show();
            dispose();
            return;
        }
        
        createAccount(Username, Password, UserType);
            }
        } 
    }//GEN-LAST:event_btnCreateActionPerformed
   
    public void createAccount(String Username, String Password, String UserType){
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            
            String sql = "INSERT INTO Users (Username, Password, UserType)"
                       + "VALUES ( ? , ? , ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);
            pstmt.setString(3, UserType);
            
            int result = pstmt.executeUpdate();
                    if(result > 0){
                        JOptionPane.showMessageDialog(null, "Account Successfully Created!");
                        edtUsername.setText("");
                        edtPassword.setText("");
                        edtConfirmPassword.setText("");
                        
                        LIF.show();
                        dispose();
                    }
            
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    private void btnShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPassActionPerformed
        if(edtPassword.getEchoChar() == (char) 0){
            edtPassword.setEchoChar('*');
        } else {
            edtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnShowPassActionPerformed

    private void btnShowPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPass2ActionPerformed
        if(edtConfirmPassword.getEchoChar() == (char) 0){
            edtConfirmPassword.setEchoChar('*');
        } else {
            edtConfirmPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnShowPass2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
       LIF.show();
       dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void rbtnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDriverActionPerformed


    }//GEN-LAST:event_rbtnDriverActionPerformed

    private void rbtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCustomerActionPerformed

    }//GEN-LAST:event_rbtnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup C_OR_D;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnReset;
    private javax.swing.JRadioButton btnShowPass;
    private javax.swing.JRadioButton btnShowPass2;
    private javax.swing.JPasswordField edtConfirmPassword;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnCustomer;
    private javax.swing.JRadioButton rbtnDriver;
    // End of variables declaration//GEN-END:variables
}
