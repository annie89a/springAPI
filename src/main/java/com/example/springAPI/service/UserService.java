package com.example.springAPI.service;

import com.example.springAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;
    public UserService ()
    {
       userList = new ArrayList<>();
       User abn = new User(1,"abn", 32, "abn@gmail.com");
       User mys = new User(2,"mys", 30, "mys@gmail.com");
       User wdo = new User(3,"wdo", 31, "wdo@gmail.com");
       User jbr = new User(4,"jbr", 33, "jbr@gmail.com");
       User jik = new User(5,"jik", 34, "jik@gmail.com");
       User jac = new User(6,"jac", 22, "jac@gmail.com");
       userList.addAll(Arrays.asList(abn, mys, wdo, jbr, jik, jac));
    }
    public Optional<User>  getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user: userList)
        {
            if (id==user.getId())
            {
                optional= Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
