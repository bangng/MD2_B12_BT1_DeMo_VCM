package rikkei.accademy.view;

import rikkei.accademy.controller.ProductController;
import rikkei.accademy.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();
    public void viewProduct(){

        List<Product> productList = productController.showProductList();
        System.out.println("========STT==================Product==================Price===================");
        for (int i = 0; i < productList.size(); i++) {

            System.out.println("========="+productList.get(i).getId()+"  ==================  "+productList.get(i).getName()+"  ==================  "+productList.get(i).getPrice()+"  ===================  ");

        }
        String backMenu = scanner.nextLine();
        System.out.println("Enter back undo Menu");
        if (backMenu.equalsIgnoreCase("back")){

            new Main();
        }
    }
    public void sortProduct(){

        List<Product> productList = productController.sortProduct();
        System.out.println("========STT==================Product==================Price===================");
        for (int i = 0; i < productList.size(); i++) {

            System.out.println("========="+productList.get(i).getId()+"  ==================  "+productList.get(i).getName()+"  ==================  "+productList.get(i).getPrice()+"  ===================  ");

        }
        String backMenu = scanner.nextLine();
        System.out.println("Enter back undo Menu");
        if (backMenu.equalsIgnoreCase("back")){

            new Main();
        }
    }


}
