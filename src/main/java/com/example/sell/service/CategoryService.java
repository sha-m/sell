package com.example.sell.service;

import com.example.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * author Administrator
 * Date 2019/5/122:23
 */
public interface CategoryService {

    ProductCategory getOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);

    ProductCategory save(ProductCategory productCategory);
}
