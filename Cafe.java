public class Cafe
{
   //Variables
   private String name;
   private int capacity;
   private int numberOfCustomers;

   //Constructor
   public Cafe(String name, int capacity)
   {
       this.name = name;
       this.capacity = capacity;
       this.numberOfCustomers = 0;
   }

   //Getters
   public String getName()
   {
       return name;
   }
   public int getCapacity()
   {
       return capacity;
   }
   public int getNumberOfCustomers()
   {
       return numberOfCustomers;
   }

   //Setters
   public void setName(String name)
   {
       this.name = name;
   }
   public void setCapacity(int capacity)
   {
       this.capacity = capacity;
   }
   public void setNumberOfCustomers(int numberOfCustomers)
   {
       this.numberOfCustomers = numberOfCustomers;
   }

   //Method for Adding Customers    
   /**
    * Adds a customer if capacity is not reached    
    * @return
    */
   public boolean addCustomer()
   {
       if (numberOfCustomers < capacity)
       {
           numberOfCustomers++;
           return true;
       }
       return false;
   }
   //Method for Removing Customers
   public boolean removeCustomer()
   {
       if (numberOfCustomers > 0)
       {
           numberOfCustomers--;
           return true;
       }
       return false;
   }
}