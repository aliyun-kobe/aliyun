package com.youyue.controller;

import com.youyue.domain.Account;
import com.youyue.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("/account")
@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("控制层的查询所有执行了...");
        //调用service方法
        List<Account> accountList = accountService.findAll();
        model.addAttribute("list",accountList);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
