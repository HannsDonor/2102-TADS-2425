package HOME;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import LoginFrames.Log_in_Frame;

public class LoadObjects extends javax.swing.JFrame {

    public LoadObjects(){
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public LoadObjects(String TruckName, double Capacity) {
        initComponents();
        lblTruckName.setText(TruckName);
        lblCapacity.setText(String.valueOf(Capacity) + " KG");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTotalWeight = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Objects_Table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblTruckName = new javax.swing.JLabel();
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
        btnReset = new javax.swing.JButton();
        btnInsertTruck = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 4, true), "Load Objects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        Objects_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package", "Quantity", "Weight/KG"
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

        jLabel7.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Truck:");

        lblTruckName.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblTruckName.setForeground(new java.awt.Color(102, 102, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true), "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pick-up Address");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Drop-off Address");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Items Here");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Package Name:");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Weight:");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Quantity:");

        btnAddPackage.setBackground(new java.awt.Color(153, 153, 153));
        btnAddPackage.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnAddPackage.setForeground(new java.awt.Color(51, 51, 51));
        btnAddPackage.setText("Add Package");
        btnAddPackage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPackageActionPerformed(evt);
            }
        });

        btnUndoPackage.setBackground(new java.awt.Color(153, 153, 153));
        btnUndoPackage.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnUndoPackage.setForeground(new java.awt.Color(51, 51, 51));
        btnUndoPackage.setText("Undo Package");
        btnUndoPackage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUndoPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoPackageActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 51, 51));
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnInsertTruck.setBackground(new java.awt.Color(153, 153, 153));
        btnInsertTruck.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnInsertTruck.setForeground(new java.awt.Color(51, 51, 51));
        btnInsertTruck.setText("Insert Truck");
        btnInsertTruck.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInsertTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTruckActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtPickUp)
                    .addComponent(edtPackageName)
                    .addComponent(edtDropOff)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUndoPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(btnAddPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertTruck, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUndoPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnInsertTruck))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Capacity:");

        lblCapacity.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblCapacity.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTruckName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addComponent(lblTotalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTruckName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    double Capacity = SessionManager.getInstance().getCapacity();
    
    if(model.getRowCount() >= 20){
        JOptionPane.showMessageDialog(null, "Truck Can only Carry 20 rows");
        return;
    }
    
    if(edtPackageName.getText().isEmpty() && edtQuantity.getText().isEmpty() && edtWeight.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please Fill All the Fields");
        return;
    }
    
    String PackageName = edtPackageName.getText();
    int Quantity = Integer.parseInt(edtQuantity.getText());
    double Weight = Double.parseDouble(edtWeight.getText());
    
    double currentTotalWeight = SessionManager.getInstance().getCurrentCapacity();
    double TotalWeight = Quantity * Weight;
    currentTotalWeight += TotalWeight;
    
    if(currentTotalWeight > Capacity){
        JOptionPane.showMessageDialog(null, "Exceeded Max Truck Capacity! MAX CAPACITY : " + Capacity);
        return;
    }
    
    SessionManager.getInstance().setCurrentCapacity(currentTotalWeight);
      
    lblTotalWeight.setText("Total Weight: " + currentTotalWeight + " kg");
    
    
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
            Home home = new Home();
            home.show();
            dispose();
        }                   
    }//GEN-LAST:event_btnInsertTruckActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      int result = JOptionPane.showConfirmDialog(null,
                                    "Back to Truck Table?",
                                    "CONFIRM",
                                    JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){     
        Trucks_Table TT = new Trucks_Table();
        TT.displayTrucks();
        TT.show();
        dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        edtPackageName.setText("");
        edtWeight.setText("");
        edtQuantity.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            Deliveries(PickUpAddress, DropOffAddress, "Pending Driver", TruckID, UserID);
            double loadWeight = SessionManager.getInstance().getCurrentCapacity();
            UpdateTruckStatus("In Service", TruckID, loadWeight);
        }
    }

       
    public void TransferToDBMS(String PackageName, double Weight, int Quantity, int UserID, int TruckID){
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO Package (PackageName, Weight, Quantity, UserID, TruckID, Status)"
                       + "VALUES (? , ? , ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, PackageName);
            pstmt.setDouble(2, Weight);
            pstmt.setInt(3, Quantity);
            pstmt.setInt(4, UserID);
            pstmt.setInt(5, TruckID);
            pstmt.setString(6, "Pending");
            int rowsAffected = pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    public void Deliveries(String PickUp, String DropOff, String Status, int TruckID, int UserID){
         
        //CHECK DUPLICATE
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
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null, "Ready To Deliver!");
    }
    
    public void UpdateTruckStatus(String Status, int TruckID, double Loadcapacity){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET Status = ?, CurrentCapacity = ? WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Status);
            pstmt.setDouble(2, Loadcapacity);
            pstmt.setInt(3, TruckID);
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
                String TruckName = SessionManager.getInstance().getTruckName();
                double Capacity = SessionManager.getInstance().getCapacity();
                new LoadObjects(TruckName, Capacity).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Objects_Table;
    private javax.swing.JButton btnAddPackage;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsertTruck;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUndoPackage;
    private javax.swing.JTextField edtDropOff;
    private javax.swing.JTextField edtPackageName;
    private javax.swing.JTextField edtPickUp;
    private javax.swing.JTextField edtQuantity;
    private javax.swing.JTextField edtWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblTotalWeight;
    private javax.swing.JLabel lblTruckName;
    // End of variables declaration//GEN-END:variables
}
