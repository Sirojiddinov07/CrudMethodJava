package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }


    public String deleteProduct(int id){
        repository.deleteById(id);
        return id +" successfully deleted";
    }

    public Product uptadeProduct(Product product){
        Product exsistproduct = repository.findById(product.getId()).orElse(null);
        exsistproduct.setName(product.getName());
        exsistproduct.setQuantity(product.getQuantity());
        exsistproduct.setPrice(product.getPrice());
        return repository.save(exsistproduct);
    }
}
