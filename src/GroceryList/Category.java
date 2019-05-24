package GroceryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Category {

    private String catName;
    private HashMap<String, Integer> item = new HashMap<>();

    //constructor
    public Category(String catName, HashMap<String, Integer> item) {
        this.catName = catName;
        this.item = item;
    }


    //getters
    public String getCatName() {
        return catName;
    }

    public void displayItems() {
        ArrayList<String> catItemsList = new ArrayList<>();
        int i = 0;
        for (String listItem : item.keySet()) {
            String addToArray = listItem + " (" + item.get(listItem) + ")";
            catItemsList.add(addToArray);
        }
        Collections.sort(catItemsList, String.CASE_INSENSITIVE_ORDER);
        for (String karen: catItemsList) {
            i++;
            System.out.println(i + ". " + karen + "\n");
        }
    }

    public HashMap<String, Integer> getItem() {
        return item;
    }

    //setters
    public void setCatName(String catName) {
        this.catName = catName;
    }

//    deleted the hashmap setter.... maybe that was dumb... we will find out when it's time to finalize our list
}
