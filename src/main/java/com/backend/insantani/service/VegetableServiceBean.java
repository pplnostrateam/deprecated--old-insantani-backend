package com.backend.insantani.service;

import com.backend.insantani.model.Vegetable;
import com.backend.insantani.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Adrian on 3/23/2016.
 */
@Service
public class VegetableServiceBean implements VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Override
    public Collection<Vegetable> findAll() {
        Collection<Vegetable> findAll = vegetableRepository.findAll();
        return findAll;
    }
}
