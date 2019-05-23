package GroceryList;
import util.Input;

import java.util.HashMap;

public class GroceryList {




    public static void main(String[] args) {

    //new category objects

        Category veggies = new Category("Veggies", new HashMap<>());
        Category dairy = new Category("Dairy", new HashMap<>());
        Category toys = new Category("Toys", new HashMap<>());
        Category meat = new Category("Meat", new HashMap<>());
        Category breads = new Category("breads", new HashMap<>());

//   new hashmap of above Category objects, with a string key, and a Category value
        HashMap<String, Category> categories = new HashMap<>();
            categories.put("Veggies", veggies);
            categories.put("Dairy", dairy);
            categories.put("Toys", toys);
            categories.put("Meat", meat);
            categories.put("Breads", breads);

            Input inputter = new Input();

            boolean response = inputter.yesNo("Would you like to create a grocery list? y/n \n");
            if (response){
                response = inputter.yesNo("Would you like to enter a new item? y/n \n");
                if(response){
                    buildGroceryList(categories);
                } else {
                    System.out.println("Then why are we here?");
                }
            } else {
                System.out.println("good bye");
            }
    }

    public static void buildGroceryList(HashMap<String, Category> categories) {
        System.out.println("Please select a category: ");


    }

}
