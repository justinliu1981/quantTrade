package com.grace.quant.repository;

import com.grace.quant.entity.Account;

import java.util.List;

public interface AccountRepository {

    public int save(Account account);

    public int update(Account account);

    public int deleteById(long id);

    public List<Account> findAll();

    public Account findById(long id);
}
