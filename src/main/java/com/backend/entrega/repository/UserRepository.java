package com.backend.entrega.repository;

import com.backend.entrega.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
