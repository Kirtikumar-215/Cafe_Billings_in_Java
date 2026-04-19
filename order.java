// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

class order {
   Scanner sc;

   order() {
      this.sc = new Scanner(System.in);
   }

   int get_order() {
      System.out.print("Enter your order:");
      int var1 = this.sc.nextInt();
      return var1;
   }
}
