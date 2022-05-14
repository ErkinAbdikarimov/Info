package com.example.Info.service;


import com.example.Info.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import mypackage.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(Long iin){
        return userRepository.getUsersByIin(iin);
    }

}
