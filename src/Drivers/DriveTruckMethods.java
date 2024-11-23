package Drivers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Drivers.DriversSessionManager;
import HOME.SessionManager;
public class DriveTruckMethods {
    String url = "jdbc:mysql://localhost:3306/myproject";
    String user = "root";
    String pass = "";    
    
    public boolean ifExist(int TruckID){
        boolean found = false;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Trucks";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int CompareTruckID = rs.getInt("TruckID");
                    if(TruckID == CompareTruckID){
                        found = true;
                    }
            }
            
            if(!found){
                JOptionPane.showMessageDialog(null, "Truck does not exist");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }


    public boolean ifExist(int TruckID, String TruckSize){
        boolean found = false;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM Trucks WHERE TruckSize = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, TruckSize);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int CompareTruckID = rs.getInt("TruckID");
                    if(TruckID == CompareTruckID){
                        found = true;
                    }
            }
            
            if(!found){
                JOptionPane.showMessageDialog(null, "Truck does not exist");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }
    
    public boolean CheckTruckDriverID(int TruckID){
        boolean assigned = false;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT DriverID FROM Trucks WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                int checkDriverID = rs.getInt("DriverID");
                    if(checkDriverID == 0){
                        assigned = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "A Driver is Already Assigned on this Truck");
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return assigned;
    }
    
    public void DriveThisTruck(int TruckID, int DriverID){
         try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET DriverID = ? WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, DriverID);
            pstmt.setInt(2, TruckID);
            int ra = pstmt.executeUpdate();
            
            if(ra > 0){
                JOptionPane.showMessageDialog(null, "Driving Truck " + TruckID);
                updatePackageStatus(TruckID);
                updateDeliveryStatus(TruckID);
                updateTrucksDriverID(TruckID, DriverID);
                updateDriversTruckID(TruckID, DriverID);
            }
         }catch(Exception e){
            e.printStackTrace();
         }
    }
    
    public void updatePackageStatus(int TruckID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Package SET Status = ? WHERE TruckID = ? AND Status = 'Pending'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Out for Delivery");
            pstmt.setInt(2, TruckID);
            int ra = pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateDeliveryStatus(int TruckID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Deliveries SET Status = 'Out for Delivery' WHERE TruckID = ? AND Status = 'Pending Driver';";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
    
    public void updateTrucksDriverID(int TruckID, int DriverID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET DriverID = ? WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, DriverID);
            pstmt.setInt(2, TruckID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
        public void updateDriversTruckID(int TruckID, int DriverID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE DriversInfo SET TruckID = ? WHERE DriverID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            pstmt.setInt(2, DriverID);
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
        public boolean checkDriver(int DriverID){
            boolean assigned = false;
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT DriverID FROM Trucks";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int checkDriverID = rs.getInt("DriverID");
                    if(DriverID == checkDriverID){
                        assigned = true;
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(assigned){
            JOptionPane.showMessageDialog(null, "You can only Drive 1 Truck at a Time");
        }
            return assigned;
        }
        
    public void leaveTruck(int DriverID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE Trucks SET DriverID = null WHERE DriverID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, DriverID);
            int ra = pstmt.executeUpdate();
            
            if(ra > 0){
                leaveTruck2(DriverID);
                JOptionPane.showMessageDialog(null, "Left Truck");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void leaveTruck2(int DriverID){
                try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "UPDATE DriversInfo SET TruckID = null WHERE DriverID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, DriverID);
            int ra = pstmt.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
    
    public boolean isDeliveryComplete(int TruckID){
        boolean isComplete = false;
        
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Status FROM Deliveries WHERE TruckID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, TruckID);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                String checkStatus = rs.getString("Status");
                    if("Complete".equals(checkStatus)){
                        isComplete = true;
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isComplete;
    }
    
    public void AssignedTruck(int DriverID){
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT TruckID FROM Trucks WHERE DriverId = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, DriverID);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                int getTruckID = rs.getInt("TruckID");
                DriversSessionManager.getInstance().setAssignedTruck(getTruckID);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean isTruckEmpty(int TruckID){
        boolean isEmpty = true;
        
        try{
            try{
                Connection conn = DriverManager.getConnection(url, user, pass);
                String sql = "SELECT CurrentCapacity FROM Trucks WHERE TruckID = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, TruckID);
                ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                double getCurrentCapacity = rs.getDouble("CurrentCapacity");
                    if(getCurrentCapacity == 0){
                        isEmpty = true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isEmpty;
    }
}
