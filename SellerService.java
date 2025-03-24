package com.backendshopping.shopping.service;

import com.backendshopping.shopping.model.User;
import com.backendshopping.shopping.repository.CommonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {
    @Autowired
    CommonUserRepository commonUserRepository;
    public void saveUser( User user){
        commonUserRepository.saveUser(user);

    }
}
