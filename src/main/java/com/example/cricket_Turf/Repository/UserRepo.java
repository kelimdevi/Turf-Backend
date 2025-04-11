package com.example.cricket_Turf.Repository;

import com.example.cricket_Turf.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
