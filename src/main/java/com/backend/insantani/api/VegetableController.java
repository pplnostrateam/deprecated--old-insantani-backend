package com.backend.insantani.api;

import com.backend.insantani.model.Vegetable;
import com.backend.insantani.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Adrian on 3/23/2016.
 */
@RestController
public class VegetableController {

    @Autowired
    private VegetableService vegetableService;

    @RequestMapping(
            value = "/api/vegetables",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Vegetable>> getVegetables() {

        Collection<Vegetable> vegetables = vegetableService.findAll();
        return new ResponseEntity<Collection<Vegetable>>(vegetables, HttpStatus.OK);
    }

}

