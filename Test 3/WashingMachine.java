public class WashingMachine extends LaundryMachine
{
    private boolean topLoader;
    
    public WashingMachine(double c, boolean topLoader){
        super(c);
        this.topLoader = topLoader;
    }

    
    public boolean isTopLoader(){
        return topLoader;
    }

    
    @Override
    public String toString()
    {
        return super.toString() + ", " + (topLoader?"top loader" : "");
    }
    
}