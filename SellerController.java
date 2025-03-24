package com.backendshopping.shopping.controller;

import com.backendshopping.shopping.model.User;
import com.backendshopping.shopping.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class SellerController {
//    @GetMapping("/seller")
//    public  List<String> getSeller(){
//         List<String>seller=new ArrayList<>();
//         seller.add("shubham");
//               return seller;
//    }

//    @GetMapping("/user/{userId}")
//    public String getUserDetails(@PathVariable String userId){
//        return userId;
//    }
//    @GetMapping("/search")
//    public String search(@RequestParam String query_search){
//        return query_search;
//    }
    @Autowired
    SellerService sellerService;
    @PostMapping("/seller/register")
    String saveUser(@RequestBody User user){
        sellerService.saveUser(user);
        return "Seller save Successfully";
    }


}
