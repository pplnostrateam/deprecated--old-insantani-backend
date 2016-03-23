package com.backend.insantani.repository;

import com.backend.insantani.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Adrian on 3/23/2016.
 */
@Repository
public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {

  //  @Query("select u from Vegetable u where u.name = :name")
   // List<Vegetable> findByName(@Param("name") String name);
}
