package com.grace.quant.controller;

import com.grace.quant.entity.Order;
import com.grace.quant.repository.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/create")
    public int createOrder(@RequestBody Order order) {

        return orderMapper.insert(order);
    }


    @GetMapping("/get/{id}")
    public Order getOrder(@PathVariable Integer id) {

        return orderMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get")
    public List<Order> getOrderAll() {

        return orderMapper.findAll();
    }

    @PutMapping("/update")
    public int updateOrder(@RequestBody Order order) {

        return orderMapper.updateByPrimaryKey(order);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteOrder(@PathVariable("id") Integer id) {
        try {
            orderMapper.deleteByPrimaryKey(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }


}
