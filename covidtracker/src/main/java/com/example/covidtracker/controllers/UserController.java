package com.example.covidtracker.controllers;

import javax.websocket.server.PathParam;

import com.example.covidtracker.Services.UserService;
import com.example.covidtracker.models.Assessment;
import com.example.covidtracker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registerUser(@RequestBody User user,
                                       @RequestHeader("isAdmin") boolean isAdmin){

        return  ResponseEntity.ok(userService.addUser(user, isAdmin));
    }

    @GetMapping("/{userId}")
    public ResponseEntity getRiskPercentage(@PathParam("userId") String userId,
                                            @RequestBody Assessment assessment){

        return ResponseEntity.ok(userService.getRiskPercentage(assessment));
    }

    @PutMapping("/{userId")
    public ResponseEntity updateUserReport(@PathParam("userId") String userId){

        return ResponseEntity.ok("");
    }
}
