package com.pretty.stockamanagement.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/Users")
public class UsersController {
    @Autowired

    private final UserServices UserServices;

    public UsersController(UserServices UserServices){
        this.UserServices = UserServices;
    }
    @GetMapping
    public List<Users> getUsers() {

        return UserServices.getUsers();
    }

}
