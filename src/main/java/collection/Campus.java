package collection;

public enum Campus {
    KRONVER,
    LOMO,
    BIRJA;

    public static Campus getCampusEnum(String value){
        Campus campus = null;

        for (Campus campusEnum : Campus.values()){
            if (value!=null) {
                if (campusEnum.toString().equals(value.toUpperCase())) {
                    campus = campusEnum;
                }
            }
        }

        return campus;
    }


}
