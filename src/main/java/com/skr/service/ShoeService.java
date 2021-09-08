package com.skr.service;

import com.skr.pojo.Shoes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoeService {
    // 增加一双鞋
    int addShoe(Shoes shoes);

    // 删除一双鞋
    int deleteShoe(int id);

    // 更新一本书
    int updateShoe(Shoes shoes);

    // 查询一本书
    Shoes queryShoeById(int id);

    // 查询全部的书
    List<Shoes> queryAllShoe();
}
