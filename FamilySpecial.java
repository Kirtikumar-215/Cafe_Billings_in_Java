import java.util.*;

public class FamilySpecial{

    Scanner sc = new Scanner(System.in);

    void FamilySpecial_item() {

        while (true) {
            System.out.println("\n   item                       price");
            System.out.println("1.Family Pizza Combo          ₹500");
            System.out.println("2.Family Burger Combo         ₹400");
            System.out.println("3.Large Veg Thali             ₹350");
            System.out.println("4.Chinese Family Pack         ₹450");
            System.out.println("5.Family Pasta Combo          ₹420");
            System.out.println("6.Mixed Starter Platter       ₹380");
            System.out.println("7.Family Dessert Combo        ₹300");
            System.out.println("8.Unlimited Meal              ₹550");

            System.out.println("\n Press 0 to calculate the total bill");
            System.out.println(" Press 99 to remove the last item");
            System.out.println(" Press 999 to clear the cart");
            System.out.println(" Press 9 to exit without calculating the bill");

            System.out.print("Enter your order: ");
            int order_add = sc.nextInt();

            if (order_add == 1) {
                cart.list.add(500);
                cart.items.add("Family Pizza Combo");
            }

            if (order_add == 2) {
                cart.list.add(400);
                cart.items.add("Family Burger Combo");
            }

            if (order_add == 3) {
                cart.list.add(350);
                cart.items.add("Large Veg Thali");
            }

            if (order_add == 4) {
                cart.list.add(450);
                cart.items.add("Chinese Family Pack");
            }

            if (order_add == 5) {
                cart.list.add(420);
                cart.items.add("Family Pasta Combo");
            }

            if (order_add == 6) {
                cart.list.add(380);
                cart.items.add("Mixed Starter Platter");
            }

            if (order_add == 7) {
                cart.list.add(300);
                cart.items.add("Family Dessert Combo");
            }

            if (order_add == 8) {
                cart.list.add(550);
                cart.items.add("Unlimited Meal");
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