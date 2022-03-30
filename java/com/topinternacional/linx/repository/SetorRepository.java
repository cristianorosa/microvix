package com.topinternacional.linx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.topinternacional.linx.model.Setor;

@Repository
public interface SetorRepository extends CrudRepository<Setor, Long> {}