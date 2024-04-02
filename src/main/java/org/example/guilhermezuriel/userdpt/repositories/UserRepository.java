package org.example.guilhermezuriel.userdpt.repositories;

import org.example.guilhermezuriel.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
