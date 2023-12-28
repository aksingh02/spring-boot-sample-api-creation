package com.example.sample.repository;

import com.example.sample.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<UserData,Long> {
}
