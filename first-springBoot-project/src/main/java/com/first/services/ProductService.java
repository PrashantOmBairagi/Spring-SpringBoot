package com.first.services;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


     public void createProduct(){
         System.out.println("Creating product");
         System.out.println("Product Creation successful");
     }
}
