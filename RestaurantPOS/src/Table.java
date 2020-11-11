import java.util.ArrayList;
import java.util.*;

public class Table {
    private int tableNum;
    private int amountOfPeople;
    Scanner input = new Scanner(System.in);

    public Table (){
        this.tableNum = 0;
        this.amountOfPeople = 0;
    }

    public Table (int tableNum, int amountOfPeople){
        this.tableNum = tableNum;
        this.amountOfPeople = amountOfPeople;
    }

    public void setTable(int tableNum){
        this.tableNum = tableNum;
    }
    public void setAmountOfPeople(int amountOfPeople){
        this.amountOfPeople = amountOfPeople;
    }
    public int getAmountOfPeople(){
        return amountOfPeople;
    }
    public int getTableNum(){
        return tableNum;
    }
    Order[] order = new Order[10];

    public void getOrders(){
        for(int i = 0; i < amountOfPeople; i++){
            order[i] = new Order();
            System.out.println("Entree:");
            order[i].setEntree(input.next());
            System.out.println("Main Course:");
            order[i].setMainCourse(input.next());
            System.out.println("Dessert:");
            order[i].setDessert(input.next());
            System.out.println("Drinks:");
            order[i].setDrinks(input.next());
            System.out.println("Modifiers:");
            order[i].setModifiers(input.next());
        }
    }
    public void printOrders(int t){
        System.out.println("Orders of table: " + t);
        for(int i = 0; i < amountOfPeople; i++){
            System.out.println("Seat "+ (i+1)+" orders:");
            order[i].printOrder();
        }
    }
}
