package rikkei.accademy.view;

import java.util.Scanner;

public class Main {
    private static int getIntegerInput(String s) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println(s);
            input = scanner.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Invalid input");
            }
        } while (!input.matches("\\d+"));
        return Integer.parseInt(input);
    }
    public static void main(String[] args) {

        int choice = -1;
        while (choice != 7) {
            System.out.println("MENU");
            System.out.println("1: showlist product");
            System.out.println("2: add product");
            System.out.println("3: edit product");
            System.out.println("4: delete product");
            System.out.println("5: sort Product");
            System.out.println("6: Exit");

            choice = getIntegerInput("Enter Your Choice");

            switch (choice) {
                case 1:
                    new ProductView().viewProduct();
                    break;
                case 5:
                    new ProductView().sortProduct();

            }
        }

    }

}
