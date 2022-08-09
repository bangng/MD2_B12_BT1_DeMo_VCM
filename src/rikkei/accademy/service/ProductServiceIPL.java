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

}
