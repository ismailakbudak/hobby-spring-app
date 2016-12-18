package com.roufid.tutorial.dao.postgresql;

import com.roufid.tutorial.entity.postgresql.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}
