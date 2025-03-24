package com.backendshopping.shopping.controller;

import com.backendshopping.shopping.model.User;
import com.backendshopping.shopping.service.CommonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonUserController {
//    @GetMapping("/login")
//    String  userLogin(){
//        return "login done !";
//    }
@Autowired
    CommonUserService commonUserService;

    @PostMapping("/user/registration")
    public String registerUser(@RequestBody User user){
        commonUserService.saveUser(user);
        return "User saved Sucessfully";
    }

    @PostMapping("/user/register")
    public void registerUse(@RequestBody User user){
        System.out.print(user);
    }

    @GetMapping("/userId/{id}")
    public User getUserById(@PathVariable int id){
        User user= commonUserService.getUser(id);
        return user;

    }


}
