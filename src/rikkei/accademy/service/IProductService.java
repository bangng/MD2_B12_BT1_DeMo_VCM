package rikkei.accademy.service;

import rikkei.accademy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    List<Product> sortByPrice();


}
