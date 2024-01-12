package com.grace.quant.controller;

import com.grace.quant.entity.Execution;
import com.grace.quant.repository.ExecutionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/execution")
public class ExecutionController {

    @Autowired
    private ExecutionMapper executionMapper;

    @PostMapping("/create")
    public int createExecution(@RequestBody Execution execution) {

        return executionMapper.insert(execution);
    }


    @GetMapping("/get/{id}")
    public Execution getExecution(@PathVariable Integer id) {

        return executionMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get")
    public List<Execution> getExecutionAll() {

        return executionMapper.findAll();
    }

    @PutMapping("/update")
    public int updateExecution(@RequestBody Execution execution) {

        return executionMapper.updateByPrimaryKey(execution);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteExecution(@PathVariable("id") Integer id) {
        try {
            executionMapper.deleteByPrimaryKey(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }


}
