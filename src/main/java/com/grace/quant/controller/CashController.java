package com.grace.quant.controller;

import com.grace.quant.entity.Cash;
import com.grace.quant.repository.CashMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cash")
public class CashController {

    @Autowired
    private CashMapper cashMapper;

    @PostMapping("/create")
    public int createCash(@RequestBody Cash cash) {

        return cashMapper.insert(cash);
    }


    @GetMapping("/get/{id}")
    public Cash getCash(@PathVariable Integer id) {

        return cashMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get")
    public List<Cash> getCashAll() {

        return cashMapper.findAll();
    }

    @PutMapping("/update")
    public int updateCash(@RequestBody Cash cash) {
        return cashMapper.updateByPrimaryKey(cash);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCash(@PathVariable("id") Integer id) {
        try {
            cashMapper.deleteByPrimaryKey(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }




}
