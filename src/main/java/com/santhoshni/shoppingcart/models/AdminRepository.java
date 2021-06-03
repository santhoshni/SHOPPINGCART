package com.santhoshni.shoppingcart.models;

import com.santhoshni.shoppingcart.models.data.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByUsername(String username);
}