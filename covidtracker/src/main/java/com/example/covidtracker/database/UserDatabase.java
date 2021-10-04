package com.example.covidtracker.database;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.covidtracker.models.User;

public class UserDatabase {

    private List<User> users = new ArrayList<>();
    private List<User> admins = new ArrayList<>();

    public User addUser(User user){

        user.setId(UUID.randomUUID().toString());
        users.add(user);
        return User.builder()
            .id(user.getId())
            .build();
    }

    public void markAsAdmin(User user) {

        admins.add(user);
    }
}
