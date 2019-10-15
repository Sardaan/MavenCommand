package collection;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.OffsetDateTime;

public class Human implements Comparable<Human>, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int course;
    private Location location;
    private Date birthDate;
    private OffsetDateTime time;



        //конструктор
    public Human(String name, int course, Date birthDate, Location location){
        this.name = name;
        this.course = course;
        this.location = location;
        this.birthDate = birthDate;
        this.time = OffsetDateTime.now();
    }

    //гетеры и сетер
    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }
    public Location getLocation(){
        return location;
    }

    public OffsetDateTime getTime(){
        return time;
    }

    public String getSimpleDate(){
        return new SimpleDateFormat("dd.MM.yyyy").format(birthDate);
    }

        //переопределение hashCode и тд.
    @Override
    public int hashCode() {
        return name.hashCode() + course + birthDate.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Human){
            Human human = (Human) obj;

            if (human.getName().equals(this.getName()) &&
                    human.getCourse() == this.getCourse() &&
                    human.getSimpleDate().equals(this.getSimpleDate()))
                return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return getName() + "," + getCourse() + "," + getSimpleDate() + "," + location.getCampus() + "," + location.getFloor() + ","+getTime();
    }

    @Override
    public int compareTo(Human human){
        return name.toLowerCase().compareTo(human.getName().toLowerCase());
    }



}
