package com.xmh.sell.service;

import com.xmh.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @author Ming
 * @create 2018-04-08 下午4:50
 **/
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    //findAll
    List<ProductCategory> findAll();

    //findByxxIn
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //save 增加和删除
    ProductCategory save(ProductCategory productCategory);
}
