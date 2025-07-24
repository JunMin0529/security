package com.metacoding.securityapp.domain.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void 회원가입(String username, String password, String email) {
        userRepository.save(username, password, email);
    }
}