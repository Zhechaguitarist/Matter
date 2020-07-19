package puhov.matter.com.Matter.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import puhov.matter.com.Matter.entity.User;
import puhov.matter.com.Matter.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping
    public List<User> read() {
        return userService.read();
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }

    @GetMapping("/{id}")
    public User readById(@PathVariable(name = "id") Long id) {
        return userService.readById(id);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        userService.deleteById(id);
    }
}
