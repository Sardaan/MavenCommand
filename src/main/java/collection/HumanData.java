package collection;

import com.google.gson.annotations.SerializedName;

class HumanData {

    @SerializedName("name")
    private String name;

    @SerializedName("course")
    private int course;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("location")
    private Location location;

    String getName() {
        return name;
    }
    int getCourse() {
        return course;
    }
    String getBirthDate() {
        return birthDate;
    }
    Location getLocation() {
        return location;
    }


}
