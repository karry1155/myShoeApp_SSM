package com.skr.dao;

import com.skr.pojo.Shoes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoeMapper {

    // 增加一双鞋
    int addShoe(Shoes shoes);

    // 删除一双鞋
    int deleteShoe(@Param("identifyID") int id);

    // 更新一本书
    int updateShoe(Shoes shoes);

    // 查询一本书
    Shoes queryShoeById(@Param("identifyID")int id);

    // 查询全部的书
    List<Shoes> queryAllShoe();
}
