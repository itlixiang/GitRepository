package com.qq.service.impl;

import com.qq.domain.Account;
import com.qq.mapper.AccountMapper;
import com.qq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 666
 * @Date: 2019/6/26
 * @Time: 20:29
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account login(Account account) {
        Account accounts = accountMapper.login(account);

        return accounts;
    }
}
