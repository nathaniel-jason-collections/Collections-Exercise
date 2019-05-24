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
//        Category[] categories = {veggies, dairy, toys, meat, breads};

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
        Input input = new Input();
        System.out.println("Please select a category: ");

//        here's how to fudge in an iterator for a foreach
        int i = 0;
//        here's how to forEach a hashmap
        for (String key : categories.keySet()){
           i +=1;
            System.out.println(i + ". " + key);
        }

        System.out.println("6. Finalize list");
//      empty msg because we already printed our numbers.
        int choice = input.getInt(" ");

        switch (choice){
            case 1:
                addItems("Toys",categories);
                break;
            case 2:
                addItems("Veggies",categories);
                break;
            case 3:
                addItems("Dairy",categories);
                break;
            case 4:
                addItems("Breads",categories);
                break;
            case 5:
                addItems("Meat",categories);
                break;
            case 6:
               /* someFunction();*/
                break;
            default:
                System.out.println("that was not one of the choices");
                buildGroceryList(categories);
        }
    }
//    add item and quantity to Category hashmap to later put into array to iterate and sort
    public static void addItems(String key, HashMap<String, Category> categories) {
        Input input = new Input();
        String item = input.getString("What " + key + " would you like to add?");
        int quantity = input.getInt("How many do you need?");
//        turns out we didn't need a setter for this one... here's how you add the item to the hashmap;
        categories.get(key).getItem().put(item, quantity);
        System.out.println("you've added " + quantity + " " + item + "(s) to your list!");

        //just for debugging
        System.out.println("categories keySet = " +  categories.get(key).getItem().keySet());

        boolean addMore = input.yesNo("Would you like to add any more " + key + " items to your list?");
        if (addMore){
            addItems(key, categories);
        } else {
            System.out.println("ok, lets continue adding to our list...");
            buildGroceryList(categories);
        }

    }

}
