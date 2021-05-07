package com.youyue.test;

import com.youyue.dao.IAccountDao;
import com.youyue.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    //@Test
    public void test01FindAll() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }

    //@Test
    public void test01SaveAccount() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        Account account = new Account();
        account.setName("zhangsan");
        account.setMoney(5000);
        accountDao.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
