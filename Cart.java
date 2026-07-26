import java.util.*;
public class Cart {
    public static void main (String[] args) {

        String item;
        int quantity;
        int price;
        int Total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        item = sc.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter the price: ");
        price = sc.nextInt();

        Total = quantity * price;

        System.out.println("You have bought " + item + " pay $" + Total);





    }
}
