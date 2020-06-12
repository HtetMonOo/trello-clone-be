package com.backend.trelloclone.controllers;

import com.backend.trelloclone.models.Account;
import com.backend.trelloclone.repositories.AccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/accounts")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @GetMapping("{username}")
    public Account getById(@PathVariable String username) {
        return accountRepository.getOne(username);
    }

    @PostMapping()
    public Account save(@RequestBody Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Account update(@RequestBody Account account) {
        Account oldAccount = accountRepository.getOne(account.getUsername());
        BeanUtils.copyProperties(account, oldAccount, "id", "username", "verified");
        return accountRepository.saveAndFlush(oldAccount);
    }

    @RequestMapping(value = "{username}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String username) {
        accountRepository.deleteById(username);
    }
}
