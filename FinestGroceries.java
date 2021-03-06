/** represents a grocery store and extends store
 * @author Alyssa Wang & Marina Semenova  
 * @version 1.0
 */
public class FinestGroceries {
    /** main
     * @param args
     */
    public static void main (String[] args)
    {
      System.out.println("Hello, and welcome to the creation of Finest Groceries, your local virtual grocery story!");
      try // credits: https://stackoverflow.com/questions/26184409/java-console-prompt-for-enter-input-before-moving-on
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("So far, all we know is the name of the store, therefore the only constructor of our store we can use is " +
  "the one without parameters: GroceryStore finestGroceries = new GroceryStore()");

      GroceryStore finestGroceries = new GroceryStore();
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("This constructor has created a store that is nothing like the one we want!");
      System.out.println("Name: " + finestGroceries.getName());
      System.out.println("Area: " + finestGroceries.getArea());
      System.out.println("Connected: " + finestGroceries.getConnected());
      System.out.println("Employees: " + finestGroceries.getEmployees());
      System.out.println("Floors: " + finestGroceries.getFloorNumber());
      System.out.println("Manager: " + finestGroceries.getManager());
      System.out.println("Parking Spaces: " + finestGroceries.getParkingSpaces());
      System.out.println("Street Location: " + finestGroceries.getStreetLocation());
      System.out.println("Cleanliness (1-10): " + finestGroceries.getCleanliness());
      System.out.println("Registers: " + finestGroceries.getRegister());
      System.out.println("Revenue: " + finestGroceries.getRevenue());
      System.out.println("Aisles: " + finestGroceries.getAisles());
      System.out.println("Freezers: " + finestGroceries.getFreezers());
      System.out.println("Inventory Fullness (1-10): " + finestGroceries.getFreezers());
      System.out.println("Freshness (1-10): " + finestGroceries.getFresh());
      System.out.println("Live Animal: " + finestGroceries.getLiveAnimals());
      System.out.println("Bakery: " + finestGroceries.getBakery());
      System.out.println("Best-Seller: " + finestGroceries.getBestSeller());
      System.out.println("Amount of Products: " + finestGroceries.getNumberOfProducts());
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Don't worry though! We did our research and now we know EVERYTHING about our new store! " +
                         "All we have to do now is make sure that this information is part of our virtual store's attributes. To add these attributes to " +
                         "our store we will be using mutator methods to tell our store that this is what it'll " +
                         "be like.");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      finestGroceries.setName("Finest Groceries");
      System.out.println("Name: " + finestGroceries.getName());
      finestGroceries.setArea (70, 50);
      System.out.println("Area: " + finestGroceries.getArea() + " 70m x 50m");
      finestGroceries.setConnected(true);
      System.out.println("Connected: " + finestGroceries.getConnected() + " - our store is part of a mall!");
      finestGroceries.setEmployees(25);
      System.out.println("Employees: " + finestGroceries.getEmployees());
      finestGroceries.setManager("Lauren");
      System.out.println("Manager: " + finestGroceries.getManager());
      finestGroceries.setFloorNumber(2);
      System.out.println("Floors: " + finestGroceries.getFloorNumber());
      finestGroceries.setCleanliness(10);
      System.out.println("Cleanliness (1-10): " + finestGroceries.getCleanliness());
      finestGroceries.setParkingSpaces(80);
      System.out.println("Parking Spaces: " + finestGroceries.getParkingSpaces());
      finestGroceries.setStreetLocation("Allen Road");
      System.out.println("Street Location: " + finestGroceries.getStreetLocation());
      finestGroceries.setRegisters(10);
      System.out.println("Registers: " + finestGroceries.getRegister());
      finestGroceries.calcRevenue(0.0, 0.0);
      System.out.println("Revenue: " + finestGroceries.getRevenue() + " - we haven't opened yet");
      finestGroceries.setAisles(8);
      System.out.println("Aisles: " + finestGroceries.getAisles());
      finestGroceries.setFreezers(14);
      System.out.println("Freezers: " + finestGroceries.getFreezers());
      finestGroceries.setInventoryFull(10);
      System.out.println("Inventory Fullness (1-10): " + finestGroceries.getInventoryFull());
      finestGroceries.setFresh(10);
      System.out.println("Freshness: " + finestGroceries.getFresh());
      finestGroceries.setLiveAnimals(true);
      System.out.println("Live Animal: " + finestGroceries.getLiveAnimals() + " - we've got fish!");
      finestGroceries.setBakery(true);
      System.out.println("Bakery: " + finestGroceries.getBakery());
      finestGroceries.setBestSeller("");
      System.out.println("Best-Seller: " + finestGroceries.getBestSeller() + " - there is none yet");
      finestGroceries.setNumberOfProducts(5000);
      System.out.println("Number of Products: " + finestGroceries.getNumberOfProducts());
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Now that we've set up our store it's time to open!");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("---- 2 weeks later ---");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("We've been open a few weeks now. Business is booming, and now we can set a revenue and a best-seller. We also need to restock.");
      finestGroceries.calcRevenue(100000, 30000);
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Revenue: " + finestGroceries.getRevenue() + " - Finest Groceries made $100,000 and spent $30,000");
      finestGroceries.setBestSeller("Grapes");
      System.out.println("Best-Seller: " + finestGroceries.getBestSeller());
      finestGroceries.stock(-2000, 6);
      System.out.println("Number of Products: " + finestGroceries.getNumberOfProducts() + " - 2,000 products were bought");
      System.out.println("Inventory Fullness (1-10): " + finestGroceries.getInventoryFull() + " - a minus of 2,000 products puts fullness at 6/10");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Oh no someone's trying to hack us and mess up our variables! They are setting out number of products to a negative value : finestGroceries.setNumberOfProducts(-29301);.");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      { 
      }
      finestGroceries.setNumberOfProducts(-29301);
      System.out.println("Number of Products: " + finestGroceries.getNumberOfProducts() + " - their plan failed! (we know how to error trap ^_^)");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("It's time to expand!");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      finestGroceries.calcRevenue(130000, 70000);
      System.out.println("Revenue: " + finestGroceries.getRevenue() + " - Finest Groceries made $130,000 and spent $70,000 (spent an extra $40,000 expansions)");
      finestGroceries.addAisle(3);
      System.out.println("Aisles: " + finestGroceries.getAisles() + " - we added 3");
      finestGroceries.addFreezer(5);
      System.out.println("Freezers: " + finestGroceries.getFreezers() + " - we added 5");
      finestGroceries.addRegister(2);
      System.out.println("Registers: " + finestGroceries.getRegister() + " - we added 2");
      finestGroceries.hireEmployee(7);
      System.out.println("Employees: " + finestGroceries.getEmployees() + " - we hired 7 people");
      finestGroceries.fireEmployee(1);
      finestGroceries.hireNewManager("Jake");
      System.out.println("Employees: " + finestGroceries.getEmployees() + " - we fired the manager and promoted an employee to manager status");
      System.out.println("Manager: " + finestGroceries.getManager());
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Although the store is prospering, the expansions were a bit too much. We will be cutting back.");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      finestGroceries.calcRevenue(130000, 65000);
      System.out.println("Revenue: " + finestGroceries.getRevenue() + " - Finest Groceries made $130,000 and spent $5,000 less on renovations");
      finestGroceries.removeAisle(1);
      System.out.println("Aisles: " + finestGroceries.getAisles() + " - we removed 1");
      finestGroceries.removeFreezer(2);
      System.out.println("Freezers: " + finestGroceries.getFreezers() + " - we removed 2");
      finestGroceries.removeRegister(1);
      System.out.println("Registers: " + finestGroceries.getRegister() + " - we removed 1");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("Now that we know this store is pretty cool, we'll build a new one!");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      GroceryStore finestGroceries2 = new GroceryStore(8, 7, 9, 10, true, true, "Jell-o", 4000, "Finest Groceries", 70.0, 40.0, false, 15, 1, "Cassie", 10, 40, "Yonge Street", 6, 100000.0, 40000.0);
      System.out.println("Name: " + finestGroceries2.getName());
      System.out.println("Area: " + finestGroceries2.getArea());
      System.out.println("Connected: " + finestGroceries2.getConnected());
      System.out.println("Employees: " + finestGroceries2.getEmployees());
      System.out.println("Floors: " + finestGroceries2.getFloorNumber());
      System.out.println("Manager: " + finestGroceries2.getManager());
      System.out.println("Parking Spaces: " + finestGroceries2.getParkingSpaces());
      System.out.println("Street Location: " + finestGroceries2.getStreetLocation());
      System.out.println("Cleanliness (1-10): " + finestGroceries2.getCleanliness());
      System.out.println("Registers: " + finestGroceries2.getRegister());
      System.out.println("Revenue: " + finestGroceries2.getRevenue());
      System.out.println("Aisles: " + finestGroceries2.getAisles());
      System.out.println("Freezers: " + finestGroceries2.getFreezers());
      System.out.println("Inventory Fullness (1-10): " + finestGroceries2.getFreezers());
      System.out.println("Freshness (1-10): " + finestGroceries2.getFresh());
      System.out.println("Live Animal: " + finestGroceries2.getLiveAnimals());
      System.out.println("Bakery: " + finestGroceries2.getBakery());
      System.out.println("Best-Seller: " + finestGroceries2.getBestSeller());
      System.out.println("Amount of Products: " + finestGroceries2.getNumberOfProducts());
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("This is quite a good store, and we are going to plan a new one, but we only know the name and location.");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      GroceryStore finestGroceries3 = new GroceryStore("Finest Groceries", "Steeles Avenue");
      System.out.println("Name: " + finestGroceries3.getName());
      System.out.println("Street Location: " + finestGroceries3.getStreetLocation());
      System.out.println("This is the only information we have planned. Everything else stored within the instance variables is standard filler values.");
      try
      {
        System.in.read();
      }
      catch(Exception e)
      {
      }
      System.out.println("This program sets up a fully functional store, tests it, and modifies it. In addition. Another store has been built and another planned. This has been a story of Finest Groceries by Marina ans Alyssa. Bye now!");
    }
}
