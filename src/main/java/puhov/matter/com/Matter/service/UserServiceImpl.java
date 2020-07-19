package puhov.matter.com.Matter.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import puhov.matter.com.Matter.entity.User;
import puhov.matter.com.Matter.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> read() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User readById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
