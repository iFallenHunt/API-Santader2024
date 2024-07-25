package com.tech.service;

import com.tech.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
