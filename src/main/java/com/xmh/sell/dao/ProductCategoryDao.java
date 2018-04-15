package com.xmh.sell.dao;

import com.xmh.sell.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ming
 * @create 2018-04-07 下午9:58
 **/
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer>{

    //jpa用法 findByxxIn
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);



}
