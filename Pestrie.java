import java.util.*;
public class Pestrie {

    Scanner sc = new Scanner(System.in);

    void Pestrie_item() {

        while (true) {
            System.out.println("1.Muffin                               ₹130");
            System.out.println("2.Cup cake                             ₹150");
            System.out.println("3.Cheesecake                           ₹180");
            System.out.println("4.Brownie                              ₹110");
            System.out.println("5.Donut                                ₹230");
            System.out.println("6.Bagel                                ₹200");

            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println("Press 9 to exit without calculating the bill");

            System.out.print("Enter your order:");
            int order_add = sc.nextInt();
            if (order_add == 1) {
                cart.list.add(130);
                cart.items.add("Muffin");
            }

            if (order_add == 2) {
                cart.list.add(150);
                cart.items.add("Cup cake");
            }

            if (order_add == 3) {
                cart.list.add(180);
                cart.items.add("Cheesecake");
            }

            if (order_add == 4) {
                cart.list.add(110);
                cart.items.add("Brownie");
            }

            if (order_add == 5) {
                cart.list.add(230);
                cart.items.add("Donut");
            }

            if (order_add == 6) {
                cart.list.add(200);
                cart.items.add("Bagel");
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
