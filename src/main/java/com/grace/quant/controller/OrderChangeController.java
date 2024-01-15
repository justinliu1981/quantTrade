package com.grace.quant.controller;

import com.grace.quant.entity.OrderChange;
import com.grace.quant.repository.OrderChangeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderchange")
public class OrderChangeController {

    @Autowired
    private OrderChangeMapper orderChangeMapper;

    @PostMapping("/create")
    public int createOrderChange(@RequestBody OrderChange orderChange) {

        return orderChangeMapper.insert(orderChange);
    }

    @PostMapping("/create/list")
    public void createOrders(@RequestBody OrderChange[] orderChanges) {
        for (OrderChange orderChange : orderChanges) {
            orderChangeMapper.insert(orderChange);
        }
    }

    @GetMapping("/get/{id}")
    public OrderChange getOrderChange(@PathVariable Integer id) {

        return orderChangeMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get")
    public List<OrderChange> getOrderChangeAll() {

        return orderChangeMapper.findAll();
    }

    @PutMapping("/update")
    public int updateOrderChange(@RequestBody OrderChange orderChange) {

        return orderChangeMapper.updateByPrimaryKey(orderChange);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteOrder(@PathVariable("id") Integer id) {
        try {
            orderChangeMapper.deleteByPrimaryKey(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }


}
