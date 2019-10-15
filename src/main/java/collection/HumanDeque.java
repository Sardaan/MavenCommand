package collection;

import java.util.concurrent.ConcurrentLinkedDeque;


public class HumanDeque{

    private static ConcurrentLinkedDeque<Human> humans = new ConcurrentLinkedDeque<>();
    public static ConcurrentLinkedDeque<Human> getHumans(){
        return humans;
    }

//    static {
//        humans.add(new Ordinary("Dany", 2, new Date(), new Location(Campus.LOMO, 2)));
//        humans.add(new Ordinary("Dany", 2, new Date(), new Location(Campus.LOMO, 2)));
//        humans.add(new Weirdo("Katy", 2, new Date(), new Location(Campus.LOMO, 2)));
//        humans.add(new Weirdo("Madison", 2, new Date(),new Location(Campus.LOMO, 2)));
//        humans.add(new Ordinary("Billy", 2, new Date(), new Location(Campus.LOMO, 2)));
//        humans.add(new Ordinary("Fiona", 2, new Date(), new Location(Campus.LOMO, 2)));
//        humans.add(new Weirdo("Leticia", 2, new Date(),new Location(Campus.LOMO, 2)));
//    }

    @Override
    public String toString() {
        String str="";
        if (getHumans().size()!=0) {
            for (Human human : getHumans()) {
                str = str + human.toString() + "\n";
            }
        }
        return str;
    }

}

