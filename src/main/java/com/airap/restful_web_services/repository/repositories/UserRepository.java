package com.airap.restful_web_services.repository.repositories;

import com.airap.restful_web_services.repository.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
