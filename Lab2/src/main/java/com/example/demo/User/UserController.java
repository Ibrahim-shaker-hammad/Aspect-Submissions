package com.example.demo.User;

import com.example.demo.User.dto.CreateUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserDto createUserDto) {
        return this.userService.createUser(createUserDto);
    }

    // **Find User by ID**
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    // **Update User**
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody CreateUserDto userDto) {
        return this.userService.updateUser(id, userDto);
    }

    // **Delete User**
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return this.userService.deleteUser(id);
    }
}
