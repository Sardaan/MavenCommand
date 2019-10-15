package collection;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable {

    private static final long serialVersionUID = 2L;
    @SerializedName("campus")
    private Campus campus;
    @SerializedName("floor")
    private int floor;

    public int getFloor() {
        return floor;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Location(Campus campus, int floor){
        this.campus = campus;
        this.floor = floor;
    }
    public Location(){}
    @Override
    public String toString(){
        return getCampus()+","+getFloor();
    }
}
