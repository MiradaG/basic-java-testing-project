package com.example.usermanagement.services;

import com.example.usermanagement.models.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String register(User user) {
        // Logic to save user to the database
        return "User registered successfully!";
    }

    public String login(User user) {
        // Logic to validate credentials
        return "Login successful!";
    }
}
