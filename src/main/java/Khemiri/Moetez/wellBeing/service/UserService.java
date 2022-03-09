package Khemiri.Moetez.wellBeing.service;

import Khemiri.Moetez.wellBeing.model.User;
import Khemiri.Moetez.wellBeing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // add user
    public User addUser(User user) {
        return userRepository.save(user);
    }

}
