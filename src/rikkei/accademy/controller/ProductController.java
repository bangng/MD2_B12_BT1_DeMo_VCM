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
   public void createProduct(String name,int price){
       iProductService.save(new Product(showProductList().size() +1,name, price ));
   }
    public List<Product> sortProduct(){
       return iProductService.sortByPrice();


    }
    public void editProduct(int id, String name, int price){
      iProductService.edit(id,name,price) ;
    }
    public void deleteProduct(int id) {
        iProductService.remove(id);
    }

    public List<Product> searchProduct(String name) {
        return iProductService.search(name);
    }

}
