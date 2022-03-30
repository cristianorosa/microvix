package com.topinternacional.linx.model.nl.view.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.topinternacional.linx.model.nl.view.Cest;

@Repository
public interface CestRepository extends CrudRepository<Cest, Long> {

	Page<Cest> findAll(Pageable pageable);
	
}