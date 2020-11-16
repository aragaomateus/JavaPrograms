import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // restaurant only has 20 tables to be used. The size of the array is 21 so it can call value allocated in 20. 0 is not used.
        Table[] table = new Table[21];
        // Initiates all objects table, even if the table is empty.
        menuTables();
        // This method is for adding guests and orders for a table that is being used.
    }
    static void addTable(Table[] table, int tableNum){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of people in the table:");
        int amtOfPeople = input.nextInt();
        table[tableNum].setAmountOfPeople(amtOfPeople);
        table[tableNum].getOrders();
        table[tableNum].printOrders(tableNum);
    }
    static void tableOccupied(int tableTaken, int tables[][]){
        int rows = 4, collumns = 5;

        for(int i = 0; i < collumns; i++){
            for(int j = 0; j < rows;j++)
                if (tables[i][j]==tableTaken) {
                    tables[i][j] = 0;
                }
        }
        for(int i = 0; i < collumns; i++){
            for(int j = 0; j < rows;j++) {
                if (tables[i][j]==0)
                    System.out.print("|  # \t");
                else
                    System.out.print("|  " + tables[i][j] + " \t");
            }
            System.out.println();
        }
    }
    static int menuTables(){
        int rows = 4, collumns = 5;
        int [][] mesas = new int[collumns][rows];
        int place = 1;
        System.out.println("Restaurant's Floor map: ");
        for(int i = 0; i <collumns; i++){
            for(int j = 0; j < rows;j++)
                mesas[i][j] = place++;
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4;j++)
                System.out.print("|  "+mesas[i][j]+ " \t");
            System.out.println();
        }
        //----------------------------
        Scanner input = new Scanner(System.in);
        Table[] table = new Table[21];
        for(int i = 0; i < table.length; i++){
            table[i] = new Table();
        }
        System.out.println("Enter table number:");
        int t = input.nextInt();
        // Press -1 for quitting the loop.
        while (t > 0){
            addTable(table,t);
            tableOccupied(t,mesas);
            System.out.println("Enter table number:");
            t = input.nextInt();

        }
        return t;
    }
    }




