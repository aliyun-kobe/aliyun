package com.youyue.service;

import com.youyue.domain.Account;

import java.util.List;
/*
账户的业务层接口
 */
public interface IAccountService {
    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
