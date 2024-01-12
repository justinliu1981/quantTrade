package com.grace.quant.repository;

import com.grace.quant.entity.Execution;
import com.grace.quant.entity.Position;

import java.util.List;

public interface ExecutionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Execution row);

    int insertSelective(Execution row);

    Execution selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Execution row);

    int updateByPrimaryKey(Execution row);

    List<Execution> findAll();
}