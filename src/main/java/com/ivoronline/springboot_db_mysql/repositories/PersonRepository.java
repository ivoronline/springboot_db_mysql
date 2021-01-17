package com.ivoronline.springboot_db_mysql.repositories;

import com.ivoronline.springboot_db_mysql.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
