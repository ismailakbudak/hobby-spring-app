package com.roufid.tutorial.dao.postgresql;

import com.roufid.tutorial.entity.postgresql.Phone;
import org.springframework.data.repository.CrudRepository;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface PhoneRepository extends CrudRepository<Phone, Long> {

}
