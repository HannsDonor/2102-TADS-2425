
package HOME;

public class SessionManager {
    private static SessionManager instance;
    private int userID;
    private int truckID;
    private double capacity;
    private String TruckName;
    private String TruckSize;
    
    private SessionManager() {}
    
    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
    }
     public int getUserID() {
        return this.userID;
    }
     
     public void setTruckID(int truckID){
         this.truckID = truckID;
     }
     
     public int getTruckID(){
         return this.truckID;
     }
     
     public void setCapacity(double Capacity){
         this.capacity = Capacity;
     }
     
     public double getCapacity(){
         return this.capacity;
     }
     
     public void setTruckName(String TruckName){
         this.TruckName = TruckName;
     }
     
     public String getTruckName(){
         return this.TruckName;
     }
     
     public void setTruckSize(String TruckSize){
         this.TruckSize = TruckSize;
     }
     
     public String getTruckSize(){
         return this.TruckSize;
     }
     
     public void clearSession() {
        this.userID = 0;
        this.truckID = 0;
        this.capacity = 0;
        this.TruckName = "";
     }
     
    
     public void display(){
         System.out.println("TruckID : " + this.truckID);
         System.out.println("TruckName : " + this.TruckName);
         System.out.println("Capacity : " + this.capacity);
         System.out.println("TruckSize : " + this.TruckSize);
     }
    
}

    

