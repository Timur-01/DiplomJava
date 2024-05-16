package com.example.DiplomJava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.DiplomJava.entity.ProductType;

import java.util.List;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {

}
