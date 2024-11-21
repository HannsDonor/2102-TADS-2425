package AdminFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
public class Reusable {
    String url = "jdbc:mysql://localhost:3306/myproject";
    String user = "root";
    String pass = "";
    
    public void AddTrucks(String TruckName, String TruckSize, double Capacity){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO Trucks (TruckName, Capacity, Status, TruckSize) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, TruckName);
            pstmt.setDouble(2, Capacity);
            pstmt.setString(3, "Available");
            pstmt.setString(4, TruckSize);
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
    
    public void UpdateTruckStatus(int TruckID, String Status){
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
    
    public void updateDeliveryStatus(int TruckID, String Status){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Deliveries SET Status = ? WHERE TruckID = ? AND Status = 'Out for Delivery'";
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
            String sql = "UPDATE Package SET Status = ? WHERE TruckID = ? AND Status = 'Out for Delivery'";
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
}
