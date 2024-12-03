package com.pretty.stockamanagement.User;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServices {
    public List<Users>getUsers(){

    return List.of(new Users(1L, "Pretty",
                             LocalDate.of(2000, 7, 12), "alice12@gmail.com"));}
}
