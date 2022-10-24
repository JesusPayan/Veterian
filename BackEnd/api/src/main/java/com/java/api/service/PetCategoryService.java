package com.java.api.service;

import com.java.api.model.PetCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PetCategoryService {
    public List<PetCategory> showAll();
    public PetCategory showById(Long id);
    public PetCategory addCategory(PetCategory newCategory);
    public PetCategory modifyCategory(Long id,PetCategory modifiedCategory);
    public void deleteCategory(Long id);
}
