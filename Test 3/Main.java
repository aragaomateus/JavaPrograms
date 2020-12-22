public class Main{
    public static void main(String [] args)
    {
       //creates washing machine with 5 cu ft capacity that is a top loader
       LaundryMachine washer = new WashingMachine(5, true); 
       washer.useMachine(); 
       System.out.println("About washing machine "+washer);
       //prints: Capacity 5.0 cu ft in use, top loader
       
       //creates dryer with 6 cu ft capacity that runs on gas 
       Dryer dryer = new Dryer(6, "gas"); 
       dryer.releaseMachine();
       System.out.println("About dryer "+dryer);
       //prints: Capcity 6.0 cu ft not in use, runs on gas
       
       if(washer.getCapacity() == dryer.getCapacity())
         System.out.println("These machines have the same capacity.");
       else
         System.out.println("These machines have different capacity.");

    }
}