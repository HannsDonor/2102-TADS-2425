package HOME.ViewDeliveries;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 4, true), "View Deliveries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        ViewDeliveries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TruckID", "Package", "Status", "Quantity", "Time", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            ViewDeliveries.getColumnModel().getColumn(5).setResizable(false);
        }

        CancelDelivery.setBackground(new java.awt.Color(153, 153, 153));
        CancelDelivery.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        CancelDelivery.setForeground(new java.awt.Color(51, 51, 51));
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
        btnCompletedDeliveries.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnCompletedDeliveries.setForeground(new java.awt.Color(51, 51, 51));
        btnCompletedDeliveries.setText("Completed Deliveries");
        btnCompletedDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompletedDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedDeliveriesActionPerformed(evt);
            }
        });

        DisplayDeliveries.setBackground(new java.awt.Color(153, 153, 153));
        DisplayDeliveries.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        DisplayDeliveries.setForeground(new java.awt.Color(51, 51, 51));
        DisplayDeliveries.setText("View Delivery Status");
        DisplayDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DisplayDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayDeliveriesActionPerformed(evt);
            }
        });

        btnDisplayCancelDeliveries.setBackground(new java.awt.Color(153, 153, 153));
        btnDisplayCancelDeliveries.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnDisplayCancelDeliveries.setForeground(new java.awt.Color(51, 51, 51));
        btnDisplayCancelDeliveries.setText("Cancelled Deliveries");
        btnDisplayCancelDeliveries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisplayCancelDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayCancelDeliveriesActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(strEnterTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCancelTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DisplayDeliveries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisplayCancelDeliveries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompletedDeliveries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DisplayDeliveries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisplayCancelDeliveries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCompletedDeliveries)
                        .addGap(92, 92, 92)
                        .addComponent(CancelDelivery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strEnterTruckID)
                            .addComponent(edtCancelTruckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
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
        String sql = "SELECT * FROM Package WHERE UserID = ? AND Status IN ('Out for Delivery', 'Pending')";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, UserID);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
                    String packageName = rs.getString("PackageName");
                    int quantity = rs.getInt("Quantity");
                    String status = rs.getString("Status");
                    int truckID = rs.getInt("TruckID");
                    String Time = rs.getString("TimeCreated");
                    String Date = rs.getString("DateCreated");

                    model.addRow(new Object[]{truckID, packageName, status, quantity, Time, Date});
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
        String sql = "SELECT * FROM Package WHERE UserID = ? AND Status IN ('Out for Delivery', 'Pending')";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, UserID);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
                    String packageName = rs.getString("PackageName");
                    int quantity = rs.getInt("Quantity");
                    String status = rs.getString("Status");
                    int truckID = rs.getInt("TruckID");
                    String Time = rs.getString("TimeCreated");
                    String Date = rs.getString("DateCreated");

                    model.addRow(new Object[]{truckID, packageName, status, quantity, Time, Date});
                }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      Home H = new Home();
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

                        model.addRow(new Object[]{truckID, packageName, status, quantity});
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
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckID, Status FROM Package WHERE UserID = ? AND Status = 'Out for Delivery';";
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
                
                if(!TruckFound){
                    JOptionPane.showMessageDialog(null, "Truck not found");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_CancelDeliveryActionPerformed

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

                        model.addRow(new Object[]{truckID, packageName, status, quantity});
                    }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCompletedDeliveriesActionPerformed

    private void edtCancelTruckIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCancelTruckIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCancelTruckIDActionPerformed

    public void updateDeliveryStatus(int TruckID, int UserID){
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String CancelStmt = "UPDATE Deliveries SET Status = 'Cancelled' WHERE TruckID = ? AND UserID = ? AND Status = 'Out for Delivery'";

            PreparedStatement pstmt = conn.prepareStatement(CancelStmt);
            pstmt.setInt(1, TruckID);
            pstmt.setInt(2, UserID);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Cancelled Successfully!");
                edtCancelTruckID.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Truck Not Found");
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
            String updateTruck = "UPDATE Trucks SET Status = 'Available' WHERE TruckID = ?";
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
            String sql = "UPDATE Package SET Status = 'Cancelled' WHERE UserID = ? AND TruckID = ? AND Status = 'Out for Delivery'";
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
    private javax.swing.JTextField edtCancelTruckID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel strEnterTruckID;
    // End of variables declaration//GEN-END:variables
}
