package com.example.Info.repositories;


import com.example.Info.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    mypackage.User getUsersByIin(Long iin);
}
