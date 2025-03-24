package com.backendshopping.shopping.repository;

import com.backendshopping.shopping.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class CommonUserRepository {
    HashMap<Integer,User> userDB=new HashMap<>();

    public void saveUser(User user){
        int id=user.getId();
        userDB.put(id,user);
    }
    public User getUser(int id){
        User user=userDB.get(id);
        return user;
    }
}
