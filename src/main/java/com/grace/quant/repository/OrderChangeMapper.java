package com.grace.quant.repository;

import com.grace.quant.entity.OrderChange;

import java.util.List;

public interface OrderChangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderChange row);

    int insertSelective(OrderChange row);

    OrderChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderChange row);

    int updateByPrimaryKey(OrderChange row);

    List<OrderChange> findAll();
}