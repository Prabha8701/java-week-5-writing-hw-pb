package homework_week_9;

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourlist= new ArrayList<>();
        colourlist.add("RED");
        colourlist.add("BLUE");
        colourlist.add("GREEN");
        colourlist.add("YELLOW");
        colourlist.add("BLACK");
        colourlist.add("WHITE");
        colourlist.add("ORANGE");
        colourlist.add("PURPLE");
        colourlist.add("CYAN");
        for(String colourList : colourlist){
            System.out.println(colourList + ",");
        }

    }
}
