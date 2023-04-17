
Overview:
 a potion shop to create an inventory system for their store. The potion
shop sells a variety of potions, including love potions, health potions, and transformation
potions.A program  will allow the store to keep track of their inventory.
The program is meeting the following requirements:
● The program should allow the store to add new potions to their inventory.
● The program should allow the store to remove potions from their inventory.
● The program should allow the store to search for potions in their inventory based on a
search term.
● The program should display a formatted table of all the potions in the inventory, including
their name, quantity, price, and total value.
● The program should calculate the total value of the inventory.

Program Instructions:<br>
a new Java class called InventoryItem.
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

Example Output:
Welcome to the Potion Inventory System
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 8
Invalid input. Please enter a number between 1 and 5.
Enter your choice: 1
Enter item name: health potion
Enter item ID: 001
Enter item quantity: 34
Enter item price: $3
Item added successfully.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 1
Enter item name: health flask
Enter item ID: 002
Enter item quantity: 66
Enter item price: $2.75
Item added successfully.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 1
Enter item name: mana potion
Enter item ID: 003
Enter item quantity: 99
Enter item price: $2.75
Item added successfully.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 3
Enter search term: health
Name ID Quantity Price
health potion 1 34 $3.00
health flask 2 66 $2.75
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 4
Inventory Item List:
Name ID Quantity Price
health potion 1 34 $3.00
health flask 2 66 $2.75
mana potion 3 99 $2.75
Total Value: $555.75
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 2
Enter item ID: 002
Item removed successfully.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 4
Inventory Item List:
Name ID Quantity Price
health potion 1 34 $3.00
mana potion 3 99 $2.75
Total Value: $374.25
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 3
Enter search term: flask
No items found.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 2
Enter item ID: 002
Item not found.
1. Add Item
2. Remove Item
3. Search for Item
4. Display Inventory
5. Quit
Enter your choice: 5
Goodbye

