package com.topinternacional.linx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.topinternacional.linx.model.Linha;

@Repository
public interface LinhaRepository extends CrudRepository<Linha, Long> {}