package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList= new ArrayList<>();
        vegetableList.add("Cucumber");
        vegetableList.add("Potato");
        vegetableList.add("Cauliflower");
        vegetableList.add("Bringle");
        vegetableList.add("Onion");
        vegetableList.add("Beetroot");
        vegetableList.add("Mushroom");
        vegetableList.add("Bitter_Gourd");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an Index Number : ");
        int index =scan.nextInt();
        if(index< vegetableList.size()){
            System.out.println(vegetableList.get(index));
        }else {
            System.out.println("Invalid Index !!");
        }
        scan.close();
    }
}
