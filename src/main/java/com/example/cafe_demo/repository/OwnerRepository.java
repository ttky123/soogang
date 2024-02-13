package com.example.cafe_demo.repository;

import com.example.cafe_demo.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {


    Optional<Owner> findByPhoneNumber(String phoneNumber);
}