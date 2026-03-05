package com.aura.api.repository;

import com.aura.api.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuItem, Long> {
}