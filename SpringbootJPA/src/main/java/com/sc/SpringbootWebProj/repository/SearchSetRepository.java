package com.sc.SpringbootWebProj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sc.SpringbootWebProj.entity.SearchSet;


public interface SearchSetRepository extends CrudRepository<SearchSet, Long>{

}
