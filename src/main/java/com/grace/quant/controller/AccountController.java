package com.grace.quant.controller;

import com.grace.quant.entity.Account;
import com.grace.quant.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @PostMapping("/account")
    public int createAccount(@RequestBody Account user) {
        return repository.save(user);
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable long id) {
        return repository.findById(id);
    }




}
