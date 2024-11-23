
package Drivers;

public class DriversSessionManager {
    private static DriversSessionManager instance;
    
    private String username;
    private String password;
    private String gender;
    private String address;
    private int userID;
    private int driverID;
    private int AssignedTruck;

    private DriversSessionManager() {}

    public static DriversSessionManager getInstance() {
        if (instance == null) {
            instance = new DriversSessionManager();
        }
        return instance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setGender(String Gender){
        this.gender = Gender;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setAddress(String Address){
        this.address = Address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setUserID(int UserID){
        this.userID = UserID;
    }
    
    public int getUserID(){
        return this.userID;
    }
    
    public void setDriverID(int DriverID){
        this.driverID = DriverID;
    }
    
    public int getDriverID(){
        return this.driverID;
    }
    
    public void setAssignedTruck(int TruckID){
        this.AssignedTruck = TruckID;
    }
    
    public int getAssignedTruck(){
        return this.AssignedTruck;
    }
    
    public void clearSession() {
        this.username = "";
        this.password = "";
        this.gender = "";
        this.address = "";
        this.userID = 0;
        this.driverID = 0;
        this.AssignedTruck = 0;
    }   

    public void display() {
        System.out.println("Username : " + this.username);
        System.out.println("Password : " + this.password);
    }
}
