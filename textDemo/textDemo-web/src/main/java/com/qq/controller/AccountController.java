package com.qq.controller;

import com.qq.domain.Account;
import com.qq.domain.ResultInfo;
import com.qq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 666
 * @Date: 2019/6/26
 * @Time: 20:31
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/checkLogin")
    @ResponseBody
    public Account checkLogin(HttpServletRequest request){
        Account account = (Account) request.getSession().getAttribute("account");
        return account;
    }

    @RequestMapping("/login")
    @ResponseBody
    public ResultInfo login(HttpServletRequest request){
        Account account = new Account();
        String accountID = request.getParameter("accountID");
        String password = request.getParameter("password");
        account.setAccountID(accountID);
        account.setPassword(password);

        ResultInfo resultInfo = new ResultInfo();
        if(accountID == "" || password == ""){
            resultInfo.setFlag(false);
            resultInfo.setMsg("请输入用户名或密码");
        }

        Account accounts = accountService.login(account);

        if(accounts == null){
            resultInfo.setFlag(false);
            resultInfo.setMsg("用户名或密码错误");
        }else {
            resultInfo.setFlag(true);
            request.getSession().setAttribute("account",accounts);
        }
        return resultInfo;

    }

//    @RequestMapping("/login")
//    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        Account account = new Account();
//        String accountID = request.getParameter("accountID");
//        String password = request.getParameter("password");
//        account.setAccountID(accountID);
//        account.setPassword(password);
//        Account accounts = accountService.login(account);
//
//        System.out.println(accounts);
//
//
//        ResultInfo resultInfo = new ResultInfo();
//        if(accounts == null || password == null){
//           resultInfo.setFlag(false);
//           resultInfo.setMsg("用户名或密码错误");
//        }
//        if(accounts!=null){
//            resultInfo.setFlag(true);
//        }
//        ObjectMapper mapper = new ObjectMapper();
//        response.setContentType("application/json;charset=utf-8");
//        String s = mapper.writeValueAsString(resultInfo);
//        response.getWriter().print(s);
//    }

//    @RequestMapping
//    @ResponseBody
//    public Account
}
