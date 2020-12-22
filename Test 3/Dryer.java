public class Dryer extends LaundryMachine
{
    private String runs;
    
    public Dryer(double c, String runs){
        super(c);
        this.runs = runs;
    }

     @Override
    public String toString()
    {
        return super.toString() + ", runs on " + runs;
    }
}