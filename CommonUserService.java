package com.backendshopping.shopping.service;

import com.backendshopping.shopping.model.User;
import com.backendshopping.shopping.repository.CommonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonUserService {
    @Autowired
    CommonUserRepository commonUserRepository;
    public void saveUser(User user){
        commonUserRepository.saveUser(user);
    }
    public User getUser(int id){
        User user=commonUserRepository.getUser(id);
        return user;
    }
}
