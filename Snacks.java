import java.util.*;

public class Snacks {

    Scanner sc = new Scanner(System.in);

    void Snacks_item() {

        while (true) {
            System.out.println("   item                           price");
            System.out.println("1.Cookie                           ₹60");
            System.out.println("2.Biscuts                          ₹80");
            System.out.println("3.Cream role                       ₹50");
            System.out.println("4.Dhairy milk                      ₹125");
            System.out.println("5.kit kat                          ₹75");
            System.out.println("6.Tofees                           ₹30");
            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println("Press 9 to exit without calculating the bill");

            System.out.print("Enter your order:");
            int order_add = sc.nextInt();
            if (order_add == 1) {
                cart.list.add(60);
                cart.items.add("Cookie");
            }

            if (order_add == 2) {
                cart.list.add(80);
                cart.items.add("Biscuits");
            }

            if (order_add == 3) {
                cart.list.add(50);
                cart.items.add("Cream role");
            }

            if (order_add == 4) {
                cart.list.add(125);
                cart.items.add("Dhairy milk");
            }

            if (order_add == 5) {
                cart.list.add(75);
                cart.items.add("Kit Kat");
            }

            if (order_add == 6) {
                cart.list.add(30);
                cart.items.add("Tofees");
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

            System.out.println("\n Your Bill: " + cart.list + "\n Items: " + cart.items);
            if (order_add == 0) {
                int sum = 0;
                for (int num : cart.list) {
                    sum += num;
                }

                System.out.println("Total: " + sum);
                cart.list.clear();
                cart.items.clear();
                System.out.println("Thank you for visiting us");
                break;
            }
        }
    }
}
