package com.codeWithRiyad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeWithRiyad.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
