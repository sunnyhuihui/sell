package com.xmh.sell.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ming
 * @create 2018-04-07 下午9:45
 **/
@Entity
@DynamicUpdate  //动态更新,这个注解很重要
@Data   //自动加set get
public class ProductCategory {

    /** 类目名字 */
    @Id  //表示主键
    @GeneratedValue  //表示自增长
    private Integer categoryId;

    /** 类目编号 */
    private Integer categoryType;

    /** 类目名字 */
    private String categoryName;



}
