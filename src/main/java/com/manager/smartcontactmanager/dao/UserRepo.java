package com.manager.smartcontactmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.smartcontactmanager.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
