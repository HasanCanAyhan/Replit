package loops_4;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String shoppingList = "";

        double total_cost = 0;

        String answer = "yes";

        int i = 1;
        while (answer.equals("yes")) {

            System.out.println("Enter Item"+i + " and its price:");
            String itemName = input.next();
            double price = input.nextDouble();
            total_cost += price;

            System.out.println("Add one more item?");
            answer = input.next();

            shoppingList += "Item"+i +": "+itemName+" Price: "+price+", ";

            if (answer.equals("no")) {
             break;
            }


            i++;
        }

        System.out.println(shoppingList.substring(0,shoppingList.lastIndexOf(',')));
        System.out.println("Total price: "+total_cost);



    }




}

/*

Create a Scanner object
Ask the user to enter the name of the item with the message: Enter the name of item x where x is an item number starting from 1, 2, etc
Ask the user to enter the price of the item using the message: Enter the price of the $itemName, where itemName is the same asked in the previous step
Ask the user to enter the quantity they will buy using the message: How many $itemName will you buy?, where itemName is the same asked in the second step
Build the total receipt of this item and add it to the final shopping list. Also add the total cost of the item to the total cost of the shopping trip. Use this format to create each items' receipt:

Ask the user if they want to add more items to the list using the message, Do you want to add more items to the shopping list?
If the user says yes then repeat all of the steps above, starting from step 2
If the user says no then stop asking for items and print out the total shopping list and the total cost of the shopping trip in the following format:








input

Lemons
2.3
yes
Oranges
6
no



output :

Enter Item1 and its price:
Add one more item?
Enter Item2 and its price:
Add one more item?
Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
Total price: 8.3




 */
