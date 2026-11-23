package src;;
public class distCentre{
    private static int nextID = 0;
    private String centreName;
    private int centreID;
    private String location;
    public distCentre (String centreName, String location){
        this.centreName = centreName;
        this.location = location;
        nextID ++;
        this.centreID = nextID;
    }
    public int getID(){
        return centreID;
    }
    public String getCentreName(){
        return centreName;
    }
}