package com.java.api.service;

import com.java.api.dao.PetCategoryRepository;
import com.java.api.model.PetCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PetCategoryServiceImp implements PetCategoryService{
    /**
     * @return
     */
    @Autowired
    private final PetCategoryRepository repository;

    public PetCategoryServiceImp(PetCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PetCategory> showAll() {
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public PetCategory showById(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * @param newCategory
     * @return
     */
    @Override
    public PetCategory addCategory(PetCategory newCategory) {
        return null;
    }

    /**
     * @param id
     * @param modifiedCategory
     * @return
     */
    @Override
    public PetCategory modifyCategory(Long id, PetCategory modifiedCategory) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
