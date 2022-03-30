package com.topinternacional.linx.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorComercialRepository extends CrudRepository<SetorComercial, SetorComercialPK> {
	
	@Query("select c from SetorComercial c where c.id.codFormato IN (20, 21, 22, 23, 27, 30)")
	public List<SetorComercial> findAllActive();
	
}