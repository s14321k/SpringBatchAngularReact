package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Sell;

public interface SellRepository extends JpaRepository<Sell, Long> {

}
