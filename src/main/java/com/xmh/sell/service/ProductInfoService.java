package com.xmh.sell.service;

import com.xmh.sell.dto.CartDTO;
import com.xmh.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Ming
 * @create 2018-04-08 下午6:09
 **/
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /** 查找出所有上架的商品 */
    List<ProductInfo> findUpAll();

    /** 分页查找商品 */
    Page<ProductInfo> findAll(Pageable pageable);

    /** 新增商品 */
    ProductInfo save(ProductInfo productInfo);

    /** 加库存 */
    void increaseStock(List<CartDTO> cartDTOList);

    /** 减库存 */
    void decreaseStock(List<CartDTO> cartDTOList);
}
