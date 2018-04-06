package com.allen.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by allen on 2017/7/17.
 */
public interface GirlRepository extends CrudRepository<Girl,Integer>,JpaRepository<Girl,Integer> {
}
