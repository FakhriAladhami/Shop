import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  public static void main(String[] args){


    //create Scanner 
    Scanner keyword = new Scanner(System.in);
     Scanner keyword1 = new Scanner(System.in);

    //create Object
    InventoryItem InventoryItem1 = new InventoryItem ("name", 4,56,23.56);

    // create ArrayList
    ArrayList<InventoryItem> lists = new ArrayList<>();

    //intialize varaible
    int action = 0;

    //introduction message
    System.out.println("Welcome to the Potion Inventory System");

    //using while loop to keep the game running

    while(action !=5){
      System.out.println("1. Add Item");
      System.out.println("2. Remove Item");
      System.out.println("3. Search for Item");
      System.out.println("4. Display Inventory");
      System.out.println("5. Quit");
      System.out.print("Enter your choice: ");
      action = keyword.nextInt();
      InventoryItem1.getValidInput(action);

      //using Switch loop to let it work depend on the input number of user
      switch(action){

          //add Items
        case 1:
          System.out.print("Enter item name:");
          String name = keyword1.nextLine();
          System.out.print("Enter item ID:");
          int id = keyword.nextInt();         
          System.out.print("Enter item quantity:");
          int quantity = keyword.nextInt(); 
          System.out.print("Enter item price: $ ");
          double price = keyword.nextDouble();
          

          //create a new InventoryItem object using the entered values

        InventoryItem InventoryItem = new InventoryItem(  name , id, quantity,  price); 

          //Add the new InventoryItem object to the inventory ArrayList.
        lists.add(InventoryItem);

           //Display a message indicating that the item was added successfully.
          System.out.println("Item added successfully");
          break;

          
        // remove items
        case 2:
          System.out.print("Enter item ID: ");
          int id_removing = keyword.nextInt();
            boolean removing = false;
                    for (int index = 0; index < lists.size(); index++) {
                        if (lists.get(index).getId() == id_removing) {
                            lists.remove(index);
                            System.out.println("Item removed successfully.");
                            removing = true;
                            break;
                        }
                    }
                    if (!removing) {
                        System.out.println("Item not found.");
                    }
                    break;

          //searching for item
        case 3:
               System.out.print("\nSearch for name: ");
                    String item_searching = keyword1.nextLine();
                    boolean searching = false;
                    for (InventoryItem search : lists) {
                      String[] fullName = search.getName().split(" ");
                      String firstName = fullName[0];
                        if (firstName.equalsIgnoreCase(item_searching)) {
                          if(!searching){
                            System.out.println("\nName\tID\tQuantity\tPrice");
                          }
                            System.out.println(search.formatInventoryItem());
                            searching = true;
                            // break;
                        }
                    }
                    if (!searching) {
                        System.out.println("\n No items found.");
                    }
                    break;

          //display Items
        case 4:
                    System.out.println(" \t Name \t ID \t Quantity \t Price");
                    double total = 0;
                    for (InventoryItem search : lists) {
                    System.out.println(search.formatInventoryItem());
                        total += search.getTotalValue();
                      // InventoryItem1.getTotalValue();
                    }
                    System.out.println("Total Value: $" + total + ".");
                    break;
          //Quit
          case 5:
                    System.out.println("Goodbye!.");
                    break;
                
        
      }
     
      }
     
    }
  }
