import java.util.*;

class Cold {

    Scanner sc = new Scanner(System.in);

    void Cold_item() {
        while (true) {
            System.out.println("   item                            price");
            System.out.println("1.Regular cold Cofee                ₹230");
            System.out.println("2.Espresso                          ₹280");
            System.out.println("3.Cappuccino                        ₹300");
            System.out.println("4.Latte                             ₹180");
            System.out.println("5.Mocha                             ₹240");
            System.out.println("6.Flat White                        ₹270");
            System.out.println("7.Iced Coffee                       ₹250");
            System.out.println("8.No Sugar Regular cold Cofee       ₹210");
            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println("Press 9 to exit without calculating the bill");

            System.out.print("Enter your order:");
            int order_add = sc.nextInt();
            if (order_add == 1) {
                cart.list.add(230);
                cart.items.add("Regular cold Coffee");
            }

            if (order_add == 2) {
                cart.list.add(280);
                cart.items.add("Espresso");
            }

            if (order_add == 3) {
                cart.list.add(300);
                cart.items.add("Cappuccino");
            }

            if (order_add == 4) {
                cart.list.add(180);
                cart.items.add("Latte");
            }

            if (order_add == 5) {
                cart.list.add(240);
                cart.items.add("Mocha");
            }

            if (order_add == 6) {
                cart.list.add(270);
                cart.items.add("Flat White");
            }

            if (order_add == 7) {
                cart.list.add(250);
                cart.items.add("Iced Coffee");
            }

            if (order_add == 8) {
                cart.list.add(210);
                cart.items.add("No Sugar Regular cold Coffee");
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
