package HOME.ViewDeliveries;

import AdminFrame.Reusable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.Set;

import HOME.SessionManager;
import HOME.Home;
import HOME.LoadObjects;

public class ViewDeliveries extends javax.swing.JFrame {

    public ViewDeliveries() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewDeliveries = new javax.swing.JTable();
        CancelDelivery = new javax.swing.JButton();
        strEnterTruckID = new javax.swing.JLabel();
        edtCancelTruckID = new javax.swing.JTextField();
        btnCompletedDeliveries = new javax.swing.JButton();
        DisplayDeliveries = new javax.swing.JButton();
        btnDisplayCancelDeliveries = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRecieve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 4, true), "View Deliveries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        ViewDeliveries.setBackground(new java.awt.Color(102, 102, 102));
        ViewDeliveries.setForeground(new java.awt.Color(255, 255, 255));
        ViewDeliveries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TruckID", "Package", "Status", "Quantity", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewDeliveries);
        if (ViewDeliveries.getColumnModel().getColumnCount() > 0) {
            ViewDeliveries.getColumnModel().getColumn(0).setResizable(false);
            ViewDeliveries.getColumnModel().getColumn(1).setResizable(false);
            ViewDeliveries.getColumnModel().getColumn(2).setResizable(false);
            ViewDeliveries.getColumnModel().getColumn(3).setResizable(false);
            ViewDeliveries.getColumnModel().getColumn(4).setResizable(false);
        }

        CancelDelivery.setBackground(new java.awt.Color(153, 153, 153));
        CancelDelivery.setForeground(new java.awt.Color(255, 255, 255));
        CancelDelivery.setText("Cancel Delivery");
        CancelDelivery.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelDeliveryActionPerformed(evt);
            }
        });

        strEnterTruckID.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        strEnterTruckID.setForeground(new java.awt.Color(102, 102, 102));
        strEnterTruckID.setText("Enter Truck ID:");

        edtCancelTruckID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCancelTruckIDActionPerformed(evt);
            }
        });

        btnCompletedDeliveries.setBackground(new java.awt.Color(153, 153, 153));
        btnCompletedDeliveries.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletedDeliveries.setText("Completed Deliveries");
        btnCompletedDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompletedDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedDeliveriesActionPerformed(evt);
            }
        });

        DisplayDeliveries.setBackground(new java.awt.Color(153, 153, 153));
        DisplayDeliveries.setForeground(new java.awt.Color(255, 255, 255));
        DisplayDeliveries.setText("View Delivery Status");
        DisplayDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DisplayDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayDeliveriesActionPerformed(evt);
            }
        });

        btnDisplayCancelDeliveries.setBackground(new java.awt.Color(153, 153, 153));
        btnDisplayCancelDeliveries.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayCancelDeliveries.setText("Cancelled Deliveries");
        btnDisplayCancelDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplayCancelDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayCancelDeliveriesActionPerformed(evt);
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

        btnRecieve.setBackground(new java.awt.Color(153, 153, 153));
        btnRecieve.setForeground(new java.awt.Color(255, 255, 255));
        btnRecieve.setText("Recieve");
        btnRecieve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecieveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(strEnterTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCancelTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DisplayDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCompletedDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDisplayCancelDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CancelDelivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecieve, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(DisplayDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisplayCancelDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCompletedDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strEnterTruckID)
                            .addComponent(edtCancelTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecieve)
                    .addComponent(btnBack))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String url = "jdbc:mysql://localhost:3306/myproject";
    String user = "root";
    String pass = "";
    
    
    private void DisplayDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayDeliveriesActionPerformed
    DefaultTableModel model = (DefaultTableModel) ViewDeliveries.getModel();
    model.setRowCount(0);

    int UserID = SessionManager.getInstance().getUserID();
    
    try{
        Connection conn = DriverManager.getConnection(url, user, pass);
        String sql = "SELECT * FROM Package WHERE UserID = ? AND Status IN ('Out for Delivery', 'Pending', 'Delivered to Doorstep')";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, UserID);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
                    String packageName = rs.getString("PackageName");
                    int quantity = rs.getInt("Quantity");
                    String status = rs.getString("Status");
                    int truckID = rs.getInt("TruckID");
                    String Time = rs.getString("TimeCreated");

                    model.addRow(new Object[]{truckID, packageName, status, quantity, Time});
                }
    }catch(Exception e){
        e.printStackTrace();
    }    
    }//GEN-LAST:event_DisplayDeliveriesActionPerformed
  
    public void displayPackage(){
    DefaultTableModel model = (DefaultTableModel) ViewDeliveries.getModel();
    model.setRowCount(0);

    int UserID = SessionManager.getInstance().getUserID();
    
    try{
        Connection conn = DriverManager.getConnection(url, user, pass);
        String sql = "SELECT * FROM Package WHERE UserID = ? AND Status IN ('Out for Delivery', 'Pending', 'Delivered to Doorstep')";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, UserID);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
                    String packageName = rs.getString("PackageName");
                    int quantity = rs.getInt("Quantity");
                    String status = rs.getString("Status");
                    int truckID = rs.getInt("TruckID");
                    String Time = rs.getString("TimeCreated");

                    model.addRow(new Object[]{truckID, packageName, status, quantity, Time});
                }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      Home H = new Home();
      String Username = SessionManager.getInstance().getUsername();
      H.setWelcomeUser(Username);
      H.show();
      dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDisplayCancelDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayCancelDeliveriesActionPerformed
    DefaultTableModel model = (DefaultTableModel) ViewDeliveries.getModel();
    model.setRowCount(0);

    int UserID = SessionManager.getInstance().getUserID();
    
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Package WHERE UseriD = ? AND Status = 'Cancelled'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                        String packageName = rs.getString("PackageName");
                        int quantity = rs.getInt("Quantity");
                        String status = rs.getString("Status");
                        int truckID = rs.getInt("TruckID");
                        String Time = rs.getString("TimeCreated");

                        model.addRow(new Object[]{truckID, packageName, status, quantity, Time});
                    }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDisplayCancelDeliveriesActionPerformed
    
    
    private void CancelDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelDeliveryActionPerformed
        String TruckIDText = edtCancelTruckID.getText().trim();
            

        if(TruckIDText.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the text fields");
            return;
        }
        
        int TruckID = Integer.parseInt(TruckIDText);
        int UserID = SessionManager.getInstance().getUserID();
        
        
        if(!checkCancel(UserID, TruckID)){
            JOptionPane.showMessageDialog(null, "Truck not found");
            return;
        }

        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckID, Status FROM Package WHERE UserID = ? AND Status IN ('Out for Delivery', 'Pending')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();
            
            boolean TruckFound = false;

            while(rs.next()){
                int CompareTruckID = rs.getInt("TruckID");
                if(TruckID == CompareTruckID){
                    
                    updatePackageStatus(TruckID, UserID);
                    updateDeliveryStatus(TruckID, UserID);
                    updateTruckStatus(TruckID);
                    TruckFound = true;
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        displayPackage();
    }//GEN-LAST:event_CancelDeliveryActionPerformed
    
    public boolean checkCancel(int UserID, int TruckID){
        boolean Found = false;
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Package WHERE UserID = ? AND TruckID = ? AND Status IN ('Pending', 'Out for Delivery')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            pstmt.setInt(2, TruckID);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Found = true;
                    }
            }  
        }catch(Exception e){
            e.printStackTrace();
        }
        return Found;
    }
    
    public boolean CheckIfCancel(int UserID){
        boolean Claim = false;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Status FROM Package WHERE UserID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                String Status = rs.getString("Status");
                if("Delivered to Doorstep".equals(Status)){
                    Claim = true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return Claim;
    }
    
    private void btnCompletedDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedDeliveriesActionPerformed
    DefaultTableModel model = (DefaultTableModel) ViewDeliveries.getModel();
    model.setRowCount(0);

    int UserID = SessionManager.getInstance().getUserID();
    
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Package WHERE UseriD = ? AND Status = 'Delivered'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                        String packageName = rs.getString("PackageName");
                        int quantity = rs.getInt("Quantity");
                        String status = rs.getString("Status");
                        int truckID = rs.getInt("TruckID");
                        String Time = rs.getString("TimeCreated");

                        model.addRow(new Object[]{truckID, packageName, status, quantity, Time});
                    }
        }catch(Exception e){
            e.printStackTrace();
        }  
    }//GEN-LAST:event_btnCompletedDeliveriesActionPerformed

    
    public void displayDelivered(){
    DefaultTableModel model = (DefaultTableModel) ViewDeliveries.getModel();
    model.setRowCount(0);

    int UserID = SessionManager.getInstance().getUserID();
    
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Package WHERE UseriD = ? AND Status = 'Delivered'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                        String packageName = rs.getString("PackageName");
                        int quantity = rs.getInt("Quantity");
                        String status = rs.getString("Status");
                        int truckID = rs.getInt("TruckID");
                        String Time = rs.getString("TimeCreated");

                        model.addRow(new Object[]{truckID, packageName, status, quantity, Time});
                    }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    private void edtCancelTruckIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCancelTruckIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCancelTruckIDActionPerformed

    private void btnRecieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecieveActionPerformed
        int UserID = SessionManager.getInstance().getUserID();
        int TruckID = SessionManager.getInstance().getTruckID();
        
        if(!CheckIfCancel(UserID)){
            JOptionPane.showMessageDialog(null, "No package to Recieved yet");
            return;
        }
        
        Reusable r = new Reusable();
        if(r.RecieveAllPackage(UserID)){
            JOptionPane.showMessageDialog(null, "Package Recieved!");
            displayPackage();
            return;
            
        } else {
            JOptionPane.showMessageDialog(null, "Something went Wrong");
            return;
        }
    }//GEN-LAST:event_btnRecieveActionPerformed

    public void updateDeliveryStatus(int TruckID, int UserID){
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String CancelStmt = "UPDATE Deliveries SET Status = 'Cancelled' WHERE TruckID = ? AND UserID = ? AND Status IN ('Out for Delivery', 'Pending Driver');";

            PreparedStatement pstmt = conn.prepareStatement(CancelStmt);
            pstmt.setInt(1, TruckID);
            pstmt.setInt(2, UserID);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Cancelled Successfully!");
                edtCancelTruckID.setText("");
            }
        }catch(Exception e){
            e.printStackTrace();
        
        }
    }
    
    public void updateTruckStatus(int TruckID){
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String updateTruck = "UPDATE Trucks SET Status = 'Available', CurrentCapacity = 0 WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateTruck);
            pstmt.setInt(1, TruckID);
            int rowsAffected = pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
    public void updatePackageStatus(int TruckID, int UserID){
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Package SET Status = 'Cancelled' WHERE UserID = ? AND TruckID = ? AND Status IN ('Out for Delivery', 'Pending');";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            pstmt.setInt(2, TruckID);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Cancelled Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Something Went Wrong!");
            }

        }catch(Exception e){
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(ViewDeliveries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDeliveries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDeliveries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDeliveries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeliveries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelDelivery;
    private javax.swing.JButton DisplayDeliveries;
    private javax.swing.JTable ViewDeliveries;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompletedDeliveries;
    private javax.swing.JButton btnDisplayCancelDeliveries;
    private javax.swing.JButton btnRecieve;
    private javax.swing.JTextField edtCancelTruckID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel strEnterTruckID;
    // End of variables declaration//GEN-END:variables
}
