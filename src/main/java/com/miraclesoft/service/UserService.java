package com.miraclesoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miraclesoft.entity.UserDetail;
import com.miraclesoft.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
    UserRepository userDao;

    public List<UserDetail> getAllUsers() {
        return this.userDao.findAll();
    }

    public UserDetail addUser(UserDetail user) {
        return this.userDao.save(user);
    }
}
