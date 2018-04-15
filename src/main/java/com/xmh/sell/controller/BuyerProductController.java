package com.xmh.sell.controller;

import com.xmh.sell.VO.ProductInfoVO;
import com.xmh.sell.VO.ProductVO;
import com.xmh.sell.VO.ResultVO;
import com.xmh.sell.pojo.ProductCategory;
import com.xmh.sell.pojo.ProductInfo;
import com.xmh.sell.service.ProductCategoryService;
import com.xmh.sell.service.ProductInfoService;
import com.xmh.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ming
 * @create 2018-04-08 下午11:39
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;


    /** 显示所有商品，并分类 */
    @GetMapping("/list")
    public ResultVO list(){
        //1查询出所有上架的商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2查询类别
        List<Integer> categoryTypeList = new ArrayList<>();

        //传统方法
        for (ProductInfo productInfo:productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }
        List<ProductCategory> productCategoryList=productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList){
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }


        return ResultVOUtil.success(productVOList);
    }
}
