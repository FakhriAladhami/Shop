public class InventoryItem{
  String name;
  int id;
  int quantity;
  double price;


  // create the constructor
  public InventoryItem(String itemName, int itemId, int itemQuantity, double itemPrice){
    name = itemName;
    id = itemId;
    quantity = itemQuantity;
    price = itemPrice;
  }

  
  //create method called getTotalValue()
  public double getTotalValue(){
    return quantity * price;
  }
  public void getValidInput(int num){
  if (num > 5 || num <=0){
    System.out.println("Invalid input. Please enter a number between 1 and 5.");
  }
}

    // create setter and getter
    
    public String getName()
    {
      return name;
    }
    public void setName(String itemName)
    {
      itemName= name;
    }
  public int getId(){
    return id;
  }
  public void setId(int itemId){
    itemId = id;
  
  }
  public int getQuantity(){
    return quantity;
  }
  public void setQuantity(int itemQuantity){
    itemQuantity = quantity;
   
  }
   public double getPrice(){
      return price;
    }
  public void setPrice( double itemPrice){
    itemPrice = price;
  }

 
  public String formatInventoryItem() {
    return String.format("%20s %10d %10d %.2f", name, id,quantity,price);
}
  
}
