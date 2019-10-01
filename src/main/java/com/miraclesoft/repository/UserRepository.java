package com.miraclesoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.miraclesoft.entity.UserDetail;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<UserDetail, Integer> {

}
