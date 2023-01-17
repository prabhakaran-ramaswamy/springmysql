package com.springmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmysql.model.BotConfig;

@Repository
public interface BotConfigRepository extends JpaRepository<BotConfig, Long> {
 
}