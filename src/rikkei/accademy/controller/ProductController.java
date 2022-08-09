package rikkei.accademy.controller;

import rikkei.accademy.model.Product;
import rikkei.accademy.service.IProductService;
import rikkei.accademy.service.ProductServiceIPL;

import java.util.List;

public class ProductController {
    IProductService iProductService = new ProductServiceIPL();
   public List<Product> showProductList(){
       return iProductService.findAll();
   }
//   public void createProduct(String productName,int price){
//       iProductService.save(new Product(ProductServiceIPL.listProduct.size() + 1,));
//   }
    public List<Product> sortProduct(){
       return iProductService.sortByPrice();


    }
}
