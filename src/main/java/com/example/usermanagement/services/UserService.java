package com.example.usermanagement.services;

import com.example.usermanagement.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public String createUser(User user) {
        users.add(user);
        return "User created successfully!";
    }

    public String updateUser(Long id, User updatedUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setUsername(updatedUser.getUsername());
                user.setPassword(updatedUser.getPassword());
                user.setRole(updatedUser.getRole());
                return "User updated successfully!";
            }
        }
        return "User not found!";
    }

    public String deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return "User deleted successfully!";
    }
}
