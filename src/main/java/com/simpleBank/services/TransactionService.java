package com.simpleBank.services;

import com.simpleBank.entities.Transaction;
import com.simpleBank.entities.User;
import com.simpleBank.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public Transaction addTransaction(Transaction transaction) {
        try{
            return transactionRepository.save(transaction);
        }	catch(Exception e) {
            System.out.println(e.getMessage() + "Service error");
        }
        return null;
    }
}
