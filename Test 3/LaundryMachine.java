public class LaundryMachine
{
    private boolean inUse;
    private double capacity;

   
    public LaundryMachine(double c)
    {
        if(c>0)
            capacity = c;
        inUse = false;
    }

    public double getCapacity(){ return capacity; }
    public void setCapacity(double cap) { if (cap>0) capacity = cap; }
    public boolean inUse() { return inUse;}
    public void useMachine() { inUse = true; }
    public void releaseMachine() { inUse = false; }
    
    public String toString()
    {
        return "Capacity " + capacity+ " cu ft "+ (inUse ? " in use": " not in use");
    }
}