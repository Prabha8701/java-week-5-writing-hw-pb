package homework_week_9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 =new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("Pink");
        ArrayList<String> c3= new ArrayList<String>();
        for(String e :c1){
            c3.add(c2.contains(e)? "Yes" : "No");
            System.out.println(c3);
        }
    }
}