package by.self.groovy.service;

import by.self.groovy.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    int count();
}
