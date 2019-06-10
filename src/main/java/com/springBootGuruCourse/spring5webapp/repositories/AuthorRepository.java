package com.springBootGuruCourse.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springBootGuruCourse.spring5webapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
