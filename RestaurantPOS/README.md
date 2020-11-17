# RestaurantPOS is a program that simulates a real POS station in a restaurant. 

## Current State: 

The User is playing the role of a waiter in a restaurant. The user is able of choosing the table where the new guest are seated and to set the amount of people in the table. Then program collect the individual orders of each guest seated in that table and print it back. After that order is printed, the program ask if the user wants to add another table and repeat the process of getting the individual orders. After each new table, the program will print a matrix showing the tables that are currently occupaied, it will show as '#'.

## Ideal final product: 

###### Menu principal:
1. Option for "Manager". 
   - "Restaurant Stats"  
   - look it up the total sale of at the moment. 
   - how many guest went to the restaurant so far. 
   - if there are items that are not available.
2. Option for "Modify Menus" that will enable to set food and bevarege prices and the name of the items. 
   - Food menu: add/remove items and set price. 
   - Drink menu: add/remove items and set price.
3. Option for "New Table". 
   - It will work in a similar fashion as the current state, user chooses the tables that are not occupied and input the order for each guest in that table. It shows avaible tables. it should not allow user to input order for a table that is being used.
4. Option for "Current Orders": It acess the orders for the tables that have not paid yet. 
   - Add order to the tab. 
   - Remove item to the tab. 
   - Print a bill for the table. 
   - Close order. Enables the table to be used again.
