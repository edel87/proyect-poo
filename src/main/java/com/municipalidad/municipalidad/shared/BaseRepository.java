package com.municipalidad.municipalidad.shared;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<T> extends CrudRepository<T, Long>, PagingAndSortingRepository<T, Long> { }
