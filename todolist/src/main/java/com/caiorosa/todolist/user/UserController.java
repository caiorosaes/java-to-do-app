package com.caiorosa.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")

public class UserController {
    
    /**
     * String
     * Integer
     * Double
     * Float
     * char
     * date
     * void
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        
        System.out.println(userModel.name);
    }
}
