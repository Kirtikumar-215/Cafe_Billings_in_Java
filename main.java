
import java.util.*;

class cart {

    public static LinkedList<Integer> list = new LinkedList<>();

    public static LinkedList<String> items = new LinkedList<>();
}

class order {

    Scanner sc = new Scanner(System.in);

    int get_order() {
        System.out.print("Enter your order:");
        int order_add = sc.nextInt();
        

        return order_add;
    }
}

class main {

    public static void main(String[] args) {
        manu m1 = new manu();
        m1.show_manu();

        order o1 = new order();
        int selection = o1.get_order();
        switch (selection) {
            case 1:
                Hot h1 = new Hot();
                h1.Hot_item();

                break;

            case 2:
                Cold c1 = new Cold();
                c1.Cold_item();
                break;

            case 3:
                Snacks s1 = new Snacks();
                s1.Snacks_item();
                break;

            case 4:
                Pestrie p1 = new Pestrie();
                p1.Pestrie_item();
                break;

            case 5:
                Fitness f1 = new Fitness();
                f1.Fitness_item();
                break;

            case 6:
                Fast_food ff1 = new Fast_food();
                ff1.Fast_food_item();
                break;

            case 7:
                Date_special ds1 = new Date_special();
                ds1.Date_special_item();
                break;

            case 8:
                Family_special fs1 = new Family_special();
                fs1.Family_special_item();
                break;

            default:
                System.out.println("Invalid selection. Please try again.");


         
        }

    }
}
