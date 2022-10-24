package com.java.api.dao;

import com.java.api.model.PetCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetCategoryRepository extends JpaRepository<PetCategory,Long> {
}
