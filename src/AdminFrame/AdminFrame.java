
package AdminFrame;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

import LoginFrames.Log_in_Frame;

public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
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

        btnLogout = new javax.swing.JButton();
        btnAddTrucks = new javax.swing.JButton();
        btnCompleteDeliveries = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveriesTable = new javax.swing.JTable();
        btnDeleteTrucks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewDeliveries = new javax.swing.JButton();
        btnViewTrucks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAddTrucks.setText("Add Trucks");
        btnAddTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTrucksActionPerformed(evt);
            }
        });

        btnCompleteDeliveries.setText("Complete Deliveries");
        btnCompleteDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteDeliveriesActionPerformed(evt);
            }
        });

        DeliveriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Truck ID", "Pick Up", "Drop Off", "Status", "Customer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(DeliveriesTable);
        if (DeliveriesTable.getColumnModel().getColumnCount() > 0) {
            DeliveriesTable.getColumnModel().getColumn(0).setResizable(false);
            DeliveriesTable.getColumnModel().getColumn(1).setResizable(false);
            DeliveriesTable.getColumnModel().getColumn(2).setResizable(false);
            DeliveriesTable.getColumnModel().getColumn(3).setResizable(false);
            DeliveriesTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnDeleteTrucks.setText("Delete Trucks");
        btnDeleteTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTrucksActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trucking And Delivery System");

        btnViewDeliveries.setText("View Deliveries");
        btnViewDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDeliveriesActionPerformed(evt);
            }
        });

        btnViewTrucks.setText("View Trucks");
        btnViewTrucks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTrucksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnViewDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteTrucks, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(btnAddTrucks, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnCompleteDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewTrucks, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteTrucks)
                    .addComponent(btnAddTrucks)
                    .addComponent(btnCompleteDeliveries)
                    .addComponent(btnViewDeliveries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewTrucks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String url = "jdbc:mysql://localhost:3306/myproject";
    String user = "root";
    String pass = "";
    private void btnViewDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDeliveriesActionPerformed
        DefaultTableModel model = (DefaultTableModel)DeliveriesTable.getModel();
        model.setRowCount(0);
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT DISTINCT Deliveries.TruckID, Deliveries.PickUpAddress, Deliveries.DropOffAddress, Deliveries.Status, Users.Username\n" +
                         "FROM Deliveries\n" +
                         "INNER JOIN Users ON Users.UserID = Deliveries.UserID\n";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int TruckID = rs.getInt("TruckID");
                String PickUpAddress = rs.getString("PickUpAddress");
                String DropOffAddress = rs.getString("DropOffAddress");
                String Status = rs.getString("Status");
                String Username = rs.getString("Username");
                
                model.addRow(new Object[]{TruckID, PickUpAddress, DropOffAddress, Status, Username});
            }           
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnViewDeliveriesActionPerformed

    public void viewDeliveries(){
        DefaultTableModel model = (DefaultTableModel)DeliveriesTable.getModel();
        model.setRowCount(0);
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT DISTINCT Deliveries.TruckID, Deliveries.PickUpAddress, Deliveries.DropOffAddress, Deliveries.Status, Users.Username\n" +
                         "FROM Deliveries\n" +
                         "INNER JOIN Users ON Users.UserID = Deliveries.UserID\n";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int TruckID = rs.getInt("TruckID");
                String PickUpAddress = rs.getString("PickUpAddress");
                String DropOffAddress = rs.getString("DropOffAddress");
                String Status = rs.getString("Status");
                String Username = rs.getString("Username");
                
                model.addRow(new Object[]{TruckID, PickUpAddress, DropOffAddress, Status, Username});
            }           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void btnAddTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTrucksActionPerformed
        AddTrucks AT = new AddTrucks();
        AT.show();
        dispose();
    }//GEN-LAST:event_btnAddTrucksActionPerformed

    private void btnViewTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTrucksActionPerformed
        ViewTrucks VT = new ViewTrucks();
        VT.viewTrucksTable();
        VT.show();
    }//GEN-LAST:event_btnViewTrucksActionPerformed

    private void btnCompleteDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteDeliveriesActionPerformed
        CompleteDeliveries CD = new CompleteDeliveries();
        CD.show();
    }//GEN-LAST:event_btnCompleteDeliveriesActionPerformed

    private void btnDeleteTrucksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTrucksActionPerformed
        DeleteTrucks DT = new DeleteTrucks();
        ViewTrucks VT = new ViewTrucks();
        VT.viewTrucksTable();
        VT.show();
        DT.show();
    }//GEN-LAST:event_btnDeleteTrucksActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int y = JOptionPane.showConfirmDialog(
                null,
                "Log out?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);
        
        if(y == JOptionPane.YES_OPTION){
            Log_in_Frame LOF = new Log_in_Frame();
            LOF.show();
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeliveriesTable;
    private javax.swing.JButton btnAddTrucks;
    private javax.swing.JButton btnCompleteDeliveries;
    private javax.swing.JButton btnDeleteTrucks;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewDeliveries;
    private javax.swing.JButton btnViewTrucks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
