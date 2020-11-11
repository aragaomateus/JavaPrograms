import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Table[] table = new Table[20];
        for(int i = 0; i < table.length; i++){
            table[i] = new Table();
        }
        System.out.println("Enter table number:");
        int t = input.nextInt();
        while (t > 0){
            addTable(table,t);
            System.out.println("Enter table number:");
            t = input.nextInt();
        }


    }
    static void addTable(Table[] table, int t){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of people in the table:");
        int x = input.nextInt();
        table[t].setAmountOfPeople(x);
        table[t].getOrders();
        table[t].printOrders(t);
    }

}
