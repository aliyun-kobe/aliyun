package com.youyue.service.impl;

import com.youyue.dao.IAccountDao;
import com.youyue.domain.Account;
import com.youyue.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层的查询所有执行了...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层的保存操作执行了...");
        accountDao.saveAccount(account);
    }
}
