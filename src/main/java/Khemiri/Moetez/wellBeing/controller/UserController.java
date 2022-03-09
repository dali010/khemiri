package Khemiri.Moetez.wellBeing.controller;

import Khemiri.Moetez.wellBeing.model.User;
import Khemiri.Moetez.wellBeing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Add user
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
