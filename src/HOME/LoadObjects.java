/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HOME;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import LoginFrames.Log_in_Frame;

/**
 *
 * @author donor
 */
public class LoadObjects extends javax.swing.JFrame {

    /**
     * Creates new form LoadObjects
     */
    public LoadObjects() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtPickUp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtDropOff = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtPackageName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtWeight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtQuantity = new javax.swing.JTextField();
        btnAddPackage = new javax.swing.JButton();
        btnUndoPackage = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnInsertTruck = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Objects_Table = new javax.swing.JTable();
        lblTotalWeight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setText("Pick-up Address");

        jLabel2.setText("Drop-off Address");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Items Here");

        jLabel4.setText("Package Name:");

        jLabel5.setText("Weight:");

        jLabel6.setText("Quantity:");

        btnAddPackage.setText("Add Package");
        btnAddPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPackageActionPerformed(evt);
            }
        });

        btnUndoPackage.setText("Undo Package");
        btnUndoPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoPackageActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");

        btnInsertTruck.setText("Insert Truck");
        btnInsertTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTruckActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtPickUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(edtPackageName)
                    .addComponent(edtDropOff)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(btnAddPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(edtQuantity)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertTruck, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUndoPackage))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtDropOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(edtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPackage)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUndoPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnInsertTruck))
                .addContainerGap())
        );

        Objects_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Package", "Quantity", "Weight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Objects_Table);
        if (Objects_Table.getColumnModel().getColumnCount() > 0) {
            Objects_Table.getColumnModel().getColumn(0).setResizable(false);
        }

        lblTotalWeight.setText("TOTAL WEIGHT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(lblTotalWeight)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //THIS AREA IS THE STRING CONNECTOR
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
    //THIS AREA STORES THE ADDED ROW INCASE OF UNDO
    private Object[] LastAddedRow = null;

    // USE THIS TO DISPLAY THE TOTAL OF WHOLE TABLE PACKAGE WEIGHT
    private void btnAddPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPackageActionPerformed
    DefaultTableModel model = (DefaultTableModel)Objects_Table.getModel();
    
    if(model.getRowCount() >= 20){
        JOptionPane.showMessageDialog(null, "This Truck Can only Carry 20 rows");
        return;
    }
    
    if(edtPackageName.getText().isEmpty() && edtQuantity.getText().isEmpty() && edtWeight.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please Fill All the Fields");
        return;
    }
    
    String PackageName = edtPackageName.getText();
    int Quantity = Integer.parseInt(edtQuantity.getText());
    double Weight = Double.parseDouble(edtWeight.getText());
    
    
    double TotalWeight = Quantity * Weight;
    
    Object[] rowData = {PackageName, Quantity, TotalWeight};
    model.insertRow(0, rowData);
    LastAddedRow = rowData;
    
    edtPackageName.setText("");
    edtQuantity.setText("");
    edtWeight.setText("");
    }//GEN-LAST:event_btnAddPackageActionPerformed

    private void btnUndoPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoPackageActionPerformed
        DefaultTableModel model = (DefaultTableModel)Objects_Table.getModel();
        int rowCount = model.getRowCount();
    
        if(LastAddedRow != null){
            model.removeRow(0);
            }else{
            JOptionPane.showMessageDialog(null, "Table is Empty");
            }
    }//GEN-LAST:event_btnUndoPackageActionPerformed

    private void btnInsertTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTruckActionPerformed
        DefaultTableModel model = (DefaultTableModel)Objects_Table.getModel();
      
        if(model.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is Empty, Please add some Package");
            return;
        }
        int result = JOptionPane.showConfirmDialog(
                     null, 
                     "Confirm Load List?", 
                     "CONFIRM", 
                     JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            TableToDBMS();
           
        }                   
    }//GEN-LAST:event_btnInsertTruckActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
    }//GEN-LAST:event_jButton5ActionPerformed

    public void TableToDBMS(){
        DefaultTableModel model = (DefaultTableModel)Objects_Table.getModel();
                      
        for(int i = 0; i < model.getRowCount(); i++){
            String PackageName = (String) model.getValueAt(i, 0);
            int Quantity = (Integer) model.getValueAt(i, 1);
            double Weight = (Double) model.getValueAt(i, 2);
            
            
            int UserID = SessionManager.getInstance().getUserID();
            int TruckID = SessionManager.getInstance().getTruckID();
            
            TransferToDBMS(PackageName, Weight, Quantity, UserID, TruckID);
            
            String PickUpAddress = edtPickUp.getText();
            String DropOffAddress = edtDropOff.getText();
            Deliveries(PickUpAddress, DropOffAddress, "Out For Delivery", TruckID, UserID);
            UpdateTruckStatus("In Service", TruckID);
        }
    }
    
    public void test1(String PackageName, int Quantity, double Weight, int gUserID, int gTruckID){
        System.out.print(" PackageName: " + PackageName);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Weight: " + Weight);
        System.out.println("UserID: " + gUserID);
        System.out.println("TruckID :" + gTruckID);
    }
    
    
    public void TransferToDBMS(String PackageName, double Weight, int Quantity, int UserID, int TruckID){
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO Package (PackageName, Weight, Quantity, UserID, TruckID)"
                       + "VALUES (? , ? , ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, PackageName);
            pstmt.setDouble(2, Weight);
            pstmt.setInt(3, Quantity);
            pstmt.setInt(4, UserID);
            pstmt.setInt(5, TruckID);
            int rowsAffected = pstmt.executeUpdate();
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, PackageName + Weight + Quantity + UserID + TruckID);
            }else{
                JOptionPane.showMessageDialog(null, "Failed To Add Package");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    public void Deliveries(String PickUp, String DropOff, String Status, int TruckID, int UserID){
         
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO Deliveries (PickUpAddress, DropOffAddress, Status, TruckID, UserID)"
                       + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, PickUp);
            pstmt.setString(2, DropOff);
            pstmt.setString(3, Status);
            pstmt.setInt(4, TruckID);
            pstmt.setInt(5, UserID);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Ready to Deliver");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void UpdateTruckStatus(String Status, int TruckID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET Status = ? WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Status);
            pstmt.setInt(2, TruckID);
            pstmt.executeUpdate();
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
            java.util.logging.Logger.getLogger(LoadObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadObjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadObjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Objects_Table;
    private javax.swing.JButton btnAddPackage;
    private javax.swing.JButton btnInsertTruck;
    private javax.swing.JButton btnUndoPackage;
    private javax.swing.JTextField edtDropOff;
    private javax.swing.JTextField edtPackageName;
    private javax.swing.JTextField edtPickUp;
    private javax.swing.JTextField edtQuantity;
    private javax.swing.JTextField edtWeight;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalWeight;
    // End of variables declaration//GEN-END:variables
}
