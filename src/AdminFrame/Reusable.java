package AdminFrame;
import HOME.ViewDeliveries.ViewDeliveries;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.HashSet;
import java.util.Set;
public class Reusable {
    String url = "jdbc:mysql://localhost:3306/myproject";
    String user = "root";
    String pass = "";
    
    public void AddTrucks(String TruckName, String TruckSize, double Capacity, String LicensePlate){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO Trucks (TruckName, Capacity, Status, TruckSize, LicensePlate) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, TruckName);
            pstmt.setDouble(2, Capacity);
            pstmt.setString(3, "Available");
            pstmt.setString(4, TruckSize);
            pstmt.setString(5, LicensePlate);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Trucks Added");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add Trucks");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean RecieveAllPackage(int UserID){
        Set<Integer> TruckIDs = new HashSet<>();
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckID FROM Package WHERE UserID = ? AND Status = 'Delivered to Doorstep'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, UserID);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int getTruckID = rs.getInt("TruckID");
                TruckIDs.add(getTruckID);
            }
            
            for (int truckID : TruckIDs) {
            UpdateTruckStatus(truckID, "Available", 0);
            updateDeliveryStatus(truckID, "Completed");
            updatePackageStatus(truckID, "Delivered");
            }
            
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean CheckTruckName(String TruckName){
        boolean isDupe = false;
        
        String url = "jdbc:mysql://localhost:3306/myproject";
        String user = "root";
        String pass = "";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckName FROM Trucks";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                String CheckTruckName = rs.getString("TruckName");
                    if(TruckName.equals(CheckTruckName)){
                        isDupe = true;
                        break;
                    }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isDupe;
    }
    
    public boolean checkTruckID(int TruckID){
        boolean found = false;

        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT DISTINCT TruckID FROM Deliveries";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int CompareTruckID = rs.getInt("TruckID");
                    if(TruckID == CompareTruckID){
                        found = true;
                    } 
                }
        }catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }
    
    public boolean checkAllTruckID(int TruckID){
        boolean found = false;
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckID FROM Trucks";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int CompareTruckID = rs.getInt("TruckID");
                    if(TruckID == CompareTruckID){
                        found = true;
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }
    
    public void UpdateTruckStatus(int TruckID, String Status, double ResetCapacity){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET Status = ?, CurrentCapacity = ? WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Status);
            pstmt.setDouble(2, ResetCapacity);
            pstmt.setInt(3, TruckID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateDeliveryStatus(int TruckID, String Status){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Deliveries SET Status = ? WHERE TruckID = ? AND Status IN ('Out for Delivery', 'Pending Driver')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Status);
            pstmt.setInt(2, TruckID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean CheckDeliveries(int TruckID){
        boolean isCC = true;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Deliveries WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                String checkStatus = rs.getString("Status");
                if(!"Out for Delivery".equals(checkStatus)){
                    isCC = false;
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isCC;
    }
    
    public void updatePackageStatus(int TruckID, String Status){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Package SET Status = ? WHERE TruckID = ? AND Status IN ('Delivered to Doorstep', 'Out for Delivery', 'Pending')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Status);
            pstmt.setInt(2, TruckID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteTruck(int TruckID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "DELETE FROM Trucks WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            int rowsAffected = pstmt.executeUpdate();
            
            if(rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Truck " + TruckID + " Deleted");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean ifPending(int TruckID){
         boolean isPending = false;
         try{
             Connection conn = DriverManager.getConnection(url, user, pass);
             String sql = "SELECT * FROM Deliveries WHERE TruckID = ?";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setInt(1, TruckID);
             ResultSet rs = pstmt.executeQuery();
             
             if(rs.next()){
                 String Status = rs.getString("Status");
                    if("Pending Driver".equals(Status)){
                        isPending = true;
                    }
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return isPending;
    }
}
