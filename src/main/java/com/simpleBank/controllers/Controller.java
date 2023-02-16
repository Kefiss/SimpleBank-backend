package com.simpleBank.controllers;

import com.simpleBank.entities.Transaction;
import com.simpleBank.entities.User;
import com.simpleBank.services.TransactionService;
import com.simpleBank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class Controller {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
       return userService.addUser(user);
    }

    @PostMapping("/savet")
    public Transaction saveTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }
}
