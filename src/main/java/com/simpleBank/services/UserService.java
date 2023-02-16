package com.simpleBank.services;

import com.simpleBank.entities.User;
import com.simpleBank.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUserList() {
        var list = userRepository.findAll();
        System.out.println(list);
        return list;
    }
    public User addUser(User user) {
        try{
            return userRepository.save(user);
        }	catch(Exception e) {
            System.out.println(e.getMessage() + "user service error");
        }
        return null;
    }
}
