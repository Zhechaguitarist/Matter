package puhov.matter.com.Matter.service;

import puhov.matter.com.Matter.entity.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> read();

    User update(User user);

    void delete(User user);

    User readById(Long id);

    void deleteById(Long id);
}
