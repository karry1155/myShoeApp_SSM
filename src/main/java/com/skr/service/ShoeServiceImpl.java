package com.skr.service;

import com.skr.dao.ShoeMapper;
import com.skr.pojo.Shoes;

import java.util.List;

public class ShoeServiceImpl implements ShoeService {

    private ShoeMapper shoeMapper;

    public ShoeMapper getShoeMapper() {
        return shoeMapper;
    }

    public void setShoeMapper(ShoeMapper shoeMapper) {
        this.shoeMapper = shoeMapper;
    }

    public int addShoe(Shoes shoes) {
        return shoeMapper.addShoe();
    }

    public int deleteShoe(int id) {
        return shoeMapper.deleteShoe(id);
    }

    public int updateShoe(Shoes shoes) {
        return shoeMapper.updateShoe(shoes);
    }

    public Shoes queryShoeById(int id) {
        return shoeMapper.queryShoeById(id);
    }

    public List<Shoes> queryAllShoe() {
        return shoeMapper.queryAllShoe();
    }
}
