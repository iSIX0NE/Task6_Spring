package web.service;


import web.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUser();

    void createUser(User user);

    void updateUser(Long id, User updateUser);

    void deleteUser(Long id);

    User getUserById(Long id);
}
