
import java.util.*;

public class DateSpecial {

    Scanner sc = new Scanner(System.in);

    void DateSpecial_item() {

        while (true) {
            System.out.println("\n   item                       price");
            System.out.println("1.Chocolate Brownie           ₹120");
            System.out.println("2.Ice Cream Sundae            ₹150");
            System.out.println("3.Couple Pizza Combo          ₹300");
            System.out.println("4.Special Pasta               ₹180");
            System.out.println("5.Candle Light Coffee         ₹200");
            System.out.println("6.Red Velvet Cake             ₹220");
            System.out.println("7.Mocktail Special            ₹140");
            System.out.println("8.Couple Dessert Combo        ₹350");

            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println(" Press 9 to exit without calculating the bill");

            System.out.print("Enter your order: ");
            int order_add = sc.nextInt();

            if (order_add == 1) {
                cart.list.add(120);
                cart.items.add("Chocolate Brownie");
            }

            if (order_add == 2) {
                cart.list.add(150);
                cart.items.add("Ice Cream Sundae");
            }

            if (order_add == 3) {
                cart.list.add(300);
                cart.items.add("Couple Pizza Combo");
            }

            if (order_add == 4) {
                cart.list.add(180);
                cart.items.add("Special Pasta");
            }

            if (order_add == 5) {
                cart.list.add(200);
                cart.items.add("Candle Light Coffee");
            }

            if (order_add == 6) {
                cart.list.add(220);
                cart.items.add("Red Velvet Cake");
            }

            if (order_add == 7) {
                cart.list.add(140);
                cart.items.add("Mocktail Special");
            }

            if (order_add == 8) {
                cart.list.add(350);
                cart.items.add("Couple Dessert Combo");
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
