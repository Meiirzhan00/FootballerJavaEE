package kz.javaee.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Footballer> footballers = new ArrayList<>();

    private static Long id = 4L;
    static {
        footballers.add(new Footballer(1L,"Cristiano","Ronaldo",30000000,"Juventus", 70000000));
        footballers.add(new Footballer(2L,"Vinicius","Junior",6000000,"Real Madrid", 120000000));
        footballers.add(new Footballer(3L,"Ruslan","Malinovskyi",4000000,"Atalanta", 15000000));
    }

    public static void addFootballer(Footballer footballer){
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

    public static Footballer getFootballer(Long id){
        for (Footballer footballer : footballers) {
            if (footballer.getId() == id){
                return footballer;
            }
        }
        return null;
    }

    public static ArrayList<Footballer> getAllFootballers(){
        return footballers;
    }

    public static void deleteFootballer(Long id){
        for (Footballer footballer : footballers) {
            if (footballer.getId() == id){
                footballers.remove(footballer);
            }
        }
    }


}
