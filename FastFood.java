
import java.util.*;

public class FastFood {

    Scanner sc = new Scanner(System.in);

    void FastFood_item() {

        while (true) {
            System.out.println("\n   item                       price");
            System.out.println("1.Veg Burger                  ₹80");
            System.out.println("2.Cheese Burger               ₹100");
            System.out.println("3.Veg Pizza                   ₹150");
            System.out.println("4.Cheese Pizza                ₹180");
            System.out.println("5.French Fries                ₹90");
            System.out.println("6.Peri Peri Fries             ₹110");
            System.out.println("7.Grilled Sandwich            ₹120");
            System.out.println("8.Veg Wrap                    ₹130");

            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println(" Press 9 to exit without calculating the bill");

            System.out.print("Enter your order: ");
            int order_add = sc.nextInt();

            if (order_add == 1) {
                cart.list.add(80);
                cart.items.add("Veg Burger");
            }

            if (order_add == 2) {
                cart.list.add(100);
                cart.items.add("Cheese Burger");
            }

            if (order_add == 3) {
                cart.list.add(150);
                cart.items.add("Veg Pizza");
            }

            if (order_add == 4) {
                cart.list.add(180);
                cart.items.add("Cheese Pizza");
            }

            if (order_add == 5) {
                cart.list.add(90);
                cart.items.add("French Fries");
            }

            if (order_add == 6) {
                cart.list.add(110);
                cart.items.add("Peri Peri Fries");
            }

            if (order_add == 7) {
                cart.list.add(120);
                cart.items.add("Grilled Sandwich");
            }

            if (order_add == 8) {
                cart.list.add(130);
                cart.items.add("Veg Wrap");
            }

            if (order_add == 9) {
                break;
            }

            if (order_add == 99) {
                if (!cart.list.isEmpty()) {
                    cart.list.removeLast();
                    cart.items.removeLast();
                } else {
                    System.out.println("Cart is already empty!");
                }
            }

            if (order_add == 999) {
                cart.list.clear();
                cart.items.clear();
                System.out.println("Cart cleared!");
                continue;
            }

            if (order_add > 9 && order_add != 99 && order_add != 999) {
                System.out.println("Invalid input. Please enter a number between 0 and 9.");
                continue;
            }

            System.out.println("Your Bill: " + cart.list + "\nItems: " + cart.items);

            if (order_add == 0) {
                int sum = 0;
                for (int num : cart.list) {
                    sum += num;
                }

                System.out.println("Total: ₹" + sum);
                cart.list.clear();
                cart.items.clear();
                break;
            }
        }

        System.out.println("Thank you for visiting us");
    }
}
