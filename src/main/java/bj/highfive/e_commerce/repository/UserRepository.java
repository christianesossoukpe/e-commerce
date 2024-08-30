package bj.highfive.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.highfive.e_commerce.model.User;

public interface  UserRepository extends  JpaRepository<User, Long> {
    
    
}
