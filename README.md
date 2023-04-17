
<h3>Overview:</h3><br>
 a potion shop to create an inventory system for their store. The potion
shop sells a variety of potions, including love potions, health potions, and transformation
potions.A program  will allow the store to keep track of their inventory.<br>
<h4><strong>The program is meeting the following requirements:</strong></h4><br>
● The program should allow the store to add new potions to their inventory.<br>
● The program should allow the store to remove potions from their inventory.<br>
● The program should allow the store to search for potions in their inventory based on a
search term.<br>
● The program should display a formatted table of all the potions in the inventory, including
their name, quantity, price, and total value.<br>
● The program should calculate the total value of the inventory.<br>

Program Instructions:<br>
a new Java class called InventoryItem.<br>
1.The InventoryItem class will have the following instance variables:<br>
● name (String)<br>
● id (int)<br>
● quantity (int)<br>
● price (double)<br>
2. a constructor for the InventoryItem class that takes four parameters (itemName,
itemId, itemQuantity, and itemPrice) and initializes the instance variables.
3.accessor (getter) methods for the name, id, quantity, and price instance
variables.
4.  mutator (setter) methods for the quantity and price instance variables.
5.a method called getTotalValue() that calculates and returns the total value of the
item (quantity * price)
6.a method called formatInventoryItem() that returns a formatted string
representing the item in the following format: "%-20s%-10d%-10d$%.2f" where %s
represents the name, %d represents the ID, and %.2f represents the price.<br>
<br>
<br>
A new Java class called Main.
1. In the main() method,  an ArrayList called inventory that will hold the InventoryItem
objects.
2.a Scanner object called scanner to read input from the user.
3. Implement a while loop that will continuously display a menu of options to the user until
the user chooses to quit the program. The menu will have the following options:
● Add Item<br>
● Remove Item<br>
● Search for Item<br>
● Display Inventory<br>
● Quit<br>
4. Implement a method called getValidInput() that takes a Scanner object, a message to
display to the user, a minimum value, and a maximum value. The method should read
input from the user and validate that the input is a number between the minimum and
maximum values. If the input is not valid, the method should display an error message
and prompt the user to enter a valid number.<br>
5. Implement the following functionality for each menu option:<br>
● Add Item:<br>
○ Prompt the user to enter the name, id, quantity, and price of the item.<br>
○ a new InventoryItem object using the entered values.<br>
○ Add the new InventoryItem object to the inventory ArrayList.<br>
○ Display a message indicating that the item was added successfully.<br>
● Remove Item:<br>
○ Prompt the user to enter the id of the item to remove.<br>
○ Search the inventory ArrayList for an item with the entered id.<br>
○ If an item with the entered id is found, remove it from the inventory ArrayList.<br>
○ Display a message indicating whether the item was removed or not found.<br>
● Search for Item:<br>
○ Prompt the user to enter a search term.<br>
○ Search the inventory ArrayList for items whose names contain the search term.<br>
○ Display a list of the matching items, or a message indicating that no items were
found.<br>
● Display Inventory:<br>
○ Calculate the total value of the inventory by summing the total values of each
InventoryItem object in the inventory ArrayList.<br>
○ Display a formatted table of the inventory items, including the name, id, quantity,
and price of each item.<br>
○ Display the total value of the inventory.<br>
● Quit:<br>
○ Display a goodbye message.<br>

<h3>Example Output:</h3><br>
Welcome to the Potion Inventory System
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit<br>
Enter your choice: 8<br>
Invalid input. Please enter a number between 1 and 5.<br>
Enter your choice: 1<br>
Enter item name: health potion<br>
Enter item ID: 001<br>
Enter item quantity: 34<br>
Enter item price: $3<br>
Item added successfully.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 1<br>
Enter item name: health flask<br>
Enter item ID: 002<br>
Enter item quantity: 66<br>
Enter item price: $2.75<br>
Item added successfully.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 1<br>
Enter item name: mana potion<br>
Enter item ID: 003<br>
Enter item quantity: 99<br>
Enter item price: $2.75<br>
Item added successfully.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 3<br>
Enter search term: health<br>
Name ID Quantity Price<br>
health potion 1 34 $3.00<br>
health flask 2 66 $2.75<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 4<br>
Inventory Item List:<br>
Name ID Quantity Price<br>
health potion 1 34 $3.00<br>
health flask 2 66 $2.75<br>
mana potion 3 99 $2.75<br>
Total Value: $555.75<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 2<br>
Enter item ID: 002<br>
Item removed successfully.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 4<br>
Inventory Item List:<br>
Name ID Quantity Price<br>
health potion 1 34 $3.00<br>
mana potion 3 99 $2.75<br>
Total Value: $374.25<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 3<br>
Enter search term: flask<br>
No items found.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 2<br>
Enter item ID: 002<br>
Item not found.<br>
1. Add Item<br>
2. Remove Item<br>
3. Search for Item<br>
4. Display Inventory<br>
5. Quit<br>
Enter your choice: 5<br>
Goodbye<br>

