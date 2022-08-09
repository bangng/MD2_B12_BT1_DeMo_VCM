package rikkei.accademy.service;

import rikkei.accademy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIPL implements IProductService{
    public static List<Product> listProduct = new ArrayList<Product>();
    static {
        listProduct.add(new Product(001,"chuoi",500));
        listProduct.add(new Product(002,"buoi",350));
        listProduct.add(new Product(001,"xoai",380));
        listProduct.add(new Product(002,"buoi",6000));
        listProduct.add(new Product(001,"chuoi",5540));
        listProduct.add(new Product(002,"nhan",5000));
    }
    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void save(Product product) {
        listProduct.add(product);

    }

    @Override
    public List<Product> sortByPrice() {
        Collections.sort(listProduct);
        return listProduct;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product:
             listProduct) {
            if (product.getName().equals(name)){
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public void remove(int id) {
        listProduct.remove(id -1);

    }

    @Override
    public void edit(int id, String name, int price) {
        listProduct.get(id -1).setName(name);
        listProduct.get(id - 1).setPrice(price);

    }

}
