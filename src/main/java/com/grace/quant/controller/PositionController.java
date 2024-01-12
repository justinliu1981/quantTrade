package com.grace.quant.controller;

import com.grace.quant.entity.Position;
import com.grace.quant.repository.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/position")
public class PositionController {

    @Autowired
    private PositionMapper positionMapper;

    @PostMapping("/create")
    public int createPosition(@RequestBody Position position) {

        return positionMapper.insert(position);
    }


    @GetMapping("/get/{id}")
    public Position getPosition(@PathVariable Integer id) {

        return positionMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get")
    public List<Position> getPositionAll() {

        return positionMapper.findAll();
    }

    @PutMapping("/update")
    public int updatePosition(@RequestBody Position position) {
        return positionMapper.updateByPrimaryKey(position);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePosition(@PathVariable("id") Integer id) {
        try {
            positionMapper.deleteByPrimaryKey(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }




}
