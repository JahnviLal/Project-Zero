public class Demo
{
   public static void main(String[] args )
   {
       Cafe cafe = new Cafe("Twilight Cafe", 5 );
       cafe.addCustomer();
       cafe.addCustomer();
       cafe.removeCustomer();
       System.out.println(cafe.getNumberOfCustomers());


   }
}
