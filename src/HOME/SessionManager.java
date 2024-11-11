
package HOME;

public class SessionManager {
    private static SessionManager instance;
    private int userID;
    private int truckID;
    
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
         this.truckID = userID;
     }
     
     public int getTruckID(){
         return this.truckID;
     }
    
}
