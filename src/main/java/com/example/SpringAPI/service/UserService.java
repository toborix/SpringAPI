package com.example.SpringAPI.service;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Matvey", 21, "matveybor394@gmail.com");
        User user2 = new User(2, "Hans", 21, "hans@gmail.com");
        User user3 = new User(3, "Ida", 21, "ida@gmail.com");
        User user4 = new User(4, "Lars", 21, "lars@gmail.com");
        User user5 = new User(5, "Ban", 21, "bannn@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }
    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user : userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
