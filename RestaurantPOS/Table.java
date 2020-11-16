import java.util.ArrayList;
import java.util.*;
// Class Table is devoted to counting how many people are in the table and to get their individual order.
public class Table {
    private int amountOfPeople;
    Scanner input = new Scanner(System.in);
    Order[] order = new Order[10];

    public Table (){
        this.amountOfPeople = 0;
    }
    public Table ( int amountOfPeople){
        this.amountOfPeople = amountOfPeople;
    }
    public void setAmountOfPeople(int amountOfPeople){
        this.amountOfPeople = amountOfPeople;
    }
    public int getAmountOfPeople(){
        return amountOfPeople;
    }

    // getOrders methods, is for getting the order of individual guests.
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

    // printOrders prints all the orders for that table and their specific seat.
    public void printOrders(int t){
        System.out.println("Orders of table: " + t);
        for(int i = 0; i < amountOfPeople; i++){
            System.out.println("Seat "+ (i+1)+" orders:");
            order[i].printOrder();
        }
    }
}
