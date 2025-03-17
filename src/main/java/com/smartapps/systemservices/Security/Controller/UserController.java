package com.smartapps.systemservices.Security.Controller;


import com.smartapps.systemservices.Security.Services.UserServices;
import com.smartapps.systemservices.Security.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")

public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping("/register")
    public Users saveUser(@RequestBody Users user) {
        return userServices.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users users) {
        return userServices.verify(users);
    }
}
