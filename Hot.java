import java.util.*;

public class Hot {

    Scanner sc = new Scanner(System.in);

    void Hot_item() {

        while (true) {
            System.out.println("/n   item                       price");
            System.out.println("1.Regular Tea                  ₹30");
            System.out.println("2.Masala Tea                   ₹40");
            System.out.println("3.Double Masala Tea            ₹50");
            System.out.println("4.Extra Ginger Tea             ₹45");
            System.out.println("5.No Sugar Tea                 ₹60");
            System.out.println("6.Hot Cofee                    ₹50");
            System.out.println("7.Strong Hot Cofee             ₹80");
            System.out.println("8.No Sugar Cofee               ₹70");
            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println("Press 9 to exit without calculating the bill");

            System.out.print("Enter your order:");
            int order_add = sc.nextInt();
            if (order_add == 1) {
                cart.list.add(30);
                cart.items.add("Regular Tea");
            }

            if (order_add == 2) {
                cart.list.add(40);
                cart.items.add("Masala Tea");
            }

            if (order_add == 3) {
                cart.list.add(50);
                cart.items.add("Double Masala Tea");
            }

            if (order_add == 4) {
                cart.list.add(45);
                cart.items.add("Extra Ginger Tea");
            }

            if (order_add == 5) {
                cart.list.add(60);
                cart.items.add("No Sugar Tea");
            }

            if (order_add == 6) {
                cart.list.add(50);
                cart.items.add("Hot Coffee");
            }

            if (order_add == 7) {
                cart.list.add(80);
                cart.items.add("Strong Hot Coffee");
            }

            if (order_add == 8) {
                cart.list.add(70);
                cart.items.add("No Sugar Coffee");
            }

            if (order_add == 9) {
                break;
            }

            if (order_add == 99) {
                cart.list.removeLast();
                cart.items.removeLast();
            }

            if (order_add == 999) {
                cart.list.clear();
                cart.items.clear();
                continue;
            }

            if (order_add > 9 && order_add != 99 && order_add != 999) {
                System.out.println("Invalid input. Please enter a number between 0 and 9.");
                continue;
            }
            System.out.println("Your Bill: " + cart.list + "\n Items: " + cart.items);
            if (order_add == 0) {
                int sum = 0;
                for (int num : cart.list) {
                    sum += num;
                }

                System.out.println("Total: " + sum);
                cart.list.clear();
                cart.items.clear();
                break;
            }

        }

        System.out.println("Thank you for visiting us");

    }
}

